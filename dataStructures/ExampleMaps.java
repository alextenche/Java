package com.nedflanders;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExampleMaps {

	public static void main(String[] args) {
		Map<String, String> acronyms = new HashMap<String, String>();                                                                                                                                                                                                                                                                                                
		acronyms.put("Alex", "ok");                                                                                                                                                                                                                                                                                                                                                               
		acronyms.put("dry", "dont repeat yourself");                                                                                                                                                               
		acronyms.containsKey("kiss");                                                                                                                                                                              
		acronyms.containsKey("dry");                                                                                                                                                                               
		acronyms.put("kiss", "keep it simple stupid");                                                                                                                                                             
		Set<String> allAcronyms = acronyms.keySet();                                                                                                                                                               
		for(Map.Entry entry : acronyms.entrySet()){
			System.out.printf("%s stands for %s %n", entry.getKey(), entry.getValue());
		}
		
		Tweet firstTweet = new Tweet("noob", "Hello to @all new #Java #students, out there!", new Date(1424960247000L));
	    Tweet secondTweet = new Tweet("another noob", "learning #Java is funn", new Date());
	    Tweet thirdTweet = new Tweet("journeytocode","@treehouse makes learning #Java sooooo fun! #tweet", new Date(1421878767000L));
	    
	    Tweet[] tweets = {firstTweet, secondTweet, thirdTweet};
		Map<String, Integer> hashTagCounts = new HashMap<String, Integer>();
		for(Tweet tweet : tweets){
			for(String hashTag: tweet.getHashTags()){
				Integer count = hashTagCounts.get(hashTag);
				if(count == null){
					count = 0;
				}
				count++;
				hashTagCounts.put(hashTag, count);
			}
		}
		System.out.printf("Hash tag counts: %s %n", hashTagCounts);
		
		Map<String, List<Tweet>> tweetsByAuthor = new HashMap<String, List<Tweet>>();
		for(Tweet tweet : tweets){
			List<Tweet> authoredTweets = tweetsByAuthor.get(tweet.getAuthor());
			if(authoredTweets == null){
				authoredTweets = new ArrayList<Tweet>();
				tweetsByAuthor.put(tweet.getAuthor(), authoredTweets);
			}
			authoredTweets.add(tweet);
		}
		System.out.printf("Tweets by author: %s %n", tweetsByAuthor);
		System.out.printf("Tweets by noob: %s %n", tweetsByAuthor.get("noob"));
	}

}
