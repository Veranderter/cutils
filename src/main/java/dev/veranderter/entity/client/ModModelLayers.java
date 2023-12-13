package dev.veranderter.entity.client;

import dev.veranderter.CUtils;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer PORCUPINE =
            new EntityModelLayer(new Identifier(CUtils.MOD_ID, "porcupine"), "main");
}
