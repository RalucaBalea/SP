package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.ClientComponent;

@RestController
public class HelloController {
    @Autowired
    private ClientComponent clientComponent;

    @RequestMapping("/")
    public String hello() {
        return "Hello from Spring Boot";
    }

    @RequestMapping("/client")
    public String client() {
        return String.format("Hello from %s", clientComponent);
    }
}