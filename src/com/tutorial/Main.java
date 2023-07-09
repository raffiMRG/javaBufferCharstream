package com.tutorial;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        // membaca file dulu
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);
        bufferedReader.mark(200);

        // membaca kedalam string
        String data =  bufferedReader.readLine();
        System.out.println(data);

        // membaca kedalam caracter
        bufferedReader.reset();
//        String data2 = bufferedReader.readLine();
//        System.out.println(data2);
        char[] dataChar = new char[18];
        bufferedReader.read(dataChar, 0, 18);
        System.out.println(Arrays.toString(dataChar));

        // membaca baris
        bufferedReader.reset();
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());

        // menulis file
        FileWriter fileOutput = new FileWriter("output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileOutput);

        bufferedReader.reset();
        String baris1 = bufferedReader.readLine();
        bufferedWriter.write(baris1, 0, baris1.length());
        bufferedWriter.flush();

        // menambah new line, enter
        bufferedWriter.newLine();

        String baris2 = bufferedReader.readLine();
        bufferedWriter.write(baris2, 0, baris2.length());
        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();
        fileInput.close();
        fileOutput.close();

    }

}
