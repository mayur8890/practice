package com.practice.others;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//Checked and unchecked execption 


public class ExceptionTest {
	public static void main(String a[]) throws FileNotFoundException {
		
		try{
			int a1, b,c;
			a1=8;
			b=4;
			int d=0;
			System.out.println("One "+a1/b);
		//System.exit(0);
		System.out.println(a1/d);
		}catch(Exception e){
			e.printStackTrace();
			//System.out.println(e);
		}finally{
			System.out.println("In finally ");
		}
		
		
	}

}
