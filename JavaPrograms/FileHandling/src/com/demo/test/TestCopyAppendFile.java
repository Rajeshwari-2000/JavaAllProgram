package com.demo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyAppendFile {
	public static void main(String[] args) throws FileNotFoundException, FileNOtFoundException {
		File f=new File("textcopy.txt");
		FileOutputStream fos=null;
		if(f.exists()) {
			fos= new FileOutputStream(f,true);
		}else {

		fos= new FileOutputStream(f,true);

		

}
		try(FileInputStream fis=new FileInputStream("text.txt");
				FileOutputStream fos1=fos;	){
				int c=fis.read();
				while(c!=-1) {
					fos1.write(c);
					c=fis.read();
				}
				System.out.println("file copied");
				
				
			}catch(FileNotFoundException e) {
				System.out.println(e.getMessage());
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}

}
}
