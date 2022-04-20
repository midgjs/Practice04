package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		
		double[] dArray = new double[3];
		dArray[0] = 1.2;
		dArray[1] = 3.3;
		dArray[2] = 6.7;
		
		for(int i=2; i>=0; i=i-1) {
			System.out.println(dArray[i]);
		}
		
	}

}
