package first;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class PlayerController {
    @RequestMapping(value = "/player", method = RequestMethod.GET)
    public HttpEntity<Player> greeting(HttpSession session) {
        return new ResponseEntity<Player>((Player)session.getAttribute("player"), HttpStatus.OK);
    }
}
