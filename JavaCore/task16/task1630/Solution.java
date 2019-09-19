package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static {
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException e){
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        ArrayList<String> arrayList = new ArrayList<>();
        String string = "";
        String fileName;
        String str = " ";

        //       @Override
        public String getFileContent() {
            for (int i = 0; i < arrayList.size(); i++) {
                string += arrayList.get(i) + " ";

            }
            return string;
        }

        //     @Override
        public void setFileName(String fullFileName) {
            fileName = fullFileName;
        }


        @Override
        public void run() {
            try {
                FileInputStream fileInputStream = new FileInputStream(fileName);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader reader = new BufferedReader(inputStreamReader);
                str = reader.readLine();

                while (str != null) {
                    arrayList.add(str);
                    //         string += str + " ";
                    str = reader.readLine();
                }
                fileInputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (FileNotFoundException e) {

            } catch (IOException e) {

            }

        }
    }
}
