import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();
		
		//1. 세 문자를 수로 생각했을 때
		System.out.println(Integer.parseInt(A)+Integer.parseInt(B)-Integer.parseInt(C));
		
		//2. 세 문자를 문자열로 생각했을 때
		String AB = A+B;
		
		System.out.println(Integer.parseInt(AB)-Integer.parseInt(C));
	}
}