package com.zk.springbootzk.demos.config;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Destination;

@Service
public class MsgProducer {
    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;
    public void sendMessage(Destination destination, String msg) {
        // 发送消息 参数： 目的地，消息内容
        jmsMessagingTemplate.convertAndSend(destination, msg);
    }
}
