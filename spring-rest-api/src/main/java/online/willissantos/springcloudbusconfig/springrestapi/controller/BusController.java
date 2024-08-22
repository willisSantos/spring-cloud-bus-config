package online.willissantos.springcloudbusconfig.springrestapi.controller;

import java.util.Objects;

import lombok.extern.slf4j.Slf4j;
import online.willissantos.springcloudbusconfig.springrestapi.config.FooConfig;
import reactor.core.publisher.Mono;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bus")
@Slf4j
public class BusController {
    @Autowired FooConfig fooConfig;

    @GetMapping
    Mono<ResponseEntity<String>> getBus() {
        log.info(String.valueOf(fooConfig));
        return Mono.just(ResponseEntity.ok(
            Objects.isNull(fooConfig) ? "Hello Bus!" : fooConfig.getFoo()
        ));
    }
}
