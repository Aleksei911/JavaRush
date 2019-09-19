package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws Exception{
            try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {

                ArrayList<String> fileNames = new ArrayList<>();
                String filePartName = consoleReader.readLine();
                String outPutFileName;

                while ( !(filePartName.equals("end") )){
                    fileNames.add(filePartName);
                    filePartName = consoleReader.readLine();
                }

                Collections.sort(fileNames);
                filePartName = fileNames.get(0);
                outPutFileName = filePartName.substring(0,filePartName.lastIndexOf(".part"));

                InputStream is;
                OutputStream os = new FileOutputStream(outPutFileName);



                for (String fileName:
                        fileNames) {
                    byte[] buffer = new byte[128];
                    int bytesRead = 0;
                    is = new FileInputStream(fileName);
                    while ((bytesRead = is.read(buffer)) != -1){
                        os.write(buffer,0,bytesRead);
                    }
                    is.close();
                }
                os.close();



            } catch (IOException ioe){

            }
        }
    }
