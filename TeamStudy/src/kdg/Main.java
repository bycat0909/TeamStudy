package kdg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.");
		System.out.println("두개의 정수를 입력해주세요..");
        System.out.println("12341234");
		int a = 0;
		int b = 0;
        while(true) {
        	a = scan.nextInt();
        	b = scan.nextInt();
        	if(!(a<10&&b<10)) {
        		System.out.println("10보다 큰 정수 입력시 시스템이 멈춥니다..");
        		break;
        	}else {
        		System.out.print("a+b=");
        		System.out.println(a + b);
        		System.out.println("추가적으로 입력이 가능합니다..");
        	}
        }

	}

}
