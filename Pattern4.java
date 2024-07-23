package pattern;
import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int nr,nc,r,c,a=1;
		System.out.println("Enter the number of rows :"); nr=s.nextInt();
		System.out.println("Enter the number of columns :"); nc=s.nextInt();
		
		for(r=1;r<=nr;r++) {
			for(c=1;c<=nc;c++) {
				System.out.print(a+" ");
				a+=2;
			}
			System.out.println("");
		}
		
		
		
		
		

	}

}
