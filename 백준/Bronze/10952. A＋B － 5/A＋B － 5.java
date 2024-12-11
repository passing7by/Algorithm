import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1. 숫자 두 개 입력
		//2. 결과 출력
		//만약 숫자 두 개가 0이면, 결과를 출력하지 않음
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = Integer.parseInt(sc.nextLine().trim());
			
			if(a==0 && b==0) {
				break;
			} else {
				System.out.println(a+b);
			}
		}
		
		sc.close();

	}
}