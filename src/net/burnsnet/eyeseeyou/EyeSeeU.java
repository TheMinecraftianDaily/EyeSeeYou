package net.burnsnet.eyeseeyou;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public final class EyeSeeU extends JavaPlugin{
	
	@Override
    public void onEnable(){
		getLogger().info("EyeSeeYou enabled.");
        // TODO Insert logic to be performed when the plugin is enabled
    }
 
    @Override
    public void onDisable() {
    	getLogger().info("EyeSeeYou disabled.");
        // TODO Insert logic to be performed when the plugin is disabled
    }

}
