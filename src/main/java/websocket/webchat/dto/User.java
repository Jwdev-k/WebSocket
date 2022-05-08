package websocket.webchat.dto;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "account")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String uid;
    private String password;

    @Builder
    public User(String uid, String password) {
        this.uid = uid;
        this.password = password;
    }
}

