package com.csua;

import java.io.File;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author chris
 */
public class ListFiles {
    private static final StringBuilder temp = new StringBuilder();
    
    private static String formatString(String str, int len) {
        temp.setLength(0);
        temp.append(str);
        while (temp.length() < len) {
            temp.append(' ');
        }
        return temp.toString();
    }
    
    public static void main(String[] args) {
        //forzar a ñ o caracteres especiales
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        File base = new File("C:\\Users\\chris\\OneDrive\\Documents\\learning\\java\\play_java");
        File list[] = base.listFiles();
        int nameLen = 0;
        for (File f : list) {
            nameLen = Math.max(nameLen, f.getName().length());
        }
        nameLen += 3;
        
        System.out.println(formatString("Nombre", nameLen));
        System.out.print("Tipo          ");
        System.out.println("Tamaño");
    }
}
