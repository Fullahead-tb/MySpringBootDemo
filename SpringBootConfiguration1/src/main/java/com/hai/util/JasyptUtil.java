package com.hai.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {
    public static void main(String[] args){
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("123456!@#");
        String name = encryptor.encrypt("root");
        String password = encryptor.encrypt("root123");
        System.out.println(name+","+password);

        //解密
        String testText1 = encryptor.decrypt("P+NXNnuuGUcZTgFqMb51/A==");
        String testText2 = encryptor.decrypt("M6IqoDz7EUoHvVKVocmLIQ==");
        System.out.println(testText1+","+testText2);
    }
}
