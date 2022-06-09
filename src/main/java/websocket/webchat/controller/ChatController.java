package websocket.webchat.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import websocket.webchat.dto.ChatMessage;
import websocket.webchat.dto.ChatRoom;
import websocket.webchat.service.ChatService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/chat")
public class ChatController {
        private final ChatService chatService;

        @PostMapping
        public ChatRoom createRoom(@RequestParam String name) {
            return chatService.createRoom(name);
        }

        @GetMapping
        public List<ChatRoom> findAllRoom() {
            return chatService.findAllRoom();
        }
}
