package net.engineeringdigest.journalApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// restcontroller - provides same functionalities as @Components, but with many more features
@RestController
public class Car {
    @Autowired
    private Dog dog;
//    autowired is used for asking objects without creating them
//    autowired - in other words, dependecy injection

    @GetMapping("/ok")
    public String ok() {
        return dog.fun();
    }
}
