package idv.design.pattern.facade.example4;

/**
 * @author Carl Lu
 */
public class ConfigManager {

    private static ConfigManager configManager = null;
    private static ConfigModel configModel = null;

    private ConfigManager() {

    }

    public static ConfigManager getInstance() {
        if(configManager == null) {
            configManager = new ConfigManager();
            configModel = new ConfigModel();
        }
        return configManager;
    }

    public ConfigModel getConfigModel() {
        return configModel;
    }

}
