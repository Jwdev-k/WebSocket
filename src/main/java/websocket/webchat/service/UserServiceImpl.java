package websocket.webchat.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import websocket.webchat.dto.User;
import websocket.webchat.repository.UserRepository;

import javax.annotation.PostConstruct;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public void save(User user) { // INSERT INTO
        userRepository.save(user);
    }

    @Override
    public int login(User user) { // SELECT * FROM
        User test = userRepository.findByUid(user.getUid());
        if (test != null && test.getPassword().equals(user.getPassword())) {
            log.debug(test.getUid() + "님이 로그인.");
            return 1;
        } else if (test != null) {
            log.debug(test.getUid() + "님의 패스워드가 틀렸습니다.");
            return 0;
        } else {
            log.debug("아이디가 존재하지 않습니다.");
            return -1;
        }
    }
}
