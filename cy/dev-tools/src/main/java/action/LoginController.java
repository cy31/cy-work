package action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * LoginController
 *
 * @author cy
 * @date 16-4-24 下午11:05
 */

@Controller
public class LoginController {
    @RequestMapping(value = "/login.html")
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/loginCheck.html")
    public ModelAndView loginCheck(HttpServletRequest request, LoginCommand loginCommand) {
        return new ModelAndView("main");
    }
}
