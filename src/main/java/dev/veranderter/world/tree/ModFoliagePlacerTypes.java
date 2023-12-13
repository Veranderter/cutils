package dev.veranderter.world.tree;

import dev.veranderter.CUtils;
import dev.veranderter.mixin.FoliagePlacerTypeInvoker;
import dev.veranderter.world.tree.custom.ChestnutFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class ModFoliagePlacerTypes {
    public static final FoliagePlacerType<?> CHESTNUT_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("chestnut_foliage_placer", ChestnutFoliagePlacer.CODEC);

    public static void register() {
        CUtils.LOGGER.info("Registering Foliage Placer for " + CUtils.MOD_ID);
    }
}
