package com.hasan.hasanboot;

import io.micrometer.core.annotation.Timed;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Timed
public class MyController {

    @GetMapping("/hello")
    public String testEndpoint() {
        return "Hello World!";
    }
}
