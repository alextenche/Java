import java.util.Arrays;
import java.util.Date;

import com.nedflanders.Tweet;
import com.nedflanders.Tweets;

public class Example {

  public static void main(String args[]) {

    Tweet tweet = new Tweet("noob", "Hello to all new java tudents, out there!", new Date(1424960247000L));
    Tweet secondTweet = new Tweet("another noob", "learning Java is funn", new Date());
    Tweet thirdTweet = new Tweet(
      "journeytocode",
      "@treehouse makes learning Java sooooo fun! #treet",
      new Date(1421878767000L)
    );

    System.out.printf("This is a new treet: %s %n", tweet);
    System.out.println("The words are:");
    for(String word : tweet.getWords()){
      System.out.println(word);
    }

    Tweet[] tweets = {tweet, secondTweet, thirdTweet};
    Arrays.sort(tweets);
    for(Tweet exampleTweet : tweets){
      System.out.println(exampleTweet);
    }
    Tweets.save(tweets);
    Tweet[] reloadedTweets = Tweets.load();
    for(Tweet reloaded : reloadedTweets) {
      System.out.println(reloaded);
    }

  }

}
