package BaiTap;
import java.util.Scanner;
public class BaiTap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = 0;

		System.out.println("Test data:");
		a = input.nextInt();
		if(a>0)
			System.out.println("Number is positive");
		else if(a<0)
			System.out.println("Number is negative");
	}

}
