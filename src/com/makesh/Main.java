package com.makesh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main  {
	public static void  method(int a) {
		//System.out.println("Main"+a) ;
		int b=10;
		System.out.println(a+b);
	}
	 
	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(0);
		al.add(4);
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			int n=(int) itr.next();
			if(n==2||n==0) {System.out.println(n);}
			else itr.remove();
			
			
			//new Main().method1(3);
		}
	
	}
	
		

}
