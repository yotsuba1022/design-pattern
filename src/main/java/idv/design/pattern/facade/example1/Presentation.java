package idv.design.pattern.facade.example1;

/**
 * @author Carl Lu
 */
public class Presentation {

    public void generate() {
        ConfigModel configModel = ConfigManager.getInstance().getConfigData();
        if(configModel.isNeedGenPresentation()) {
            System.out.println("Generating presentation code...");
        }
    }

}
