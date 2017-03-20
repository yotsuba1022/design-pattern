package idv.design.pattern.facade.example3;

/**
 * @author Carl Lu
 */
public class Presentation {

    public void generate() {

        ConfigModel configModel = ConfigManager.getInstance().getConfigModel();

        if(configModel.isNeedGenPresentation()) {
            System.out.println("Generate presentation template.");
        }

    }

}
