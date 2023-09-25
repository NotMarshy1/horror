package com.thatoneaiguy.horror;

import com.thatoneaiguy.horror.entity.HorrorEntities;
import com.thatoneaiguy.horror.render.SmiledogScareRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class HorrorClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		EntityRendererRegistry.register(HorrorEntities.SMILEDOGSCARE, SmiledogScareRenderer::new);

	}
}