package ir.mci.cdrmanagertesti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.messaging.handler.annotation.Payload;

@EnableKafka
@SpringBootApplication
public class CdrmanagertestiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CdrmanagertestiApplication.class, args);


        System.out.println("test");
    }

}
