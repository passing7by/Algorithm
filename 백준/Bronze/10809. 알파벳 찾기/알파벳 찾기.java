import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//1. 단어 S가 입력됨 (알파벳 소문자로만 이루어져 있음, 길이 : 1 ~ 99)
		//2. 단어에서 a가 처음 등장하는 위치 ~ z가 처음 등장하는 위치를 공백으로 구분하여 출력
		//	 (조건 : 단어의 첫 번째에 등장한다면 0, 등장하지 않는다면 -1)
		//영어 알파벳은 A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z로 총 26개
		
		/*
		 로직을 어떻게 짜야 하지?
		 예를 들어, 알파벳 o를 찾는다고 하면,
		 문자엘을 순서대로 살펴보면서 알파벳 o인지 아닌지를 검증하고
		 만약에 맞다면, 그 알파벳이 몇 번째 순서에 있는지 저장한 다음
		 바로 순회를 빠져나와야 함
		 
		 근데 알파벳 문자로 검증하려고 하면, 조건이 너무 많아지니까
		 알파벳 대신 아스키 코드로 접근해보자
		 */
		
		//우선, 주어진 문자열을 아스키 코드로 바꿔 보자
//		String str = "baekjoon";
//		System.out.println(str.charAt(0)+0); //b의 아스키코드에 해당하는 98이 출력됨
		
		//아스키코드 97 ~ 122까지 순회해 보자
//		for (int i = 97; i <= 122; i++) {
//			System.out.println(i);
//		}
		
		//아스키코드 97 ~ 122 를 돌며 문자열에 해당 아스키코드에 맞는 문자가 있는지 검증해보자
		/*
		for (int i = 97; i <= 122; i++) {
			int index = 0;
			for (char c : str.toCharArray()) {
				int asciiC = c+0; //c의 아스키코드
				if (asciiC == i) {
					System.out.println("문자 : "+c);
					System.out.println("아스키코드 : "+asciiC);
					System.out.println("위치 : "+index);
					System.out.println("");
					break; //맨 처음에 해당되는 것의 정보만 출력하고, for문을 빠져나옴
				} //if

				index++;
			} //for
		} //for
		*/
		
		//i에 해당하는 문자가 없으면 -1을 출력해보자....
		/*
		for (int i = 97; i <= 122; i++) {
			int index = 0;
			boolean isContain = false;
			for (char c : str.toCharArray()) { //문자열 for문을 다 돌았는데도 없으면... 없으면을 어떻게 검증?
				int asciiC = c+0; //c의 아스키코드
				if (asciiC == i) {
					System.out.println("문자 : "+c);
					System.out.println("아스키코드 : "+asciiC);
					System.out.println("위치 : "+index);
					System.out.println("");
					isContain = true;
					break; //맨 처음에 해당되는 것의 정보만 출력하고, for문을 빠져나옴
				} //if

				index++;
			} //for
			
			if (!isContain) {
				System.out.println(-1);
			} //if
		} //for
		*/
		
		//완성된 코드
		//1. 
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		//2.
		for (int i = 97; i <= 122; i++) {
			int index = 0;
			boolean isContain = false;
			for (char c : input.toCharArray()) { //문자열 for문을 다 돌았는데도 없으면... 없으면을 어떻게 검증?
				int asciiC = c+0; //c의 아스키코드
				if (asciiC == i) {
					System.out.print(index + " ");
					isContain = true;
					break; //맨 처음에 해당되는 것의 정보만 출력하고, for문을 빠져나옴
				} //if

				index++;
			} //for
			
			if (!isContain) {
				System.out.print(-1 + " ");
			} //if
		} //for
		
	} //main
} //Main