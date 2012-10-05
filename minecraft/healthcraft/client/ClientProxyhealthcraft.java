package healthcraft.client;

import healthcraft.common.CommonProxyhealthcraft;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxyhealthcraft extends CommonProxyhealthcraft
{
 @Override
 public void registerRenderThings()
 {
	 MinecraftForgeClient.preloadTexture("/HealthTextures.png");
 }
}
