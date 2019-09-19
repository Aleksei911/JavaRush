package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(output);
        System.setOut(stream);

        testString.printSomething();
        String s = output.toString();
        System.setOut(console);

        Pattern p = Pattern.compile("(.+\\r?\\n){2}");
        Matcher m = p.matcher(s);
        String adv = "JavaRush - курсы Java онлайн\n";
        int i = adv.length();
        StringBuilder sadv = new StringBuilder(s);
        int count = 0;
        while(m.find()) {
            sadv = sadv.insert(m.end() + i * count, adv);
            count++;
        }
        System.out.println(sadv);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
