package idv.design.pattern.facade.example1;

/**
 * @author Carl Lu
 */
public class Business {

    public void generate() {
        ConfigModel configModel = ConfigManager.getInstance().getConfigData();
        if(configModel.isNeedGenBusiness()) {
            System.out.println("Generating business code...");
        }
    }

}
