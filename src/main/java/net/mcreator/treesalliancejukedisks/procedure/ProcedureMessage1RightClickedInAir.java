package net.mcreator.treesalliancejukedisks.procedure;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.treesalliancejukedisks.ElementsTreesalliancejukedisksMod;

import java.util.Map;

@ElementsTreesalliancejukedisksMod.ModElement.Tag
public class ProcedureMessage1RightClickedInAir extends ElementsTreesalliancejukedisksMod.ModElement {
	public ProcedureMessage1RightClickedInAir(ElementsTreesalliancejukedisksMod instance) {
		super(instance, 41);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Message1RightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer && !entity.world.isRemote) {
			((EntityPlayer) entity).sendStatusMessage(new TextComponentString("I have created some sort of armor..."), (false));
		}
		if (entity instanceof EntityPlayer && !entity.world.isRemote) {
			((EntityPlayer) entity).sendStatusMessage(new TextComponentString("I dunno what have i done..."), (false));
		}
	}
}
