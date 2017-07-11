package com.Chatbucket.dao;

import java.util.List;

import com.Chatbucket.model.Forum;

public interface ForumDao {
	void addForum(Forum forum);

	List<Forum> viewForums();

	void deleteForum(Forum forum);
	void updateForum(Forum forum);
	List<Forum> viewForum(String status);
}
