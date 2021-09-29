package BaiTap;

import java.util.Scanner;
import java.lang.Math;

public class baiTap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int ngay, soDu;
		
		System.out.println("Nhap so ngay bat ki:");
		ngay = input.nextInt();
		
		soDu = ngay%7;
		System.out.println(soDu);
		
		switch(soDu) {
		case 1: System.out.println("Monday");
		break;
		
		case 2: System.out.println("Tuesdat");
		break;
		
		case 3: System.out.println("Wednesday");
		break;
		
		case 4: System.out.println("Thirsday");
		break;
		
		case 5: System.out.println("Friday");
		break;
		
		case 6 : System.out.println("Saturday");
		break;
		
		case 0: System.out.println("Sunday");
		break;
		}
	}

}
