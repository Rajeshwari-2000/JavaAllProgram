package com.demo.test;

import java.util.Scanner;

import com.demo.beans.SearchData;
import com.demo.threads.MySearchThread;

public class TestSearch {
	public static void main(String[] args) {



		String[] str= {"happy","enjoy","check"};
		MySearchThread[] sthread=new MySearchThread[str.length];
		Scanner sc=new Scanner(System.in);
		SearchData sdata=new SearchData();
		for(int i=0; i<str.length ; i++) {
			System.out.println("searching"+ str[i]);
			sthread[i]=new MySearchThread(sdata, str[i]);
			sthread[i].start();
		}

		for(int i=0;i<str.length;i++) {
			try {
				sthread[i].join();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
