package online.willissantos.springcloudbusconfig.springrestapi.service.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class CustomAnnotationAspect {
    @Before("callPrivateMethods()")
    public void test() {
        log.info("To aqui em");
    }

    @Pointcut("execution(private * online.willissantos.springcloudbusconfig.springrestapi.service.BusService.*(..))")
    public void callPrivateMethods(){}
}
