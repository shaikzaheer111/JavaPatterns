package pattern;
import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nr,nc,r,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows :");nr=s.nextInt();
		System.out.println("Enter the number of columns :");nc=s.nextInt();
		
		for(r=1;r<=nr;r++) {
			for(c=1;c<=nc;c++){
				if(c%2==0)System.out.print(0+" ");
				else System.out.print(1+" ");
			}
			System.out.println("");
		}
		

	}

}
