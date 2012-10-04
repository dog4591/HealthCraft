package healthcraft.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import net.minecraft.src.Block;
import net.minecraft.src.ModLoader;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.Item;
import cpw.mods.fml.common.SidedProxy;

@Mod(modid = "dog4591healthcraft", name = "Health Craft", version = "0.1.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class healthcraft 
{
 public static Block foodtable;
 
 @SidedProxy(clientSide = "healthcraft.client.ClientProxyhealthcraft", serverSide = "healthcraft.common.CommonProxyhealthcraft")
 public static CommonProxyhealthcraft proxy;
 
 @Init
 public void load(FMLInitializationEvent event)
 {
	 foodtable = new foodtable(4018, 0).setStepSound(Block.soundStoneFootstep).setHardness(3F).setResistance(1.0F).setBlockName("foodtable");
	GameRegistry.registerBlock(foodtable);
	LanguageRegistry.addName(foodtable, "Food Bench");
 }
}
