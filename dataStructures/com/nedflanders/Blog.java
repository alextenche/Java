package com.nedflanders;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Blog {
	List<BlogPost> mPosts;

	public Blog(List<BlogPost> posts) {
		mPosts = posts;
	}

	public List<BlogPost> getPosts() {
		return mPosts;
	}

	public Set<String> getAllAuthors() { 
		Set<String> allAuthors = new TreeSet<String>();
		for(BlogPost blogPost : getPosts()){
			allAuthors.add(blogPost.getAuthor());
		}
		return allAuthors;
	}

	public Map<String, Integer> getCategoryCounts(){
		Map<String, Integer> categoryCounts = new HashMap<String, Integer>();
		for(BlogPost blogPost : getPosts()){
			String category = blogPost.getCategory();
			Integer count = categoryCounts.get(category);
			if(count == null){
				count = 0;
			}
			count++;
			categoryCounts.put(category, count);
		}
		return categoryCounts;
	}
	
}
