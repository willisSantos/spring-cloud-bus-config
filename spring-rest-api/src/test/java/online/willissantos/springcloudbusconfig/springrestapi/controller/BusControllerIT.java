package online.willissantos.springcloudbusconfig.springrestapi.controller;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
@AutoConfigureWebTestClient
class BusControllerIT {

    private final WebTestClient client;

    @Autowired
    public BusControllerIT(WebTestClient client) {
        this.client = client;
    }

    @Test
    void getBus() {
        client.get().uri("/bus").exchange().expectStatus().isOk().expectBody(String.class).isEqualTo("Hello cloud config server!");
    }
}
