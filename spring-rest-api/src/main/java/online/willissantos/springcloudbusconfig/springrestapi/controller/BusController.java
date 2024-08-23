package online.willissantos.springcloudbusconfig.springrestapi.controller;

import java.util.Objects;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import online.willissantos.springcloudbusconfig.springrestapi.config.FooConfig;
import online.willissantos.springcloudbusconfig.springrestapi.service.BusService;
import reactor.core.publisher.Mono;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bus")
@RequiredArgsConstructor
@Slf4j
public class BusController {
    @Autowired FooConfig fooConfig;
    private final BusService busService;

    @GetMapping
    Mono<ResponseEntity<String>> getBus() {
        log.info(String.valueOf(fooConfig));
        busService.serviceExample();
        return Mono.just(ResponseEntity.ok(
            Objects.isNull(fooConfig) ? "Hello Bus!" : fooConfig.getFoo()
        ));
    }
}
