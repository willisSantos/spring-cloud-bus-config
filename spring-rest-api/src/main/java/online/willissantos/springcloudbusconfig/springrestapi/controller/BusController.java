package online.willissantos.springcloudbusconfig.springrestapi.controller;

import reactor.core.publisher.Mono;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bus")
public class BusController {
    @GetMapping
    Mono<ResponseEntity<String>> getBus() {
        return Mono.just(ResponseEntity.ok("Hello Bus!"));
    }
}
