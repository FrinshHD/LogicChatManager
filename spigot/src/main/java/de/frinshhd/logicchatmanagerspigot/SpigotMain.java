package de.frinshhd.logicchatmanagerspigot;

import de.frinshhd.Main;
import de.frinshhd.logicspigotcore.LogicSpigotCoreMain;
import de.frinshhd.logicspigotcore.utils.Translator;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.logging.Level;

public final class SpigotMain extends JavaPlugin {

    private static JavaPlugin INSTANCE;

    public static JavaPlugin getInstance() {
        return INSTANCE;
    }


    @Override
    public void onEnable() {
        INSTANCE = this;

        LogicSpigotCoreMain.onEnable(getInstance());
        try {
            Translator.register(new InputStreamReader(Objects.requireNonNull(Main.class.getClassLoader().getResourceAsStream("messages.properties")), StandardCharsets.UTF_8), "plugins/LogicChatManager/messages.properties");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onDisable() {

    }
}
