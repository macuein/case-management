package org.mik.cm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Application {

    public static void main(String[] args) {
        new SpringApplication(Application.class).run(args);
    }
}
