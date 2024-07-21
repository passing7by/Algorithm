package baekjoon;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int H = s.nextInt()	;
		int M = s.nextInt()	;
		
		int CH = 0;
		int CM = 0;

		int totalM = H*60+M;
		int chageM = totalM-45;
		
		if(chageM>=45) {
			CH = chageM/60;
			CM = chageM%60;
			System.out.println(CH+" "+CM);

		}else {
			CH = 23;
			CM = 60+(chageM%60);
			System.out.println(CH+" "+CM);

		}
	}
}
