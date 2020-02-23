package me.whiteship.demospring51;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demospring51Application {

    @Autowired
    BookRepository bookRepository;

    public static void main(String[] args) {

        SpringApplication.run(Demospring51Application.class);
    }
}
