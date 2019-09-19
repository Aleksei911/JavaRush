package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
        if (n == 0)
            return "1";
        else if (n < 0)
            return "0";
        else if (n > 0) {
            BigInteger bigInteger = BigInteger.ONE;
            for (int i = 1; i <= n; ++i)
                bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
            return String.valueOf(bigInteger);
        }
        else
        {
            BigInteger bigInteger = BigInteger.ONE;
            for (int i = -1; i >= n; --i)
            {
                bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
            }

            if (!(bigInteger.toString().substring(0, 1).equals("-")))
            {
                bigInteger = bigInteger.multiply(BigInteger.valueOf(-1));
                return String.valueOf(bigInteger);
            }
            else
                return String.valueOf(bigInteger);
        }
    }
}
