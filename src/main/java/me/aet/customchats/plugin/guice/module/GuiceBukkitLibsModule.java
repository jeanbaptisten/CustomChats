package me.aet.customchats.plugin.guice.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import javax.inject.Singleton;
import me.aet.customchats.plugin.MetricsFacade;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import revxrsal.commands.bukkit.BukkitCommandHandler;

public class GuiceBukkitLibsModule extends AbstractModule {

  private final Plugin plugin;

  public GuiceBukkitLibsModule(Plugin plugin) {
    this.plugin = plugin;
  }

  @Provides
  @Singleton
  public BukkitCommandHandler provideCommandHandler() {
    return BukkitCommandHandler.create(this.plugin);
  }

  @Provides
  @Singleton
  public MetricsFacade provideMetrics() {
    return new MetricsFacade((JavaPlugin) this.plugin);
  }
}
