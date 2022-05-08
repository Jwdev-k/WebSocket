package websocket.webchat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import websocket.webchat.dto.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUid (String uid);
}
