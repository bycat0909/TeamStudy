package choi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOK10951 {

	/*
	 * BOK 10951
	 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	 * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
	 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 1. 입력받고 공란 입력시 프로그램 종료
		 * 문제점.
		 * 이클립스 에서는 NoSuchElement가 안나오는데
		 * 알고리즘에 올리면 에러가 남...
		 * 해결.
		 * 검색해보니 엔터키 자체가 입력이고 그 다음 자료가 있는지 없는지를 확인해서 프로그램을 종료해야함
		 * Sacnner의 hasNext()를 사용해서 해결하기로 함.
		 */
		//입력
		List<String> strArr = insertData();
		outData(strArr);
	}
	
	public static List<String> insertData(){
		List<String> strArr = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		String a;
		while(sc.hasNext()){
			a = sc.nextLine();
			strArr.add(a);
		}
		
		return strArr;
	}
	
	public static int sumData(String a, String b){
		int result =0;
		result = Integer.parseInt(a) + Integer.parseInt(b);
		return result;
	}

	public static void outData(List<String> strArr){
		for(String val : strArr){
			String[] value = val.split(" ");
			int result = sumData(value[0], value[1]);
			System.out.println(result);
		}
	}
	

}
