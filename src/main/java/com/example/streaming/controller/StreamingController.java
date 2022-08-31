package com.example.streaming.controller;

import com.example.streaming.service.StreamingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class StreamingController {

    @Autowired
    private StreamingService service;


    @GetMapping(value = "video/{title}", produces = "video/mp4")
    public Mono<Resource> getVideos(@PathVariable String title, @RequestHeader("Range") String range) {
        System.out.println(title + " range in bytes() : " + range);
        return service.getVideo(title);
    }

    @GetMapping(value = "audio/{title}", produces = "audio/mp3")
    public Mono<Resource> getAudios(@PathVariable String title, @RequestHeader("Range") String range) {
        System.out.println(title + " range in bytes() : " + range);
        return service.getAudio(title);
    }


}
