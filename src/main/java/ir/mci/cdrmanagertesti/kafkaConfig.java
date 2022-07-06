package ir.mci.cdrmanagertesti;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.internals.Topic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class kafkaConfig {

    public kafkaConfig() {
    }

    @Bean
    public NewTopic testTopic(){
        return new NewTopic("mimi",1,(short)1);
    }
}
