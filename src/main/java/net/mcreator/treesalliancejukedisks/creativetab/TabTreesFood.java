
package net.mcreator.treesalliancejukedisks.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.treesalliancejukedisks.item.ItemSomeperecshit;
import net.mcreator.treesalliancejukedisks.ElementsTreesalliancejukedisksMod;

@ElementsTreesalliancejukedisksMod.ModElement.Tag
public class TabTreesFood extends ElementsTreesalliancejukedisksMod.ModElement {
	public TabTreesFood(ElementsTreesalliancejukedisksMod instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabtreesfood") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemSomeperecshit.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
