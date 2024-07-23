package pattern;
import java.util.*;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nr,nc,r,c;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of rows :"); nr=s.nextInt();
		System.out.print("Enter the number of cols :"); nc=s.nextInt();
		
		for(r=1;r<=nr;r++) {
			int a=1;
			for(c=1;c<=nc;c++) {
				if(c%2==0) System.out.print(r+" ");
				else System.out.print(a++ +" ");
			}
			System.out.println(" ");
		}

	}

}
