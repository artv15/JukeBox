
package net.mcreator.treesalliancejukedisks.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.treesalliancejukedisks.procedure.ProcedureTesterThingsLeggingsTickEvent;
import net.mcreator.treesalliancejukedisks.procedure.ProcedureTesterThingsHelmetTickEvent;
import net.mcreator.treesalliancejukedisks.procedure.ProcedureTesterThingsBootsTickEvent;
import net.mcreator.treesalliancejukedisks.procedure.ProcedureTesterThingsBodyTickEvent;
import net.mcreator.treesalliancejukedisks.creativetab.TabWIPstuff;
import net.mcreator.treesalliancejukedisks.ElementsTreesalliancejukedisksMod;

import java.util.Map;
import java.util.HashMap;

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
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("TESTER_THINGS", "treesalliancejukedisks:tester_set", 5, new int[]{8, 30, 96, 40},
				9, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.anvil.place")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				super.onArmorTick(world, entity, itemstack);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureTesterThingsHelmetTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("tester_thingshelmet").setRegistryName("tester_thingshelmet").setCreativeTab(TabWIPstuff.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureTesterThingsBodyTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("tester_thingsbody").setRegistryName("tester_thingsbody").setCreativeTab(TabWIPstuff.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureTesterThingsLeggingsTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("tester_thingslegs").setRegistryName("tester_thingslegs").setCreativeTab(TabWIPstuff.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureTesterThingsBootsTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("tester_thingsboots").setRegistryName("tester_thingsboots").setCreativeTab(TabWIPstuff.tab));
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
