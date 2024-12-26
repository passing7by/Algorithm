import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//1. 한 줄에 숫자 하나씩, 10개의 숫자가 입력됨 (범위 : 1 ~ 1,000)
		//2. 숫자들을 42로 나눈 나머지를 구함
		//3. 서로 다른 나머지가 몇 개 있는지 출력
		
		/*
		 숫자를 돌면서 나머지를 구하고
		 구한 나머지들이 서로 같은지 어떻게 검증하지?
		 그리고 서로 같은지 검증한 뒤에 서로 다른게 몇 개 있는지는 어떻게 구하지?
		 */
		
		//배열에서 중복을 제외하고 배열을 출력해 보자
		/*
		int[] arr = {1, 1, 5, 8, 6, 4, 1, 32, 5, 8};
		int[] arr2 = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr2[j] = 1;
					break;
				} //if
			} //for
		} //for

		int num = 0; //서로 다른 숫자의 총 갯수 선언
		for (int i : arr2) {
			num += i;
		} //for
		
		//서로 다른 숫자의 총 갯수 출력
		System.out.println(num);
		*/
		
		//내가 작성한 답안
		/*
		//1. & 2.
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt()%42;
		}
		
		//3.
		int[] arr2 = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr2[j] = 1;
					break;
				} //if
			} //for
		} //for

		int num = 0; //서로 다른 숫자의 총 갯수 선언
		for (int i : arr2) {
			num += i;
		} //for
		
		//서로 다른 숫자의 총 갯수 출력
		System.out.println(num);
		*/
		
		//HashSet를 사용한 답안
		Scanner sc = new Scanner(System.in);
		
		HashSet<Integer> remainders = new HashSet<Integer>(); //중복을 허용하지 않는 자료구조
		
		//10개의 입력을 처리하며 나머지를 HashSet에 저장
		for (int i = 0; i < 10; i++) {
			remainders.add(sc.nextInt() % 42);
		}
		
		//서로 다른 나머지 값의 개수 출력
		System.out.println(remainders.size());
		
	} //main
} //Main