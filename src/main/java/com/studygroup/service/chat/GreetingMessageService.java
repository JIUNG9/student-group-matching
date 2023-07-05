package com.studygroup.service.chat;

import com.studygroup.domain.ChatMessage;
import com.studygroup.domain.ChatRoom;
import org.springframework.stereotype.Service;

@Service
public interface GreetingMessageService {

  ChatMessage get(String name, ChatRoom chatRoom);
}
