import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//모든 수의 범위 : 1 ~ 10,000
		//1. 첫째 줄에 수열의 길이, 기준값 입력됨
		//2. 수열을 이루는 숫자가 사이에 공백을 두고 입력됨 (적어도 하나는 기준값보다 작음)
		//3. 기준값보다 작은 수를, 사이에 공백을 두고 입력받은 순서대로 출력
		
		//일단은 입력받은 순서대로 출력해야 한다는 조건을 빼고 생각해보자
//		int[] arr = {1, 10, 4, 9, 2, 3, 8, 5, 7, 6};
//		int std = 5;
		
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		int std = sc.nextInt();
		
		int[] arr = new int[length];
		for(int i=0; i<length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//출력
		String out = "";
		
		for(int num : arr) {
			if(num < std) {
				out += num + " ";
			} //if
		} //for
		
		System.out.println(out.trim());
	}
}