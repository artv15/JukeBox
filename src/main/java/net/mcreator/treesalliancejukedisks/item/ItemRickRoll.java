
package net.mcreator.treesalliancejukedisks.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.treesalliancejukedisks.creativetab.TabTreesJukeBox;
import net.mcreator.treesalliancejukedisks.ElementsTreesalliancejukedisksMod;

@ElementsTreesalliancejukedisksMod.ModElement.Tag
public class ItemRickRoll extends ElementsTreesalliancejukedisksMod.ModElement {
	@GameRegistry.ObjectHolder("treesalliancejukedisks:rickroll")
	public static final Item block = null;
	public ItemRickRoll(ElementsTreesalliancejukedisksMod instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("treesalliancejukedisks:rickroll", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("rickroll", ElementsTreesalliancejukedisksMod.sounds.get(new ResourceLocation("treesalliancejukedisks:rickisbad")));
			setUnlocalizedName("rickroll");
			setRegistryName("rickroll");
			setCreativeTab(TabTreesJukeBox.tab);
		}
	}
}
