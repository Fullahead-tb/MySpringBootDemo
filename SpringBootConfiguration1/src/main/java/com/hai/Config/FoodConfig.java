package com.hai.Config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "food")
@Data
@Component
public class FoodConfig {
    private String rice;
    private String[] meat;

}
