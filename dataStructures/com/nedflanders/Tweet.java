package com.nedflanders;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.util.Date;

public class Tweet implements Comparable<Tweet>, Serializable{
	private static final long serialVersionUID = 4367232009744174223L;
	private String mAuthor;
	private String mDescription;
	private Date mCreationDate;

	// constructor
	public Tweet(String author, String description, Date creationDate) {
		mAuthor = author;
		mDescription = description;
		mCreationDate = creationDate;
	}

	@Override
	public String toString() {
		return String.format("Treet : \"%s\" by %s on %s", mDescription, mAuthor, mCreationDate);
	}

	@Override
	public int compareTo(Tweet other) {
		if(equals(other)){
			return 0;
		}
		int dateCmp = mCreationDate.compareTo(other.mCreationDate);
		if(dateCmp == 0){
			return mDescription.compareTo(other.mDescription);
		}
		return dateCmp;
	}

	public String getAuthor() {
		return mAuthor;
	}

	public String getDescription() {
		return mDescription;
	}

	public Date getCreationDate() {
		return mCreationDate;
	}

	public List<String> getWords() {
		String[] words = mDescription.toLowerCase().split("[^\\w#@']+");
		return Arrays.asList(words);
	}
	
	public List<String> getHashTags(){
		return getWordsPrefixedWith("#");
	}
	
	public List<String> getMentions(){
		return getWordsPrefixedWith("@");
	}
	
	private List<String> getWordsPrefixedWith(String prefix){
		List<String> results = new ArrayList<String>();
		for(String word : getWords()){
			if(word.startsWith(prefix)){
				results.add(word);
			}
		}
		return results;
	}
}