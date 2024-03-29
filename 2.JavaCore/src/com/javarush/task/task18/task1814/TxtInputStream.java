package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
    private FileInputStream inputStream;

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        if  (fileName.endsWith(".txt"))
        {
            this.inputStream = new FileInputStream(fileName);
        }
        else {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) {
    }
}

