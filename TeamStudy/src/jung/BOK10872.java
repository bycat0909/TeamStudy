package jung;

import java.io.IOException;
import java.util.Scanner;

public class BOK10872 {

	/*
	 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
	 * 첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()) {
			int factorial = scan.nextInt();
			if(factorial >= 0 && factorial <=12) {
				int result= 1;
				//while문 사용
				while (factorial>0) {
					result *= factorial;
					factorial--;
				}
				//for문 사용
//				for (; factorial > 0; factorial--) {
//					result *= factorial;
//				}
				System.out.println(result);
			}
		}
		scan.close();							//스캐너 종료
	}
}
