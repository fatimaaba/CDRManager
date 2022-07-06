package ir.mci.cdrmanagertesti;

import lombok.extern.slf4j.Slf4j;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Slf4j
@Component
public class ReadRecordOfKafka {


    @Autowired
    private FileWriter fileWriter;

    public ReadRecordOfKafka(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void topicProcess(@Payload List<String> payloads,
                             Acknowledgment acknowledgmen,
                             @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partion) {

        log.info("Read from KAFKA");


        for (String payload : payloads) {
            try {
                System.out.println("raw data is :" + payload);
                fileWriter.cdrManageFormat(payload);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }


        acknowledgmen.acknowledge();

    }


}
