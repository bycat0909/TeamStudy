package jung;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BOK1157 {

	/*
	 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
	 * 단, 대문자와 소문자를 구분하지 않는다.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] word = scan.next().toUpperCase().toCharArray();					//입력받은 단어의 문자배열
		Map<Character, Integer> resultMap = new HashMap<Character, Integer>();	//알파벳 당 개수 결과 map
		int maxCount = 0;		//최대 사용개수
		char maxAlpabet = ' ';	//최다 사용 알파벳
		
		/*
		 * 알파벳 개수 count
		 * - 결과 map에 존재하는 알파벳의 경우 개수 세기 pass
		 */
		int wordLength = word.length;
		for (int i = 0; i < wordLength; i++) {
			int count = 0;	//알파벳 사용개수
			char alpabet = word[i];	//해당 인덱스의 알파벳
			if(!resultMap.containsKey(alpabet)){
				for (int j = 0; j < wordLength; j++) {
					count += (alpabet == word[j]) ? 1 : 0;
				}
				resultMap.put(alpabet, count);
			}
			
			/*
			 * 최대사용개수와 비교
			 * - 최대사용개수보다 클 경우 max로 개수, 알파벳 set
			 */
			if(count >= maxCount) {
				maxCount = count;
				maxAlpabet = alpabet;
			}
		}
		
		/*
		 * 최다 사용 알파벳 여러개 존재 여부 check
		 * - 최다 사용 알파벳 이외에 다른 알파벳이 존재할 경우, ?로 set
		 */
		resultMap.remove(maxAlpabet);	//최대 개수 알파벳 결과 map에서 제거
		if (resultMap.containsValue(maxCount)) {
			maxAlpabet = '?';
		}
		
		/*
		 * 결과 출력 
		 */
		System.out.println(maxAlpabet);
	}
}
