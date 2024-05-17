package com.zk.springbootzk.demos.service;

import com.zk.springbootzk.demos.config.ActiveMqConfig;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class QueueConsumer {
    @JmsListener(destination = ActiveMqConfig.QUEUE_NAME)
    public void receiveQueueMsg(String msg) {
        System.out.println("收到的消息为：" + msg);
    }
}
