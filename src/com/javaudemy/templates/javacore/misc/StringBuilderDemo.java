package com.itbulls.learnit.javacore.misc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringBuilderDemo {


    private static String readBufferedReader() throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("test3.txt"))) {
            String buffer;
            while ((buffer = br.readLine()) != null) {
                sb.append(buffer).append(System.lineSeparator());
            }
        }
        System.out.println(sb);
        return sb.toString();
    }
}
