package com.csua;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author chris
 */
public class CopyFileTest {
    
    public static void copyFile(File source, File dest) throws IOException {
        InputStream in = new FileInputStream(source);
        OutputStream out = new FileOutputStream(dest);
        
        int b = in.read();
        
        while (b != -1) {
            out.write(b);
            b = in.read();
        }
        
        in.close();
        out.close();
    }
    
    public static void copyFile2(File source, File dest) throws IOException {
        InputStream in = new FileInputStream(source);
        OutputStream out = new FileOutputStream(dest);
        
        byte buffer[] = new byte[4096];
        int n = in.read(buffer);
        
        while (n != -1) {
            out.write(buffer, 0, n);
            n = in.read(buffer);
        }
        
        in.close();
        out.close();
    }
    
    public static void main(String[] args) throws IOException {
        copyFile(new File("C:\\Users\\chris\\OneDrive\\Pictures\\image_0.jpg"), new File("C:/Users/chris/Downloads/52.jpg"));
    }
}
