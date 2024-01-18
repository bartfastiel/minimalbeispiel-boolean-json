package com.example.minimalbeispielbooleanjson;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MinimalbeispielBooleanJsonApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinimalbeispielBooleanJsonApplication.class, args);
    }

}

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Cat {
    private boolean alive;
}

@RestController
class Controller {
    @PostMapping
    void post(@RequestBody Cat cat) {
        System.out.println(cat.isAlive());
    }
}