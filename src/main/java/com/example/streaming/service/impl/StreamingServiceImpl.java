package com.example.streaming.service.impl;

import com.example.streaming.service.StreamingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class StreamingServiceImpl implements StreamingService {

    private static final String FORMAT = "classpath:videos/%s.mp4";
    private static final String FORMAT_AUDIO = "classpath:audios/%s.mp3";

    @Autowired
    private ResourceLoader resourceLoader;

    @Override
    public Mono<Resource> getVideo(String title) {
        return Mono.fromSupplier(() -> resourceLoader.
                getResource(String.format(FORMAT, title)));
    }

    @Override
    public Mono<Resource> getAudio(String title) {
        return Mono.fromSupplier(() -> resourceLoader.
                getResource(String.format(FORMAT_AUDIO, title)));
    }

}
