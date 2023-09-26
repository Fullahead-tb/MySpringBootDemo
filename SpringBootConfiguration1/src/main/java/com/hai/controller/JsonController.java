package com.hai.controller;

import com.hai.Config.VegetablesConfig;
import com.hai.bean.Food;
import com.hai.bean.Vegetables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController  新注解     返回JSON形式的响应结果
 * 该注解是@ResponseBody和Controller结合
 *
 */
@RestController
public class JsonController {


    /**
     * 使用@Value注解   是将food.rice = value写在 application.properties配置文件
     */
        @Value("${food.rice}")
        private String rice;
        @Value("${food.meat}")
        private String[] meat;

        @Value("${info.username}")
        private String username;
        @Value("${info.password}")
        private String password;

        @RequestMapping("/json")
        public Food json(){

            Food food = new Food();
            food.setRice(rice);
            food.setMeat(meat);

            return food;
        }

        //蔬菜自定义配置文件测试
        @Autowired
        private VegetablesConfig vegetablesConfig;

        @RequestMapping("/vegetables")
        public Vegetables vegetables(){

            Vegetables vegetables = new Vegetables();
            vegetables.setPotato(vegetablesConfig.getPotato());
            vegetables.setEggplant(vegetablesConfig.getEggplant());
            vegetables.setGreenpepper(vegetablesConfig.getGreenpepper());

            return vegetables;
        }

        //测试jasypt
    @RequestMapping("/jasypt")
        public String jasypt(){

            StringBuilder builder = new StringBuilder("[");
            builder.append(username);
            builder.append(",");
            builder.append(password);
            builder.append("]");

            return builder.toString();
        }

}
