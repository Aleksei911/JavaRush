package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.ThreadLocalRandom;

/* 
Генератор паролей
*/
public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        for (int i = 0; i <2; i++){
            baos.write(ThreadLocalRandom.current().nextInt(65, 90 + 1));
            baos.write(ThreadLocalRandom.current().nextInt(48, 57 + 1)); //байты , отвечающие за цифры
            baos.write(ThreadLocalRandom.current().nextInt(97, 122 + 1));
            baos.write(ThreadLocalRandom.current().nextInt(48, 57 + 1));//байты , отвечающие за цифры
        }

        return baos;
    }
}