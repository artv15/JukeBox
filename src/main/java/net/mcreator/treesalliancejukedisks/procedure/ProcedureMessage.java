package net.mcreator.treesalliancejukedisks.procedure;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.treesalliancejukedisks.ElementsTreesalliancejukedisksMod;

import java.util.Map;

@ElementsTreesalliancejukedisksMod.ModElement.Tag
public class ProcedureMessage extends ElementsTreesalliancejukedisksMod.ModElement {
	public ProcedureMessage(ElementsTreesalliancejukedisksMod instance) {
		super(instance, 65);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Message!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer && !entity.world.isRemote) {
			((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Added some various resources to create and fixed armor."), (false));
		}
		if (entity instanceof EntityPlayer && !entity.world.isRemote) {
			((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Nothing special, I think..."), (false));
		}
		if (entity instanceof EntityPlayer && !entity.world.isRemote) {
			((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Right?"), (false));
		}
	}
}
