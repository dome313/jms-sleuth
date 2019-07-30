package lolotron.se.jms.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@SpringBootApplication
public class JmsSleuthApplication {

  public static void main(final String[] args) {
    SpringApplication.run(JmsSleuthApplication.class, args);
  }

}
