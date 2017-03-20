package idv.design.pattern.facade.example2;

/**
 * @author Carl Lu
 */
public class Facade {

    public void callFacade() {
        ModuleA moduleA = new ModuleAImpl();
        ModuleB moduleB = new ModuleBImpl();
        ModuleC moduleC = new ModuleCImpl();
        moduleA.callModuleA();
        moduleB.callModuleB();
        moduleC.callModuleC();
    }

}
