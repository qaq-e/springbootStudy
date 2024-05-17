package com.zk.springbootzk.demos.service;

import com.zk.springbootzk.demos.config.ActiveMqConfig;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class TopicConsumer1 {
    /**
     * 接收订阅消息
     * @param msg
     */
    @JmsListener(destination = ActiveMqConfig.TOPIC_NAME, containerFactory =
            "topicListenerContainer")
    public void receiveTopicMsg(String msg) {
        System.out.println("收到的消息为：" + msg);
    }
}
