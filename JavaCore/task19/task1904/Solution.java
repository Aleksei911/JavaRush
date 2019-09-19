package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;

        PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }
        private Person parseString(String stringInput) throws IOException {
            Scanner scannerParser = new Scanner(stringInput);
            scannerParser.useDelimiter(" ");

            String lastName = scannerParser.next();
            String firstName = scannerParser.next();
            String middleName = scannerParser.next();


            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            scannerParser.useDelimiter("[\r\n]");
            String birthDateString = scannerParser.next();
            try {
                Date birthDate = dateFormat.parse(birthDateString);
                return new Person(firstName, middleName, lastName, birthDate);
            } catch (ParseException e) {
                e.printStackTrace();
                throw new IOException("Parse exception", e);
            }
        }

        @Override
        public Person read() throws IOException {
            if(fileScanner.hasNextLine()){
                return parseString(fileScanner.nextLine());
            } else {
                throw new IOException();
            }
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
