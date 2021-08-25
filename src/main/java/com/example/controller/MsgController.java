package com.example.controller;

import com.example.config.SimpleKafkaTemplate;
import com.example.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("msg")
public class MsgController {

    @Autowired
    private SimpleKafkaTemplate kafkaTemplate;

    @PostMapping
    public void sendOrder(@RequestParam("msgId") Long msgId, @RequestBody UserDto msg) {
        ListenableFuture<SendResult<Long, UserDto>> future = kafkaTemplate.send("msg", msgId, msg);
        future.addCallback(System.out::println, System.err::println);
        kafkaTemplate.flush();
    }
}

