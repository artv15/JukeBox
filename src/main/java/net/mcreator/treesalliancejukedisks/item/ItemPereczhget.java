
package net.mcreator.treesalliancejukedisks.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.treesalliancejukedisks.creativetab.TabTreesJukeBox;
import net.mcreator.treesalliancejukedisks.ElementsTreesalliancejukedisksMod;

@ElementsTreesalliancejukedisksMod.ModElement.Tag
public class ItemPereczhget extends ElementsTreesalliancejukedisksMod.ModElement {
	@GameRegistry.ObjectHolder("treesalliancejukedisks:pereczhget")
	public static final Item block = null;
	public ItemPereczhget(ElementsTreesalliancejukedisksMod instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("treesalliancejukedisks:pereczhget", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("pereczhget", ElementsTreesalliancejukedisksMod.sounds.get(new ResourceLocation("treesalliancejukedisks:what")));
			setUnlocalizedName("pereczhget");
			setRegistryName("pereczhget");
			setCreativeTab(TabTreesJukeBox.tab);
		}

		@Override
		@SideOnly(Side.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
