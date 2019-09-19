package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UnknownFormatConversionException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            throw new IOException();
        } catch (IOException e) {
            exceptions.add(e);
        }
        try {
            throw new SQLException();
        } catch (SQLException e) {
            exceptions.add(e);
        }
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            exceptions.add(e);
        }
        try {
            throw new ClassNotFoundException();
        } catch (ClassNotFoundException e) {
            exceptions.add(e);
        }
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException e) {
            exceptions.add(e);
        }
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            exceptions.add(e);
        }
        try {
            throw new NoSuchElementException();
        } catch (NoSuchElementException e) {
            exceptions.add(e);
        }
        try {
            throw new ClassCastException();
        } catch (ClassCastException e) {
            exceptions.add(e);
        }
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }
    }
}
