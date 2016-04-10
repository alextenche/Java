package com.nedflanders;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Course {
	private String mTitle;
	private Set<String> mTags;

	public Course(String title) {
		mTitle = title;
		mTags = new HashSet<String>();
	}

	public void addTag(String tag) {
		mTags.add(tag);
	}

	public void addTags(List<String> tags) {
		for(String tag : tags) {
			mTags.add(tag);
		}
	}

	public boolean hasTag(String tag) {
		// TODO: Return whether or not the tag has been added
		if(mTags.contains(tag)) {
			return true;
		}
		return false;
	}

	public String getTitle() {
		return mTitle;
	}

}