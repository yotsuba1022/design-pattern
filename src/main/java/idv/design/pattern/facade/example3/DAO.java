package idv.design.pattern.facade.example3;

/**
 * @author Carl Lu
 */
public class DAO {

    public void generate() {

        ConfigModel configModel = ConfigManager.getInstance().getConfigModel();

        if(configModel.isNeedGenDAO()) {
            System.out.println("Generate DAO template.");
        }

    }

}
