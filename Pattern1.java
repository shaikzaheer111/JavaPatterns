package pattern;
import java.util.*;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nr,nc,r,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows :");nr=s.nextInt();
		System.out.println("Enter number of columns :"); nc=s.nextInt();
		
		for(r=1;r<=nr;r++) {
			for(c=1;c<=nc;c++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		

	}

}
