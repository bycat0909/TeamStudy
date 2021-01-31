package choi;

import java.util.Scanner;

public class BOK2753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int check = 0;
		if(year%4 == 0){
			check = 1;
			if(year % 400 != 0 &&year % 100 == 0){
				check = 0;
			}
		}
		System.out.println(check);
	}
}
