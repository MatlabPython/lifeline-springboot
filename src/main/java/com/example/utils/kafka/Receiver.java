package com.example.utils.kafka;

import com.example.entity.Message;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    private final Logger logger = LoggerFactory.getLogger(Receiver.class);
    private Gson gson = new GsonBuilder().create();

    @KafkaListener(topics = "test")
    public void processMessage(String content) {
        Message m = gson.fromJson(content, Message.class);
        logger.info("接受到sender发送的消息:" + m.getMsg() + " 接收到sender发送的时间：" + m.getSendTime());
    }
}
