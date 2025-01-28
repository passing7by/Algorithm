import java.util.Scanner;

public class Main {
	public String chackPalindrome(String str) {
		String answer = "no";
		
		String reverseStr = new StringBuilder(str).reverse().toString();
		if (str.equals(reverseStr)) {
			answer = "yes";
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		/*
		String str = "123";
		String reverseStr = new StringBuilder(str).reverse().toString();
		System.out.println(reverseStr);
		*/
		
		Main m = new Main();
		
		// 입력
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		
		while (flag) {
			String str = sc.next();
			if (str.equals("0")) {
				flag = false;
			} else {
				System.out.println(m.chackPalindrome(str));
			}
		}
	}
}