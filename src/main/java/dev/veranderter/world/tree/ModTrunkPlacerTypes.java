package dev.veranderter.world.tree;

import dev.veranderter.CUtils;
import dev.veranderter.mixin.TrunkPlacerTypeInvoker;
import dev.veranderter.world.tree.custom.ChestnutTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class ModTrunkPlacerTypes {
    public static final TrunkPlacerType<?> CHESTNUT_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("chestnut_trunk_placer", ChestnutTrunkPlacer.CODEC);

    public static void register() {
        CUtils.LOGGER.info("Registering Trunk Placers for " + CUtils.MOD_ID);
    }
}
