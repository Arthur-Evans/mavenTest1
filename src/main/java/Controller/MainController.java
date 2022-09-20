package Controller;


import com.jfinal.core.Controller;


public class MainController extends Controller {

    public void hello(){
        renderQrCode("你好世界",200,200);
    }

}
