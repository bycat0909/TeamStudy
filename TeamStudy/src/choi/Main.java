package choi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	/*
	 * BOK 10872
	 * 재귀함수 팩토리얼
	 * 1 = 1
	 * 2 = 2
	 * 3 = 6
	 * 4 = 24
	 * 5 = 120
	 * 6 = 720 
	 * 7 = 5040
	 * 8 = 40320
	 * 9 = 362880
	 * 10 = 3628800
	 * 11 = 39916800
	 * 12 = 479001600
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println(factorial(sc.nextInt()));
	}
	
	public static int factorial(int a){
		if(a <= 1){
			return  a == 0 ? 1 : a;
		}else{
			return factorial(a - 1) * a;
		}
	}
}
