import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1. 단어 입력
		//2. 숫자 입력 (0 혹은 양수이며, 단어의 길이를 넘을 수 없음)
		//3. 숫자번째 글자 출력
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		int num = Integer.parseInt(sc.nextLine());
		
		int length = word.length();
		
		if(num>=0 && num<=length) {
			char result = word.charAt(num-1);
			System.out.println(result);
		}
	}
}