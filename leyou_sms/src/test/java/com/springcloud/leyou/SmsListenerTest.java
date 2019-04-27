package com.springcloud.leyou;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bystander
 * @date 2018/9/29
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SmsListenerTest {


    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void listenVerifyCode() throws InterruptedException {
        Map<String,String> map = new HashMap<>();
       // map.put("name","北极星的夜晚");
        map.put("phone", "18639458394");
        map.put("code", "890989");
        amqpTemplate.convertAndSend("ly.sms.exchange", "sms.verify.code", map);

        Thread.sleep(15000);
    }
}