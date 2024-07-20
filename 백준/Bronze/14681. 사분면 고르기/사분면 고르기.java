import java.util.Scanner;

public class Main {
	int x;
	int y;
	
	Main(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public int judgeNum(int x, int y) {
		int quad=0;
		
		if(x>0) {
			if(y>0) quad=1;
			else if(y<0) quad=4;
		}
		
		if(x<0) {
			if(y>0)	quad=2;
			else if(y<0) quad=3;
		}
		
		return quad;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt()	;
		int y = s.nextInt()	;
		
		Main m = new Main(x,y);
		
		System.out.println(m.judgeNum(x, y));

		
		
	}
}
