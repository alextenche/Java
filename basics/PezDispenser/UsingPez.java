public class UsingPez {

    public static void main(String[] args) {

      System.out.println("Making a new Pez Dispenser");

      PezDispenser dispenser = new PezDispenser("Alex");
      System.out.printf("The dispenser character is %s\n", dispenser.getCharacterName());
    }
}
