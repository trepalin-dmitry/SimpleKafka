package com.example.config;

import com.example.dto.UserDto;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.Map;

public class SimpleKafkaTemplate extends KafkaTemplate<Long, UserDto> {
    public SimpleKafkaTemplate(ProducerFactory<Long, UserDto> producerFactory) {
        super(producerFactory);
    }

    public SimpleKafkaTemplate(ProducerFactory<Long, UserDto> producerFactory, Map<String, Object> configOverrides) {
        super(producerFactory, configOverrides);
    }

    public SimpleKafkaTemplate(ProducerFactory<Long, UserDto> producerFactory, boolean autoFlush) {
        super(producerFactory, autoFlush);
    }

    public SimpleKafkaTemplate(ProducerFactory<Long, UserDto> producerFactory, boolean autoFlush, Map<String, Object> configOverrides) {
        super(producerFactory, autoFlush, configOverrides);
    }
}
