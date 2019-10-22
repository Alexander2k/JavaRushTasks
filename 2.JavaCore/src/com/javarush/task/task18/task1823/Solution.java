package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws InterruptedException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String file = reader.readLine();
            if (file.equals("exit")) {
                break;
            } else {
                ReadThread thread = new ReadThread(file);
                thread.start();
                thread.join();
            }
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        String filename;
        int maxVal = Integer.MIN_VALUE;
        int b_key = 0;

        public ReadThread(String fileName) {
            //implement constructor body
            this.filename = fileName;
        }

        // implement file reading here - реализуйте чтение из файла тут
        @Override
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filename));

                Map<Integer, Integer> fileMap = new HashMap<>();
                while (reader.ready()) {
                    int data = reader.read();
                    if (fileMap.containsKey(data)) {
                        fileMap.put(data, fileMap.get(data) + 1);
                    } else {
                        fileMap.put(data, 1);
                    }
                }

                for (Map.Entry<Integer, Integer> m : fileMap.entrySet()) {
                    int value = m.getValue();
                    int key = m.getKey();
                    if (value > maxVal) {
                        maxVal = value;
                        b_key = key;
                    }
                }

                synchronized (new Object()) {
                    resultMap.put(filename, b_key);
                }
                reader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
