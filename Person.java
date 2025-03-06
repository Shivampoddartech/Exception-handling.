package Exception_1;

public class Person {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End");
	}
}
