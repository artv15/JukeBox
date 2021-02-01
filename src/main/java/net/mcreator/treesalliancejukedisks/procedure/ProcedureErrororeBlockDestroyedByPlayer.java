package net.mcreator.treesalliancejukedisks.procedure;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.treesalliancejukedisks.ElementsTreesalliancejukedisksMod;

import java.util.Map;
import java.util.Iterator;

@ElementsTreesalliancejukedisksMod.ModElement.Tag
public class ProcedureErrororeBlockDestroyedByPlayer extends ElementsTreesalliancejukedisksMod.ModElement {
	public ProcedureErrororeBlockDestroyedByPlayer(ElementsTreesalliancejukedisksMod instance) {
		super(instance, 50);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ErrororeBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ErrororeBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ErrororeBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ErrororeBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ErrororeBlockDestroyedByPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayerMP) {
			Advancement _adv = ((MinecraftServer) ((EntityPlayerMP) entity).mcServer).getAdvancementManager()
					.getAdvancement(new ResourceLocation("treesalliancejukedisks:a_fatal_excepiton_occured"));
			AdvancementProgress _ap = ((EntityPlayerMP) entity).getAdvancements().getProgress(_adv);
			if (!_ap.isDone()) {
				Iterator _iterator = _ap.getRemaningCriteria().iterator();
				while (_iterator.hasNext()) {
					String _criterion = (String) _iterator.next();
					((EntityPlayerMP) entity).getAdvancements().grantCriterion(_adv, _criterion);
				}
			}
		}
		world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
				.getObject(new ResourceLocation("treesalliancejukedisks:errore")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
	}
}
