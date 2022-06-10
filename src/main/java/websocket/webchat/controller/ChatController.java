package websocket.webchat.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import websocket.webchat.dto.ChatRoom;
import websocket.webchat.service.ChatService;

import java.util.List;


@RequiredArgsConstructor
@Controller
public class ChatController {
        private final ChatService chatService;

        @RequestMapping(value = "/chat", method = RequestMethod.GET)
        public String roomList(){
            return "chatList";
        }

        @GetMapping("/api/chat")
        @ResponseBody
        public List<ChatRoom> findAllRoom() {
            return chatService.findAllRoom();
        }
        @PostMapping("/api/chat")
        @ResponseBody
        public ChatRoom createRoom(@RequestParam String name) {
            return chatService.createRoom(name);
        }
}
