package com.sri.loops;

public class Loops {
	public static void main(String []args) {
		String s = "1101";
		int j = 0;
		 int []a = new int[s.length()];
	        for(int i=0; i<s.length(); i++){
	            a[i] = s.charAt(i)-48;
	        }
	        for(int i=a.length-1; i>=0; i--) {
	        	System.out.println(i);
	        	System.out.println((int)(a[i]*Math.pow(2, j)));
	        	j++;
	        }
	}
}
