package jung;

import java.util.Scanner;

/*
 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.
 */
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()) {
			int factorial = scan.nextInt();
			if(factorial >= 0 && factorial <=12) {
				int result= 1;
				while (factorial>0) {
					result *= factorial;
					factorial--;
				}
//				for (; factorial > 0; factorial--) {
//					result *= factorial;
//				}
				System.out.println(result);
			}
		}
		scan.close();							//스캐너 종료
	}

}
