
package net.mcreator.treesalliancejukedisks.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.treesalliancejukedisks.item.ItemMessage1;
import net.mcreator.treesalliancejukedisks.ElementsTreesalliancejukedisksMod;

@ElementsTreesalliancejukedisksMod.ModElement.Tag
public class TabWIPstuff extends ElementsTreesalliancejukedisksMod.ModElement {
	public TabWIPstuff(ElementsTreesalliancejukedisksMod instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabwipstuff") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemMessage1.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
