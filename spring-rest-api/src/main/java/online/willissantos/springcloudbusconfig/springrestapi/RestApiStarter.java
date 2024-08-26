package online.willissantos.springcloudbusconfig.springrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class RestApiStarter {

    public static void main(String[] args) {
        SpringApplication.run(RestApiStarter.class, args);
    }

}
