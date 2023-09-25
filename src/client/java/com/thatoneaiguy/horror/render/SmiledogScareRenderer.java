package com.thatoneaiguy.horror.render;

import com.thatoneaiguy.horror.Horror;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;

public class SmiledogScareRenderer extends EntityRenderer {
    public static final Identifier TEXTURE = new Identifier(Horror.MOD_ID, "textures/entity/scares/smiledog");

    public SmiledogScareRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(Entity entity) {
        return TEXTURE;
    }
}
