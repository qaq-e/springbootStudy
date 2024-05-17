package com.zk.springbootzk.demos.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class EmailEventListenter implements ApplicationListener<EmailEvent> {

    @Resource
    private JavaMailSender javaMailSender;

    @Override
    public void onApplicationEvent(EmailEvent event) {
        SimpleMailMessage message=new SimpleMailMessage();
        message.setText(event.getText());
        message.setSubject(event.getSubject());
        message.setTo("kangcu48@gmail.com");
        //发送邮件的一方邮箱
        message.setFrom("1544761998@qq.com");
        javaMailSender.send(message);
        System.out.println("我已经发过邮件了");
    }
}
