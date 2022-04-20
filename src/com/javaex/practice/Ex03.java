package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intA = { 3, 6, 9 };
		
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		}
		//intA와 intB는 주소값이 같다(같은 배열을 가리킨다)
		/*
		 20
		 6
		 10
		 */
	}

}
