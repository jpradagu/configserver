package com.nttdata.bootcamp.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Config server application.
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigserverApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConfigserverApplication.class, args);
  }

}
