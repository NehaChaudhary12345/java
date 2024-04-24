package SoftwareTesting;

public class Char {

	public static void main(String[] args) 
		throws java.io.IOException { 
			char ch;
			ch = (char) System.in.read(); // get a char
		do {
		System.out.print("Press a key followed by ENTER: " ); 
		
		} 
		while(ch != 'q');

	}

}
