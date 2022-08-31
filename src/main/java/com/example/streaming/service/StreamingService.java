package com.example.streaming.service;

import org.springframework.core.io.Resource;
import reactor.core.publisher.Mono;


public interface StreamingService {

    public Mono<Resource> getVideo(String title);

    public Mono<Resource> getAudio(String title);


}
