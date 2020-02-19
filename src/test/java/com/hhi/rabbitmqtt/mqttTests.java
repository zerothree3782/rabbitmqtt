package com.hhi.rabbitmqtt;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class mqttTests {
    @Test
    public void mqttTest() {
        MqttTest mqt = new MqttTest();
        mqt.run();
    }
}
