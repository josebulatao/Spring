package bars.login.server.jose.r.bulatao.bars.login.server.jose.r.bulatao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerLoginAuthController {

    @GetMapping("/")
    public String testConn(){
        return "i am working";
    }
    @GetMapping("/create")
    public UserCredentials createUser(){
        return new UserCredentials(2,"Jose","josebulatao17","jose","bulatao","User");
    }
}
