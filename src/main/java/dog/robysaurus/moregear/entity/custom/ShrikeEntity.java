package dog.robysaurus.moregear.entity.custom;

import dog.robysaurus.moregear.entity.ai.ShrikeAttackGoal;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.entity.boss.ServerBossBar;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import org.jetbrains.annotations.Nullable;

public class ShrikeEntity extends HostileEntity {
    private static final TrackedData<Boolean> ATTACKING = DataTracker.registerData(ShrikeEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationCooldown = 0;
    public final AnimationState attackAnimationState = new AnimationState();
    public int attackAnimationCooldown = 0;
    private final ServerBossBar bossBar = new ServerBossBar(Text.literal("Shrike").formatted(Formatting.BOLD, Formatting.BLUE), BossBar.Color.BLUE, BossBar.Style.PROGRESS);

    public ShrikeEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void updateLimbs(float posDelta) {
        float f = this.getPose() == EntityPose.STANDING ? Math.min(posDelta * 6.0f, 1.0f) : 0.0f;
        this.limbAnimator.updateLimbs(f, 0.2f);
    }

    private void updateAnimations() {
        if (this.idleAnimationCooldown <= 0) {
            this.idleAnimationCooldown = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.age);
        } else {
            this.idleAnimationCooldown--;
        }
        if(this.isAttacking() && attackAnimationCooldown <= 0){
            this.idleAnimationState.stop();
            attackAnimationCooldown = 40;
            attackAnimationState.start(this.age);
        }else{
            this.attackAnimationCooldown--;
        }
        if(!this.isAttacking()){
            attackAnimationState.stop();
        }
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new ShrikeAttackGoal(this, 2, true));
        this.goalSelector.add(2, new WanderAroundFarGoal(this, 0.5d, 0.005f));
        this.goalSelector.add(3, new LookAtEntityGoal(this, PlayerEntity.class, 100f));
        this.goalSelector.add(4, new LookAroundGoal(this));
        this.targetSelector.add(1, new RevengeGoal(this));
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, PlayerEntity.class, true));
    }

    @Override
    public int getXpToDrop() {
        return 5000;
    }

    @Override
    public void tick() {
        super.tick();
        if(this.getWorld().isClient()){
            updateAnimations();
        }
    }

    @Override
    public void checkDespawn() {
        if (this.getWorld().getDifficulty() == Difficulty.PEACEFUL && this.isDisallowedInPeaceful()) {
            this.discard();
            return;
        }
        this.despawnCounter = 0;
    }

    public static DefaultAttributeContainer.Builder createShrikeAttributes(){
        return HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 1000)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 100)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.5f)
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 0.5)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 5)
                .add(EntityAttributes.GENERIC_ARMOR, 50)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 100)
                .add(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, 50);
    }

    public void setAttacking(boolean attacking){
        this.dataTracker.set(ATTACKING, attacking);
    }

    @Override
    public boolean isAttacking() {
        return this.dataTracker.get(ATTACKING);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(ATTACKING, false);
    }

    @Override
    public boolean isImmuneToExplosion(Explosion explosion) {
        return true;
    }

    @Override
    public boolean isFireImmune() {
        return true;
    }

    @Override
    protected boolean canStartRiding(Entity entity) {
        return false;
    }

    @Override
    public boolean disablesShield() {
        return true;
    }
    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.BLOCK_SCULK_SHRIEKER_STEP;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.BLOCK_SCULK_SHRIEKER_HIT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.BLOCK_SCULK_SHRIEKER_SHRIEK;
    }

    @Override
    public void onStartedTrackingBy(ServerPlayerEntity player) {
        super.onStartedTrackingBy(player);
        this.bossBar.addPlayer(player);
    }

    @Override
    public void onStoppedTrackingBy(ServerPlayerEntity player) {
        super.onStoppedTrackingBy(player);
        this.bossBar.removePlayer(player);
    }

    @Override
    protected void mobTick() {
        super.mobTick();
        this.bossBar.setPercent(this.getHealth() / this.getMaxHealth());
    }
}