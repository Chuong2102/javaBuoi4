package BaiTap;
import java.util.Scanner;
public class BaiTap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a,b,c;
		int result = 0;
		
		System.out.println("Nhap a");
		a = input.nextInt();
		//
		System.out.println("Nhap b");
		b = input.nextInt();
		//
		System.out.println("Nhap c");
		c = input.nextInt();
		
		if(a>b) {
			if(a>c)	
				result = a;
			else
				result = c;
		}
		else {
			if(b>c)
				result = b;
			else
				result = c;
		}
		//
		System.out.print("So lon nhat la`: " + result);
		
	}

}
