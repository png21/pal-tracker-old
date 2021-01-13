package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private String message;

    public WelcomeController(@Value("${welcome.message}")String message )
    {
    this.message=message;
    }

    @GetMapping("/")
    public String sayHello() {
        //return "hello";
        return this.message;
    }

    @GetMapping("/hi")
    public String sayHello1(@RequestParam(name="id") String id) {
        return "hi1 "+id;
       // return this.message;
    }
}