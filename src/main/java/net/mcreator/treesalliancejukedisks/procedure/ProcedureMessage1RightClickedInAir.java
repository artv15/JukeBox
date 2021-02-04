package net.mcreator.treesalliancejukedisks.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.treesalliancejukedisks.ElementsTreesalliancejukedisksMod;

import java.util.Map;
import java.util.HashMap;

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
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("entity", entity);
			ProcedureMessage.executeProcedure($_dependencies);
		}
	}
}
