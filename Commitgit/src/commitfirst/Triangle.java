package commitfirst;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int h;
		int b;
		double Area;
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter height");
		h = SC.nextInt();
		System.out.println("enter base");
        b = SC.nextInt();
        
        Area = h*b/2;
        System.out.println("Area is: " + Area);
	}

}
