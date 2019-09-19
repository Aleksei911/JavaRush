package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null || telNumber.equals("")){
            return false;
        }

        if (telNumber.charAt(0) == '+') {
            int count = 0;
            for (int i = 1; i < telNumber.length(); i++) {
                if (telNumber.charAt(i) <= '9' && telNumber.charAt(i) >= '0') {
                    ++count;
                }
            }
            if (count != 12) {
                return false;
            }
        } else if (telNumber.charAt(0) <= '9' && telNumber.charAt(0) >= '0') {
            int count = 0;
            for (int i = 0; i < telNumber.length(); i++) {
                if (telNumber.charAt(i) <= '9' && telNumber.charAt(i) >= '0') {
                    ++count;
                }
            }
            if (count != 10) {
                return false;
            }

        } else {return false;}


        int countDef = 0;
        int countbracket=0;
        int numbrack = 0;
        for (int i = 1; i < telNumber.length(); i++){
            if ((telNumber.charAt(i) <= '9' && telNumber.charAt(i) >= '0') || telNumber.charAt(i) == '-' || telNumber.charAt(i) == '(' || telNumber.charAt(i) == ')' ) {
                if (telNumber.charAt(i) == '-'){
                    if (telNumber.charAt(i-1) == '-'){return false;}
                    countDef++;
                    if (countDef > 2){return false;}
                    continue;
                }

                if (telNumber.charAt(i) == '('){
                    if (countDef > 0){
                        return false;
                    }
                    countbracket++;
                    if (countbracket > 2){return false;}
                    continue;
                }

                if (telNumber.charAt(i) == ')'){
                    if (countbracket == 0){return false;}
                    countbracket++;
                    if (countbracket > 2){return false;}
                    if (numbrack != 3){return false;}
                    numbrack = 0;
                    continue;
                }
                if (countbracket == 1){
                    numbrack++;
                }

            } else {
                return false;
            }
        }

        if (!(telNumber.charAt(telNumber.length()-1) <= '9' && telNumber.charAt(telNumber.length()-1) >= '0')){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkTelNumber("+38050123-4-567"));
        System.out.println(checkTelNumber("+38(05)01234567"));
        System.out.println(checkTelNumber("+38050123-45-67"));
        System.out.println(checkTelNumber("050123-4567"));
        System.out.println(checkTelNumber("+38)050(1234567"));
        System.out.println(checkTelNumber("+38(050)1-23-45-6-7"));
        System.out.println(checkTelNumber("050ххх4567"));
        System.out.println(checkTelNumber("050123456"));
        System.out.println(checkTelNumber("(0)501234567"));
    }
}
