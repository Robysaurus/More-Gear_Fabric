package dog.robysaurus.moregear;

import dog.robysaurus.moregear.util.ModModelPredicateProvider;
import net.fabricmc.api.ClientModInitializer;

public class MoreGearClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelPredicateProvider.registerModModels();
    }
}