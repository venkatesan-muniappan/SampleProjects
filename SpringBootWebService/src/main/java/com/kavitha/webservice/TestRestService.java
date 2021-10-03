package com.kavitha.webservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class TestRestService {
  //  @GetMapping
    public String startMessage(@RequestParam(name = "name", defaultValue = "default-World") String name1) {
        return "Hello " + name1;
    }

    //@GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
