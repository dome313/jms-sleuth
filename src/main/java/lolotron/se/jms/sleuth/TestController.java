package lolotron.se.jms.sleuth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    JmsTemplate jmsTemplate;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/test")
    public void sendMessage() {
        System.out.println("Sending a test message");
        Map<String, String> map = new HashMap<>();
        map.put("hello", "world");
        jmsTemplate.convertAndSend("DEV.QUEUE.1", map);
    }

}
