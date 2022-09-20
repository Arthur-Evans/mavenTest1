import com.jfinal.server.undertow.UndertowServer;
import io.javalin.Javalin;
import nxu.MyConfig;

public class app {

    public static void main(String[] args) {
        UndertowServer.start(MyConfig.class,8080,true);
    }
}
