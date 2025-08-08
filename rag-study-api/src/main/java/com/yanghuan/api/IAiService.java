package com.yanghuan.api;

import org.springframework.ai.chat.ChatResponse;
import reactor.core.publisher.Flux;

/**
 * @description
 * @Author : yanghuan
 * @create 2025/8/8 15:52
 */
public interface IAiService {
    ChatResponse generate(String model, String message);

    Flux<ChatResponse> generateStream(String model, String message);
    public Flux<ChatResponse> generateStreamRag( String model, String ragTag, String message);
}
