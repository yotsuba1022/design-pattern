package idv.design.pattern.facade.example3;

/**
 * @author Carl Lu
 */
public class Business {

    public void generate() {

        ConfigModel configModel = ConfigManager.getInstance().getConfigModel();

        if(configModel.isNeedGenBusiness()) {
            System.out.println("Generate business template.");
        }

    }

}
