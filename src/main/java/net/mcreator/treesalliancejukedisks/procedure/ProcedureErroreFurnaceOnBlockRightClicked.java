package net.mcreator.treesalliancejukedisks.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.treesalliancejukedisks.gui.GuiErroreRefiner;
import net.mcreator.treesalliancejukedisks.TreesalliancejukedisksMod;
import net.mcreator.treesalliancejukedisks.ElementsTreesalliancejukedisksMod;

import java.util.Map;

@ElementsTreesalliancejukedisksMod.ModElement.Tag
public class ProcedureErroreFurnaceOnBlockRightClicked extends ElementsTreesalliancejukedisksMod.ModElement {
	public ProcedureErroreFurnaceOnBlockRightClicked(ElementsTreesalliancejukedisksMod instance) {
		super(instance, 53);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ErroreFurnaceOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ErroreFurnaceOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ErroreFurnaceOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ErroreFurnaceOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ErroreFurnaceOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityPlayerMP) && ((entity).world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) (entity).world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("treesalliancejukedisks:tester")))
						.isDone()
				: false)) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).openGui(TreesalliancejukedisksMod.instance, GuiErroreRefiner.GUIID, world, x, y, z);
		} else {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(
						new TextComponentString("Tester privelegies required. Contact server admin or run /test command in creative mode"), (false));
			}
		}
	}
}
