package com.javarush.task.task32.task3201;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
Запись в существующий файл
*/
public class Solution {
    public static void main(String... args) throws IOException {

        RandomAccessFile raf = new RandomAccessFile(args[0], "rw");
        int point = Integer.parseInt(args[1]);
        if (raf.length()<point){
            raf.seek(raf.length());
            raf.write(args[2].getBytes());
        }
        else {
            raf.seek(point);
            raf.write(args[2].getBytes());
        }

    }
}
