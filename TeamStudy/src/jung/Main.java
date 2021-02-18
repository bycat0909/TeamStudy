package jung;

import java.util.Scanner;

/*
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
 * 단, 대문자와 소문자를 구분하지 않는다.
 */
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] alpabets = scan.next().toUpperCase().toCharArray();	//입력받은 단어의 문자배열
		int[] arrCount = new int[alpabets.length];					//알파벳 사용 개수를 담을 배열
		int maxCount = 0;		//최대 사용개수
		char maxAlpabet = ' ';	//최다 사용 알파벳
		
		/*
		 * 알파벳 개수 count
		 * - word의 길이 만큼 각 알파벳을 비교, 같으면 +1
		 */
		for (int i = 0; i < alpabets.length; i++) {
			int count = 0;	//알파벳 사용개수
			char alpabet = alpabets[i];	//해당 인덱스의 알파벳
			for (int j = 0; j < alpabets.length; j++) {
				if(alpabet == alpabets[j]) 
					count++;
			}
			arrCount[i] = count;
			
			/*
			 * 최대사용개수와 비교
			 * - 최대사용개수보다 클 경우 max로 개수, 알파벳 set
			 */
			if(count >= maxCount) {
				maxCount = count;
				maxAlpabet = alpabet;
			}
		}
		
		for (int k = 0; k < arrCount.length; k++) {
			if(arrCount[k] == maxCount && alpabets[k] != maxAlpabet) {
				if(alpabets[k] != maxAlpabet) {
					maxAlpabet = '?';
					break;
				}
			}
		}
		
//		Scanner scan = new Scanner(System.in);
//		String word = scan.next();	//입력받은 단어
//		word = word.toUpperCase();	//대문자로 변환
//		Map<String, Integer> resultMap = new WeakHashMap<String, Integer>();	//알파벳 : 사용개수
//		int maxCount = 0;		//최대 사용개수
//		String maxAlpabet = "";	//최다 사용 알파벳
//		
//		/*
//		 * 알파벳 개수 count
//		 * - word의 길이 만큼 각 알파벳을 비교, 같으면 +1
//		 */
//		for (int i = 0; i < word.length(); i++) {
//			int count = 0;	//알파벳 사용개수
//			String alpabet = String.valueOf(word.charAt(i));	//해당 인덱스의 알파벳
//			for (int j = 0; j < word.length(); j++) {
//				if(alpabet.equalsIgnoreCase(String.valueOf(word.charAt(j)))) 
//					count++;
//			}
//			resultMap.put(alpabet, count);
//			
//			/*
//			 * 최대사용개수와 비교
//			 * - 최대사용개수보다 클 경우 max로 개수, 알파벳 set
//			 */
//			if(count >= maxCount) {
//				maxCount = count;
//				maxAlpabet = alpabet;
//			}
//		}
//		
//		/*
//		 * 동일한 개수 있는지 비교
//		 * - 최대 알파벳 제외하고 동일한 개수의 알파벳 존재할 경우, max 알파벳 '?'
//		 */
//		resultMap.remove(maxAlpabet);
//		if(resultMap.containsValue(maxCount))
//			maxAlpabet = "?";
		
		/*
		 * 결과 출력 
		 */
		System.out.println(maxAlpabet);
	}
}
