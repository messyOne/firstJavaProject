package first;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class StartController {
    @RequestMapping(value = "/start", method = RequestMethod.POST)
    public HttpEntity<Player> greeting(@RequestBody Player player, HttpSession session) {

        session.setAttribute("player", player);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
