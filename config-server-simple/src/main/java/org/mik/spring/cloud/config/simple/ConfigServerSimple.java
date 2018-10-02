package org.mik.spring.cloud.config.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerSimple {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerSimple.class, args);
    }
}
