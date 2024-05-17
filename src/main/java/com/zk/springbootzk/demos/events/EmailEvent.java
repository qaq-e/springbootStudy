package com.zk.springbootzk.demos.events;

import lombok.Data;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

public class EmailEvent extends ApplicationEvent {

    private String text;

    private String subject;

    public EmailEvent(Object source) {
        super(source);
    }

    public EmailEvent(Object source,String text,String subject) {
        super(source);
        this.text = text;
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
