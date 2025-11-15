package de.schaeferd.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestApiController
{
    @GetMapping("/hello")
    public Map<String, String> getLocalData() {
        return Map.of("source", "local-spring-app");
    }
}
