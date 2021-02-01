
package net.mcreator.treesalliancejukedisks.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.treesalliancejukedisks.ElementsTreesalliancejukedisksMod;

@ElementsTreesalliancejukedisksMod.ModElement.Tag
public class ItemTesterThings extends ElementsTreesalliancejukedisksMod.ModElement {
	@GameRegistry.ObjectHolder("treesalliancejukedisks:tester_thingshelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("treesalliancejukedisks:tester_thingsbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("treesalliancejukedisks:tester_thingslegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("treesalliancejukedisks:tester_thingsboots")
	public static final Item boots = null;
	public ItemTesterThings(ElementsTreesalliancejukedisksMod instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("TESTER_THINGS", "treesalliancejukedisks:tester_set", 100, new int[]{2, 5, 6, 2},
				9, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.anvil.place")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("tester_thingshelmet")
				.setRegistryName("tester_thingshelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("tester_thingsbody")
				.setRegistryName("tester_thingsbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("tester_thingslegs")
				.setRegistryName("tester_thingslegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("tester_thingsboots")
				.setRegistryName("tester_thingsboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("treesalliancejukedisks:tester_thingshelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("treesalliancejukedisks:tester_thingsbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("treesalliancejukedisks:tester_thingslegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("treesalliancejukedisks:tester_thingsboots", "inventory"));
	}
}
