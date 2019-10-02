package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static
    {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            firstFileName = bufferedReader.readLine();
            secondFileName = bufferedReader.readLine();
            bufferedReader.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException, IOException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent() throws IOException;

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface{
        private String file;
        private String line = "";

        @Override
        public void setFileName(String fullFileName) {
            this.file = fullFileName;
        }

        @Override
        public String getFileContent(){ //по логике задачи оказалось что просто возврат уже содержимого файла
            return line;
        }

        @Override
        public void run() {
            try {
                BufferedInputStream fileReader = new BufferedInputStream(new FileInputStream(file));
                Scanner scanner = new Scanner(fileReader);

                while (scanner.hasNextLine())
                {
                    line+=scanner.nextLine()+" ";
                }

                } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }
}

