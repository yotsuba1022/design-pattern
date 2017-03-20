package idv.design.pattern.facade.example1;

/**
 * @author Carl Lu
 */
public class DAO {

    public void generate() {
        ConfigModel configModel = ConfigManager.getInstance().getConfigData();
        if(configModel.isNeedGenDAO()) {
            System.out.println("Generating DAO code...");
        }
    }

}
