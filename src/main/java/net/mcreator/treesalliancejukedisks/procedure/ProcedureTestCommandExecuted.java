package net.mcreator.treesalliancejukedisks.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.treesalliancejukedisks.ElementsTreesalliancejukedisksMod;

import java.util.Map;
import java.util.Iterator;

@ElementsTreesalliancejukedisksMod.ModElement.Tag
public class ProcedureTestCommandExecuted extends ElementsTreesalliancejukedisksMod.ModElement {
	public ProcedureTestCommandExecuted(ElementsTreesalliancejukedisksMod instance) {
		super(instance, 43);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TestCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).capabilities.isCreativeMode : false)) {
			if ((!(((entity instanceof EntityPlayerMP) && ((entity).world instanceof WorldServer))
					? ((EntityPlayerMP) entity).getAdvancements()
							.getProgress(((WorldServer) (entity).world).getAdvancementManager()
									.getAdvancement(new ResourceLocation("treesalliancejukedisks:tester")))
							.isDone()
					: false))) {
				if (entity instanceof EntityPlayerMP) {
					Advancement _adv = ((MinecraftServer) ((EntityPlayerMP) entity).mcServer).getAdvancementManager()
							.getAdvancement(new ResourceLocation("treesalliancejukedisks:tester"));
					AdvancementProgress _ap = ((EntityPlayerMP) entity).getAdvancements().getProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemaningCriteria().iterator();
						while (_iterator.hasNext()) {
							String _criterion = (String) _iterator.next();
							((EntityPlayerMP) entity).getAdvancements().grantCriterion(_adv, _criterion);
						}
					}
				}
				if (entity instanceof EntityPlayer && !entity.world.isRemote) {
					((EntityPlayer) entity).sendStatusMessage(new TextComponentString("I don't feel very well..."), (true));
				}
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 1200, (int) 255, (false), (false)));
			} else {
				if (entity instanceof EntityPlayer && !entity.world.isRemote) {
					((EntityPlayer) entity).sendStatusMessage(new TextComponentString("You are a tester already!"), (true));
				}
			}
		} else {
			if ((!(((entity instanceof EntityPlayerMP) && ((entity).world instanceof WorldServer))
					? ((EntityPlayerMP) entity).getAdvancements()
							.getProgress(((WorldServer) (entity).world).getAdvancementManager()
									.getAdvancement(new ResourceLocation("treesalliancejukedisks:tester")))
							.isDone()
					: false))) {
				if (entity instanceof EntityPlayer && !entity.world.isRemote) {
					((EntityPlayer) entity)
							.sendStatusMessage(new TextComponentString("Hey! Enable creative gamemode to receive access to WIP stuff!"), (true));
				}
			} else {
				if (entity instanceof EntityPlayer && !entity.world.isRemote) {
					((EntityPlayer) entity).sendStatusMessage(new TextComponentString("You are a tester already!"), (true));
				}
			}
		}
	}
}
