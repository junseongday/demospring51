package me.whiteship.demospring51;

import me.whiteship.out.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.function.Supplier;

@SpringBootApplication
public class Demospring51Application {

    @Autowired
    MyService service;

    public static void main(String[] args) {

//        SpringApplication.run(Demospring51Application.class, args);

        //java8
        SpringApplication app = new SpringApplication(Demospring51Application.class);
        app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) context -> {
            context.registerBean(MyService.class);
            context.registerBean(ApplicationRunner.class, () -> (ApplicationRunner) args1 -> System.out.println("Functional Bean Definition!!"));
        });
        app.run(args);
    }

}
