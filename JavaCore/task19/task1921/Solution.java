package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);

        while (bufferedReader.ready()) {
            String[] values = bufferedReader.readLine().split(" ");
            String year = values[values.length - 1];
            String month = values[values.length - 2];
            String day = values[values.length - 3];
            Date date = simpleDateFormat.parse(day + " " + month + " " + year);

            StringJoiner name = new StringJoiner(" ");
            for (int i = 0; i < values.length - 3; i++) {
                name.add(values[i]);
            }

            Person person = new Person(name.toString(), date);
            PEOPLE.add(person);
        }

        bufferedReader.close();

    }
}
