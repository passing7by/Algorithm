import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
        int result = A * B * C;
		
		String resultStr = Long.toString(result);
		
		int[] arr = new int[10];
		
		for (char c : resultStr.toCharArray()) {
			arr[Character.getNumericValue(c)]++;
		} //for
		
		for (int i : arr) {
			System.out.println(i);
		} //for
	}
}