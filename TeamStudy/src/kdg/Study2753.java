package kdg;

import java.util.Scanner;
//2021-02-01 XIT 스터디
public class Study2753 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int year = scan.nextInt();
		int answer = 0;
		//4의 배수이면서 100의 배수가아니거나 400의배수일때
		if(year%4==0 && (year%100!=0 || year%400==0)) {
			answer = 1;
		}//아닐때 0
		else {
			answer = 0;
		}
		
		System.out.print(answer);
		
	}

}
