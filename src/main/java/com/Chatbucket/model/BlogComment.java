package com.Chatbucket.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class BlogComment {
@Id@GeneratedValue
	private int commentid;
	private int blogid;
	private String title;
	private String blog_comment;
	public int getCommentid() {
		return commentid;
	}
	public void setCommentid(int commentid) {
		this.commentid = commentid;
	}
	
	
	public int getBlogid() {
		return blogid;
	}
	public void setBlogid(int blogid) {
		this.blogid = blogid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBlog_comment() {
		return blog_comment;
	}
	public void setBlog_comment(String blog_comment) {
		this.blog_comment = blog_comment;
	}
	
	
	
	
}
