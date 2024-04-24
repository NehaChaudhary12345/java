package SoftwareTesting;

public class Example12 {

	public static void main(String[] args) {
		int i=10,j=10,a,b=20,c=33,d=20,k=120;
		
		
		if(i == 10) {

			if(j < 20) 
				a = b;
			if(k > 100) 
				c = d;
			else a = c; // this else refers to if(k > 100)
			 System.out.println("  " + d);
			}

			else a = d; // this else refers to if(i == 10)
     System.out.println("  " + d);
	}

}
