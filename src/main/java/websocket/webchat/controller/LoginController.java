package websocket.webchat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import websocket.webchat.dto.User;
import websocket.webchat.service.UserServiceImpl;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/", method = {RequestMethod.GET,RequestMethod.POST})
    public String login(HttpSession session
            , @RequestParam(value = "id", required = false) String id
            , @RequestParam(value = "password", required = false) String password) {
        if (id != null && password != null) {
            if (userService.login(new User(id, password)) == 1) {
                session.setAttribute("userID", id);
                return "redirect:chat";
            }
        }
        return "index";
    }

    @RequestMapping(value = "/register", method = {RequestMethod.GET,RequestMethod.POST})
    public String register(@RequestParam(value = "id") String id, @RequestParam(value = "password") String password) {
        //register test (no page)
        userService.save(new User("1234", "1234"));
        return "redirect:/";
    }
}
