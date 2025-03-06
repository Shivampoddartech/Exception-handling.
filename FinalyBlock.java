package Exception_1;

public class FinalyBlock {
public static void main(String[] args) {
	System.out.println("Start");
	
	try {
		System.out.println(10/0);
	}
	catch(Exception e) {
		System.out.println("INVALID");
	}
	finally{
		System.out.println("every time execute");
	}
	
	System.out.println("End");
}
}
