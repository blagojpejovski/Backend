package com.example.demofinal1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan({"com.example.demofinal1"})
//@EntityScan("com.delivery.domain")

@SpringBootApplication
@EnableJpaRepositories("com.example.demofinal1.repository")
public class DemoFinal1Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoFinal1Application.class, args);
    }

}
