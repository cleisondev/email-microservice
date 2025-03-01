package com.cleisonnunes.email_service.application;

import com.cleisonnunes.email_service.adapters.EmailSenderGateway;
import com.cleisonnunes.email_service.core.EmaillSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmaillSenderUseCase {

    private final EmailSenderGateway emailSendergateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailSendergateway) {
        this.emailSendergateway = emailSendergateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSendergateway.sendEmail(to, subject, body);
    }
}
