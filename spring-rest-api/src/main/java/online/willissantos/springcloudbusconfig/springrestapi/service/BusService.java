package online.willissantos.springcloudbusconfig.springrestapi.service;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BusService {
    public BusService() {
        log.info("build me");
    }

    public void serviceExample() {
        log.info("serviceExample");
        privateServiceExample();
    }

    private void privateServiceExample() {
        log.info("privateServiceExample");
    }
}
