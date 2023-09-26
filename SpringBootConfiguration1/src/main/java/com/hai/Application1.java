package com.hai;

import com.hai.Config.FoodConfig;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({FoodConfig.class})
@EnableEncryptableProperties
public class Application1 {

    public static void main(String[] args) {

        SpringApplication.run(Application1.class,args);

    }
}
