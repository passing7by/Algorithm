import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1. 케이스 갯수 입력
		//2. 케이스의 갯수만큼 A+B 입력
		//3. A+B 결과 출력
		
		//1. 케이스 갯수 입력
		Scanner s = new Scanner(System.in);
				
		//2. 케이스의 갯수만큼 A+B 입력
		while (s.hasNextInt()) {
			int first = Integer.parseInt(s.next());
			int second = Integer.parseInt(s.nextLine().trim());
			
			int result = first + second;
			System.out.println(result);
		}
		
		s.close();
	}
}