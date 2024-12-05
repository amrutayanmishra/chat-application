package com.example.chatapp.controllers;

import com.example.chatapp.models.Message;
import com.example.chatapp.repositories.MessageRepository;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final MessageRepository messageRepository;

    public MessageController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    public Message getContent(Message message) {
        messageRepository.save(message);
        return message;
    }
}