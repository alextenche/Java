package com.nedflanders;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		
		Tweet firstTweet = new Tweet("noob", "Hello to @all new #Java #students, out there!", new Date(1424960247000L));
	    Tweet secondTweet = new Tweet("another noob", "learning #Java is funn", new Date());
	    Tweet thirdTweet = new Tweet("journeytocode","@treehouse makes learning #Java sooooo fun! #tweet", new Date(1421878767000L));
	    
	    Tweet[] tweets = {firstTweet, secondTweet, thirdTweet};
		System.out.printf("There are %d treets. %n", tweets.length);
		Tweet originalTweet = tweets[0];
		
		System.out.println("Hashtags: ");
		for(String hashtag : originalTweet.getHashTags()){
			System.out.println(hashtag);
		}
		
		Set<String> allHashTags = new HashSet<String>();
		Set<String> allHashMentions = new TreeSet<String>();
		for(Tweet tweet : tweets){
			allHashTags.addAll(tweet.getHashTags());
			allHashMentions.addAll(tweet.getMentions());
		}
		System.out.printf("Hash tags: %s %n", allHashTags);
		System.out.printf("Mentions: %s %n", allHashMentions);
	}

}
