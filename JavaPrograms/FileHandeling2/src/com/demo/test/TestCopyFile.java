package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyFile {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			
			fis=new FileInputStream("test1.txt");
			
			 fos=new FileOutputStream("test1copy.txt");
			int c=fis.read();
			while(c!=-1) { 
				fos.write(c);
				c=fis.read();
			}
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
	}

}

