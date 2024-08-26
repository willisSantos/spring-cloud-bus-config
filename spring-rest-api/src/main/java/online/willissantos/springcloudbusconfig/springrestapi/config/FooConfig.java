package online.willissantos.springcloudbusconfig.springrestapi.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Setter
@Getter
@ConfigurationProperties
@ToString
public class FooConfig {
    private String foo;
}
