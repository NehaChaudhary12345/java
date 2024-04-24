package SoftwareTesting;

import java.util.Scanner;


 class AreaRectangle {
	int  Area,length,width;
	
	void setDim () {
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter length of Rectangle" + length); 
		length = input.nextInt();
		System.out.println("Enter width of Rectangle" + width); 
		width = input.nextInt();
		
		
		
		//input.close();
	}
	void getArea () {
		System.out.println("Area of Rectangle" + Area);
		Area = length * width;
	
	}
	
	
	
	public static void main(String[] args) {
		AreaRectangle r = new AreaRectangle();
		r.setDim();
		r.getArea();
		

	}

}
