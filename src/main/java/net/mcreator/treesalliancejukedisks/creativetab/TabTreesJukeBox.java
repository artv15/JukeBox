
package net.mcreator.treesalliancejukedisks.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.treesalliancejukedisks.ElementsTreesalliancejukedisksMod;

@ElementsTreesalliancejukedisksMod.ModElement.Tag
public class TabTreesJukeBox extends ElementsTreesalliancejukedisksMod.ModElement {
	public TabTreesJukeBox(ElementsTreesalliancejukedisksMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabtreesjukebox") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Items.RECORD_CHIRP, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
