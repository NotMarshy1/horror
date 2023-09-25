package com.thatoneaiguy.horror.entity;

import com.thatoneaiguy.horror.Horror;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.registry.Registry;

public class HorrorEntities {

    public static EntityType<SmiledogScare> SMILEDOGSCARE;

    public static void registerDatEntity() {

        SMILEDOGSCARE = register("smiledogscare", FabricEntityTypeBuilder.create(SpawnGroup.MISC, SmiledogScare::new).dimensions(EntityDimensions.fixed(0.1F, 0.1F)).fireImmune().trackRangeBlocks(4).trackedUpdateRate(10).build());

        FabricDefaultAttributeRegistry.register(HorrorEntities.SMILEDOGSCARE, SmiledogScare.createEntityAttributes());


    }

    private static <T extends Entity> EntityType<T> register(String s, EntityType<T> entityType) {
        return Registry.register(Registry.ENTITY_TYPE, Horror.MOD_ID + ":" + s, entityType);
    }

}