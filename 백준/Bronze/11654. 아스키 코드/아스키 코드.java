import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//숫자 0~9 : 48~57 (1씩 증가)
		//대문자 : 65~90 (1씩 증가)
		//소문자 : 97~122 (1씩 증가)
		
		Scanner sc = new Scanner(System.in);
		
		char input = sc.next().charAt(0);
		int result = (int) input;
		System.out.println(result);
	}
}