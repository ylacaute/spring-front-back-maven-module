package com.thorpora.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/hello")
    public Hello getHello() {
        String msg = "HELLO FROM SERVER API";
        log.info("Hello request, msg={}", msg);
        return Hello.builder().name(msg).build();
    }

}
