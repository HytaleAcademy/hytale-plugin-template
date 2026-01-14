package hytale.academy.template;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import hytale.academy.template.command.PingPlayerCommand;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public class TemplatePlugin extends JavaPlugin {

    public TemplatePlugin(@NonNullDecl JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        getCommandRegistry().registerCommand(new PingPlayerCommand());
    }
}
