package Controller;


import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
import com.jfinal.core.Path;


@Path(value = "/",viewPath = "/")
public class MainController extends Controller {

    public void index(){
        renderHtml("<h2>It works<h2>");
    }

    public void bye(){

        renderQrCode("你好世界",200,200);
    }

    @ActionKey("/hello")
    public void zaijian(){
        String username = get("username");
        String gender = get("Gender","male");
        String title  = gender.equalsIgnoreCase("male")?"先生":"女士";

        Integer age = getParaToInt("age",0);
        if(age<18){
            renderHtml("未成年无法访问");
        }else{
            renderHtml("<H2>Hello" +username+title+
                    "<H2>");
        }

    }




}
