package pattern;
import java.util.*;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nr,nc,r,c,a=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of rows :"); nr=s.nextInt();
		System.out.print("Enter the number of Columns :"); nc=s.nextInt();
		
		for(r=1;r<=nr;r++) {
			for(c=1;c<=nc;c++) {
				a+=2;
				System.out.print(a+" ");
			}
			System.out.println("");
		}

	}

}
