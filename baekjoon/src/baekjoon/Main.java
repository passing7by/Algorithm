package baekjoon;

import java.util.Scanner;

public class Main {
	int H;
	int M;
	
	Main(int H, int M){
		this.H=H;
		this.M=M;
	}
	
	public String wakeUpSG(int H, int M) {
		int CH = 0;
		int CM = 0;

		int totalM = H*60+M;
		int chageM = totalM-45;
		
		if(H>=0 && H<=23 && M>=0 && M<=59) {
			if(chageM>=45) {
				CH = chageM/60;
				CM = chageM%60;
			}else {
				CH = 23;
				CM = 60+(chageM%60);
			}
		}
			
		return CH+" "+CM;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int H = s.nextInt()	;
		int M = s.nextInt()	;
		
		Main m = new Main(H,M);
		
		System.out.println(m.wakeUpSG(H, M));
	}
}
