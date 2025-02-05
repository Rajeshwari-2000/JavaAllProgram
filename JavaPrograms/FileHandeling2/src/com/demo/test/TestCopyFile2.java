package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyFile2 {
	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("test1.txt");
			FileOutputStream  fos=new FileOutputStream("test1copy.txt");) {
			int c=fis.read();
			while(c!=-1) { 
				fos.write(c);
				c=fis.read();
			}
		    System.out.println("File copied");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
