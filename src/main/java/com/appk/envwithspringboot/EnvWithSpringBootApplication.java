package com.appk.envwithspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

@SpringBootApplication
public class EnvWithSpringBootApplication {

    public static void main(String[] args) {
        // this need only run in local without Docker
        /*File file = new File(".env.prod");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while (reader.ready()){
                String line = reader.readLine();
                if (line != null){
                    line = line.split("#")[0].trim();
                    System.out.println(line);
                    if (line.isEmpty() || line.startsWith("#")) continue;
                    String[] parts = line.split("=");
                    if (parts.length ==2){
                        System.setProperty(parts[0], parts[1]);
                    }
                }
            }
        }  catch (IOException e) {
            throw new RuntimeException("Failed to load env file: " + file.getName(), e);
        }*/
        SpringApplication.run(EnvWithSpringBootApplication.class, args);
    }

}
