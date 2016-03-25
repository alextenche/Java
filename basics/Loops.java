
public class Loops {

	static private String[] months = { "January", "February", "March",
													    "April", "May", "June",
														"July", "August", "September",
														"October", "November", "December"};

	public static void main(String[] args) {

		System.out.println("\n----------for------------\n");

		for (int i = 0; i < months.length; i++) {
			System.out.print(months[i] + " ");
		}

		System.out.println("\n----------foreach------------\n");

		for (String month : months) {
			System.out.print(month + " ");
		}

		System.out.print("\n----------while------------\n");

		int counter = 0;
		while (counter < months.length) {
			System.out.print(months[counter] + " ");
			counter++;
		}

		System.out.print("\n----------do{..}while------------\n");

		counter = 0;
		do  {
			System.out.print(months[counter] + " ");
			counter++;
		}while(counter < months.length);



	}


}
