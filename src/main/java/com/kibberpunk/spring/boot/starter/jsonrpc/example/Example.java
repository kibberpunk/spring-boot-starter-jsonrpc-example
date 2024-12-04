package com.kibberpunk.spring.boot.starter.jsonrpc.example;

import com.kibberpunk.spring.boot.starter.jsonrpc.context.JsonRpcAutoConfiguration;
import com.kibberpunk.spring.boot.starter.jsonrpc.context.JsonRpcSwaggerAutoConfiguration;
import com.kibberpunk.spring.boot.starter.jsonrpc.example.context.ExampleConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Example application starter
 *
 * @author kibberpunk
 */
@SpringBootApplication
@Import(value = {
        ExampleConfiguration.class,
        JsonRpcAutoConfiguration.class,
        JsonRpcSwaggerAutoConfiguration.class
})
public class Example {

    /**
     * Starter spring method.
     *
     * @param args Program arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}
