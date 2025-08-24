package com.csua;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 *
 * @author chris
 */
public class ReadTextFile {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("C:\\Users\\chris\\OneDrive\\Documents\\learning\\java\\play_java\\PlayJava\\README.md")
                )
        );
        
        String line = br.readLine();
        
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
        
        br.close();
    }
    
}
