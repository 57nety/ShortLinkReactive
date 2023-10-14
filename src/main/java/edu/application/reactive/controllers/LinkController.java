package edu.application.reactive.controllers;

import edu.application.reactive.links.LinksService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class LinkController {
    private final LinksService linksService;

    public LinkController(LinksService linksService) {
        this.linksService = linksService;
    }

    @GetMapping
    public Mono<Integer> code(){
        return linksService.randomPull().then(Mono.just(Thread.activeCount()));
    }
}
