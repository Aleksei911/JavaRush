package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут
        try {
            reset();
        } catch (NullPointerException | IOException e){
            System.out.println("daun");
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String vvod = reader.readLine();
        int passajiri;
        if (vvod.equals("helicopter")){
            result = new Helicopter();
        } else if (vvod.equals("plane")){
            passajiri = Integer.parseInt(reader.readLine());
            result = new Plane(passajiri);
        }
    }
}
