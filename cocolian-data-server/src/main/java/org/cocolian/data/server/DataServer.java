
package org.cocolian.data.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableAutoConfiguration
public class DataServer {

    public static void main(String[] args) {
       SpringApplication app = new SpringApplication(DataServer.class);
       app.setWebEnvironment(false);
       app.run(args);
    }
}
