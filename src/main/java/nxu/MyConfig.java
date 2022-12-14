package nxu;

import Controller.MainController;
import com.jfinal.config.*;
import com.jfinal.template.Engine;


public class MyConfig extends JFinalConfig {
    @Override
    public void configConstant(Constants constants) {
    }
    @Override
    public void configRoute(Routes routes) {
        routes.add("/", MainController.class);
    }
    @Override
    public void configEngine(Engine engine) {
    }

    @Override
    public void configPlugin(Plugins plugins) {

    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }

}
