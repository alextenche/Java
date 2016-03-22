import java.io.Console;
import java.util.Random;

public class MiniGolf {


  public static void main(String[] args) {
    Console console = System.console();
    Random luck = new Random();

    int numberOfTries = 0;
    boolean ballInHole = false;

    do {
      console.printf("Trying to score a hit...\n");
      ballInHole = luck.nextBoolean();
      numberOfTries++;
    } while(!ballInHole);

    console.printf("You got it in %d tries. ", numberOfTries);
  }
}
