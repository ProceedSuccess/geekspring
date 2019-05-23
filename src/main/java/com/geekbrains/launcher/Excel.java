package com.geekbrains.launcher;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Excel {
    public static void main(String[] args) throws Exception {
        byte[] result = Files.readAllBytes(Paths.get("C:/Users/HP/Desktop/Book.xlsx"));
        InputStream is = new ByteArrayInputStream(result);
        while (is.available() != -1) System.out.print((char) is.read());
    }
}
