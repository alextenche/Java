public class Booleans {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;

		System.out.println("The value of b1 is " + b1);

		int i = 1;
		boolean b4 = (i != 0);
		System.out.println("The value of b4 is " + b4);

		String s = "xyz";
		boolean b5 = Boolean.parseBoolean(s);
		System.out.println("The value of b5 is " + b5);

	}
}
