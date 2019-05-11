package me.calebbassham.scenario;

import me.calebbassham.scenariomanager.ScenarioManager;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        ScenarioManager.register(new GoneFishing(), this);
    }

}
