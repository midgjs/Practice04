package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};	
		//4,2,1,6 총 16개 '공백'은 [4]번 [7]번 [9]번
		
		for(int i=0; i<16; i++) {
			System.out.print(c[i]);
		}
		
		System.out.println("");
		
		
		for(int i=0; i<16; i++) {
			c[4] = ',' ;
			c[7] = ',' ;
			c[9] = ',' ;
			System.out.print(c[i]);
		}
	}

}
