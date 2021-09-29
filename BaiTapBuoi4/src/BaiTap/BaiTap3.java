package BaiTap;
import java.util.Scanner;
import java.lang.Math;

public class BaiTap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		float a = 0;
		
		System.out.println("Test data:");
		a = input.nextFloat();
		
		if(a>0) {
			if(Math.abs(a)<1) {
				System.out.println("Small negative number");
			}
			else if(Math.abs(a)>1000000) {
				System.out.println("Large negative number");
			}
			else {
				System.out.println("Negative number");
			}
			
		}
		else if(a<0) {
			if(Math.abs(a)<1) {
				System.out.println("Small positive number");
			}
			else if(Math.abs(a)>1000000) {
				System.out.println("Large positive number");
			}
			else {
				System.out.println("Positive number");
			}
		}
		else
			System.out.println("zero");
	}

}
