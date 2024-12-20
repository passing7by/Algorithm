import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//자연수 N의 범위 : 1 ~ 100,000
		//1. 자연수가 주어짐
		//2. 1 ~ 주어진 자연수까지 각 행마다 숫자 하나씩 출력
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.println(i);
		}
	}
}