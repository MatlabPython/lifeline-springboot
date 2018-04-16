package com.example.utils.kafka;

import com.example.entity.Message;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import java.util.Date;
import java.util.UUID;

@Component
public class Sender {

    private final Logger logger = LoggerFactory.getLogger(Sender.class);

    @Autowired
    private KafkaTemplate kafkaTemplate;

    private Gson gson = new GsonBuilder().create();

    public void sendMessage() {
        Message m = new Message();
        m.setId(System.currentTimeMillis());
        m.setMsg(UUID.randomUUID().toString());
        m.setSendTime(new Date());
        kafkaTemplate.send("test", gson.toJson(m));
        logger.info("sender successfull");
    }
}
