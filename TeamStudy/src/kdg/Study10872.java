package kdg;

import java.util.Scanner;
//2021-02-08 XIT 스터디
public class Study10872 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		scan.close();
		
		int sum = factorial(num);
		System.out.println(sum);
	}
	
	
	public static int factorial(int num) {
		if(num <= 1) {
			return 1;
		}
		return num * factorial(num - 1);		
	}

}
