import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		
		boolean mixed = true;
		boolean descending = true;
		boolean ascending = true;
		
		for (int i = 0; i < arr.length; i++) {
			if(i+1 != Integer.parseInt(arr[i])) {
				// 무조건 mixed거나 descending
				ascending = false;
			}else {
				// ascending 일수도...
			}
		} //for
		
		if (!ascending) {
			// 무조건 mixed거나 descending
			int j = 0;
			for (int i = arr.length-1; i >= 0; i--) { //7 6 5 4 3 2 1 0
				if(i+1 != Integer.parseInt(arr[j])) { //8 != arr[0]
					// 무조건 mixed
					descending = false;
				}else {
					// 무조건 descending
				}
				j++;
			} //for
			if (!descending) {
				System.out.println("mixed");
			}else {
				System.out.println("descending");
			}
		} else {
			// 무조건 ascending
			System.out.println("ascending");
		}
	}
}