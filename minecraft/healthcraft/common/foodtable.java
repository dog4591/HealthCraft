package healthcraft.common;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class foodtable extends Block
{
 public foodtable(int par1, int par2)
 {
	 super(par1, par2, Material.rock);
	 this.setCreativeTab(CreativeTabs.tabDecorations);
 }
 
 public String getTextureFile()
 {
	 return "/HealthTextures.png";
 }
}
