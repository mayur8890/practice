package com.bbd.econd;
import java.io.*;
class Dog implements Serializable
{
	int i=10;
	transient int j=20;
}
public class SortArray
{
	public static void main(String args[])throws Exception{
		Dog d1=new Dog();
		FileOutputStream f1=new FileOutputStream("abc.ser");
		ObjectOutputStream o1=new ObjectOutputStream(f1);
		o1.writeObject(d1);
		
		FileInputStream f2=new FileInputStream("abc.ser");
		ObjectInputStream o2=new ObjectInputStream(f2);
		Dog d2=(Dog)o2.readObject();
		System.out.println(d2.i+"  "+d2.j);
	}
}
