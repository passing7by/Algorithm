import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1. 숫자를 입력
		//2. 숫자만큼 반복
		//반복은 1부터 시작
		
		Scanner s = new Scanner(System.in);
		
		int inputNum = s.nextInt();
		
		for (int i = 1; i <= inputNum; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}

	}

}