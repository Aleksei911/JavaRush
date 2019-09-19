package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();
    public static Map<String,String> map = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader = new BufferedReader(new FileReader(reader.readLine()));

        String sb = "";
        while (reader.ready()){
            sb += reader.readLine() + " ";
        }
        reader.close();

        String[] smass = sb.trim().split(" ");
        for (int i = 0; i < smass.length - 1; i++) {
            String rev = String.valueOf(new StringBuilder(smass[i]).reverse());
            for (int j = i + 1; j < smass.length; j++) {
                if(rev.equals("")) continue;
                if(smass[j].equals(rev)){
                    Pair pair = new Pair();
                    pair.first = smass[i];
                    pair.second = rev;
                    result.add(pair);
                    smass[i] = "";
                    smass[j] = "";
                    break;
                }
            }
        }
        System.out.println();

    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                        first == null ? second :
                            second == null ? first :
                                first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
