package websocket.webchat.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import websocket.webchat.dto.enums.MessageType;

@AllArgsConstructor
@Getter @Setter
public class ChatMessage {
    private MessageType type;
    private String roomId;
    private String sender;
    private String message;
}
