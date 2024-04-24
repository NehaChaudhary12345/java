package SoftwareTesting;

public class Triangleparam {

	int area,parameter;
	void Triangle () {
		
		int base=3;
		int breath=4;
		int height=5;
		 
		area= (base*height)/2;
		parameter = base+breath+height;
		 System.out.println("Area of Triangle" + area);	
		 System.out.println("Area of Triangle" + parameter);	
	}
	
	
	
	public static void main(String[] args) {
         Triangleparam t =new Triangleparam();
         t.Triangle();
    
	}

}
