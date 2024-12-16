import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int length =sc.nextInt();
		
		char[] arr = new char[length];
		
		for (int j = 0; j < length; j++) {
			arr[j] = ' ';
		}
		
		for (int j = 0; j < length; j++) {
			int num = length-1-j;
			
			arr[num] = '*';
			
			System.out.println(arr);
		}
	}
}