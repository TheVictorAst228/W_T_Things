package net.mcreator.test.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.test.TestModElements;

import java.util.Map;

@TestModElements.ModElement.Tag
public class ShawarmaFoodEatenProcedure extends TestModElements.ModElement {
	public ShawarmaFoodEatenProcedure(TestModElements instance) {
		super(instance, 3);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure ShawarmaFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double random = 0;
		for (int index0 = 0; index0 < (int) (99); index0++) {
			random = (double) (Math.round(Math.random()) + (random));
		}
		if ((5 > (random))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 60, (int) 1, (false), (false)));
		}
	}
}
