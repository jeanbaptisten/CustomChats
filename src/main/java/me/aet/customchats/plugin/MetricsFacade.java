package me.aet.customchats.plugin;

import javax.inject.Inject;
import javax.inject.Singleton;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

@Singleton
public class MetricsFacade {

  private static final int BSTATS_ID = 16899;

  private final JavaPlugin javaPlugin;

  @Inject
  public MetricsFacade(@NotNull JavaPlugin javaPlugin) {
    this.javaPlugin = javaPlugin;
  }

  public void activateMetricsCollection() {
    new Metrics(javaPlugin, BSTATS_ID);
  }
}
