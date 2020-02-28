package com.whatsapp.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Server application.
 * ===================
 *
 * Application entry point.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@SpringBootApplication
public class ServerApplication {
    /**
     * Main method.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
}
