
package net.mcreator.treesalliancejukedisks.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.treesalliancejukedisks.item.ItemHeartoftheend;
import net.mcreator.treesalliancejukedisks.ElementsTreesalliancejukedisksMod;

@ElementsTreesalliancejukedisksMod.ModElement.Tag
public class TabTreesComponents extends ElementsTreesalliancejukedisksMod.ModElement {
	public TabTreesComponents(ElementsTreesalliancejukedisksMod instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabtreescomponents") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemHeartoftheend.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
