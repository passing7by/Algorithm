import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int result = s.nextInt();
		
		if(result>=0 && result<=100) {
			if(result>=90) System.out.println("A");
			else if(result>=80) System.out.println("B");
			else if(result>=70) System.out.println("C");
			else if(result>=60) System.out.println("D");
			else System.out.println("F");
		}
		
	}

}
