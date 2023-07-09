package com.tutorial;

import java.io.*;
import java.util.Arrays;

public class Coba {

    public static void main(String[] args) throws IOException {

        // membaca file inputan
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferReader = new BufferedReader(fileInput);
        bufferReader.mark(200);

        // membaca kedalam string
        String dataString = bufferReader.readLine();
        System.out.println(dataString);

        // membaca ke dalam character
        bufferReader.reset();
        char[] dataChar = new char[18];
        bufferReader.read(dataChar, 0, 18);
        System.out.println(Arrays.toString(dataChar));

        // membaca dalam satu baris
        bufferReader.reset();
        System.out.println(bufferReader.readLine());
        System.out.println(bufferReader.readLine());

        // menulis dalam buffer
        FileWriter fileWriter = new FileWriter("output2.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferReader.reset();
        String baris1 = bufferReader.readLine();
        bufferedWriter.write(baris1, 0, baris1.length());
        bufferedWriter.flush();

        // menambah next line atau enter
        bufferedWriter.newLine();

        String baris2 = bufferReader.readLine();
        bufferedWriter.write(baris2, 0, baris2.length());
        bufferedWriter.flush();

        bufferedWriter.close();
        bufferReader.close();
        fileWriter.close();
        fileInput.close();
    }

}
