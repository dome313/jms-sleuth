package lolotron.se.jms.sleuth;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class TestJmsListener {

    @JmsListener(destination = "DEV.QUEUE.1")
    public void receiveMessage(HashMap map) {
        System.out.println("Test message received...");
        System.out.println("Content received" + map);
    }

}
