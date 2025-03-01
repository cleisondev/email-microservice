package com.cleisonnunes.email_service.core;

public interface EmaillSenderUseCase {
    void sendEmail(String to, String subject, String body);
}
