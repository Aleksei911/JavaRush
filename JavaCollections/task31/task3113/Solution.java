package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/* 
Что внутри папки?
*/
public class Solution {

    public static int numberOfFiles;
    public static int numberOfFolders;
    public static long size;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Path folder = Paths.get(reader.readLine());
        if (!Files.isDirectory(folder)) {
            System.out.println(folder.toString() + " - не папка");
        }else {

            Files.walkFileTree(folder, new MyFileVisitor());

            System.out.println("Всего папок - " + (numberOfFolders-1));
            System.out.println("Всего файлов - " + numberOfFiles);
            System.out.println("Общий размер - " + size);
        }

    }
    public static class MyFileVisitor extends SimpleFileVisitor<Path> {
        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            Solution.numberOfFiles++;
            Solution.size = Solution.size + Files.size(file);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            Solution.numberOfFolders++;
            return FileVisitResult.CONTINUE;
        }
    }
}
