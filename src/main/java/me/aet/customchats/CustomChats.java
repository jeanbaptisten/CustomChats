package me.aet.customchats;

import me.aet.customchats.plugin.MetricsFacade;
import me.aet.customchats.plugin.guice.GuiceInjector;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomChats extends JavaPlugin {

  @Override
  public void onEnable() {
    GuiceInjector.inject(this);
    MetricsFacade metricsFacade = new MetricsFacade(this);
    metricsFacade.activateMetricsCollection();
  }

  @Override
  public void onDisable() {
    // Plugin shutdown logic
  }
}
