package websocket.webchat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import websocket.webchat.dto.User;
import websocket.webchat.service.UserServiceImpl;

@Controller
public class ChatController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/", method = {RequestMethod.GET,RequestMethod.POST})
    public String Login(@RequestParam(value = "id", required = false) String id
            , @RequestParam(value = "password", required = false) String password) {
        if (id != null && password != null) {
            if (userService.login(new User(id, password)) == 1) {
                return "chat";
            }
        }
        return "index";
    }
}
