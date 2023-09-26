package com.hai.Config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Configuration   告知Spring这是一个配置类
 * @ConfigurationProperties(prefix = "vegetables")  配置文件中以prefix值开头的为当前配置类信息
 * @PropertySource("classpath:config/vegetables.properties")    当前配置文件的位置
 */
@Configuration
@ConfigurationProperties(prefix = "vegetables")
@PropertySource("classpath:config/vegetables.properties")
public class VegetablesConfig {
    private String potato;
    private String eggplant;
    private String greenpepper;

    public String getPotato() {
        return potato;
    }

    public void setPotato(String potato) {
        this.potato = potato;
    }

    public String getEggplant() {
        return eggplant;
    }

    public void setEggplant(String eggplant) {
        this.eggplant = eggplant;
    }

    public String getGreenpepper() {
        return greenpepper;
    }

    public void setGreenpepper(String greenpepper) {
        this.greenpepper = greenpepper;
    }
}
