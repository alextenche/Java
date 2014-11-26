import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;

public class SwitchWithInts {

	public static void main(String[] args) {
	
		String iput = getInput("Enter a number betwen 1 and 12: ");
		int month = Integer.parseInt(iput);
		
		switch (month) {
		case 1:
			System.out.println("The month is January");	
			break;
		case 2:
			System.out.println("The month is February");	
			break;
		case 3:
			System.out.println("The month is March");	
			break;

		default:
			System.out.println("The chose another month");
			break;
		}

	}
	
	private static String getInput(String prompt) {
		BufferedReader stdin = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.print(prompt);
		System.out.flush();
		
		try {
			return stdin.readLine();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}

}
