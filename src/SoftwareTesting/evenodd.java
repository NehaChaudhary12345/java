package SoftwareTesting;

import java.io.IOException;

public class evenodd {

	public static void main(String[] args) 
	throws IOException{
	
			
	int i;
	//System.out.println("enter number \n");
	//num= (char) System.in.read();
		for( i =1;i<100; i++)
			
			
		if(i % 2 == 0 ) {
			
			System.out.println("\n" +i +"\t Even number");
		}
			
		else 
		{
			System.out.println("\n" +i +"\t Odd number");
		
		}
			
	}

}
