package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.*;

public class FileConsoleWriter {
    private FileWriter fileWriter;
    private PrintStream printStream;
    { printStream = System.out;}

    public FileConsoleWriter(String fileName) throws IOException {

        this.fileWriter = new FileWriter(fileName);
    }

    public FileConsoleWriter(String filename, boolean appended) throws IOException
    {
        this.fileWriter = new FileWriter(filename, appended);
    }

    public FileConsoleWriter(File file) throws IOException{
        this.fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(File file,boolean appended) throws IOException{
        this.fileWriter = new FileWriter(file, appended);
    }
    public FileConsoleWriter(FileDescriptor fd){
        this.fileWriter = new FileWriter(fd);
    }



    public static void main(String[] args) {

    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        for(int i=off;i<off+len;i++)
            System.out.print(cbuf[i]);
    }

    public void write(int c) throws IOException{
        fileWriter.write(c);
        System.out.println(c);
    }

    public void write(String str) throws IOException{
        fileWriter.write(str);
        System.out.println(str);

    }

    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str,off,len);
        System.out.println(str.substring(off,off+len));
    }

    public void write(char[] cbuf) throws IOException{
        fileWriter.write(cbuf);
        printStream.println(cbuf);
    }

    public void close() throws IOException{
        fileWriter.close();

    }


}
