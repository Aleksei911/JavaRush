package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String fileName = buf.readLine();
        buf.close();

        if (args.length>0) {
            BufferedReader buf2 = new BufferedReader(new FileReader(fileName));
            int lineNumberToUpdate = SearchForLineNumberByID(buf2, Integer.parseInt(args[1]));
            buf2.close();
            if (args[0].equals("-u"))
            {
                updateLine(lineNumberToUpdate, fileName, args);
            }
            else if (args[0].equals("-d"))
            {
                deleteLine(lineNumberToUpdate, fileName);
            }
        }

    }

    private static int SearchForLineNumberByID(BufferedReader buf, int idToSearch) throws IOException {
        String currentLine;
        int currentLineNumber = 0;
        while ((currentLine = buf.readLine()) != null)
        {
            String currentIDAfterTrim = currentLine.substring(0, 8).trim();
            int currentID = Integer.parseInt(currentIDAfterTrim);
            if (currentID == idToSearch)
            {
                buf.close();
                break;
            }else
                currentLineNumber++;
        }
        return currentLineNumber;
    }

    private static String prepareForWriting(String productName, int expectedLength)
    {
        StringBuilder stringBuilder = new StringBuilder(productName);
        if (productName.length()<expectedLength)
        {
            int spacesToAdd = expectedLength - productName.length();
            for (int i=0; i< spacesToAdd; i++)
            {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    private static void updateLine(int lineNumberToUpdate, String fileName, String[] args) throws IOException {
        List<String> tempList = new ArrayList<>();
        BufferedReader buf = new BufferedReader(new FileReader(fileName));
        String currentLine;
        while ((currentLine = buf.readLine()) != null){
            tempList.add(currentLine);
        }
        buf.close();
        String IDForWrite = prepareForWriting(args[1], 8);
        String productName = prepareForWriting(args[2], 30);
        String productPrice = prepareForWriting(args[3], 8);
        String productQuantity = prepareForWriting(args[4], 4);
        StringBuilder stringBuilder = new StringBuilder().append(IDForWrite).append(productName).append(productPrice).append(productQuantity);
        tempList.remove(lineNumberToUpdate);
        tempList.add(lineNumberToUpdate, stringBuilder.toString());

        FileWriter fileWriter = new FileWriter(fileName);
        for (int i=0; i<tempList.size(); i++)
        {
            if (i!=tempList.size()-1)
                fileWriter.write(tempList.get(i)+ "\n");
            else
                fileWriter.write(tempList.get(i));
        }
        fileWriter.close();
    }

    private static void deleteLine(int lineNumberToDelete, String fileName) throws IOException {
        List<String> tempList = new ArrayList<>();
        BufferedReader buf = new BufferedReader(new FileReader(fileName));
        String currentLine;
        while ((currentLine = buf.readLine()) != null){
            tempList.add(currentLine);
        }
        buf.close();

        tempList.remove(lineNumberToDelete);

        FileWriter fileWriter = new FileWriter(fileName);
        for (int i=0; i<tempList.size(); i++)
        {
            if (i!=tempList.size()-1)
                fileWriter.write(tempList.get(i)+ "\n");
            else
                fileWriter.write(tempList.get(i));
        }
        fileWriter.close();
    }
}
