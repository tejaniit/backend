package com.Chatbucket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Chatbucket.dao.BlogCommentDao;
import com.Chatbucket.model.Blog;
import com.Chatbucket.model.BlogComment;

@RestController
public class BlogCommentController {
@Autowired
	BlogCommentDao blogCommentDao;
@Autowired
Blog b;
@Autowired
BlogComment bc;

@RequestMapping(value="/addComment",headers="accept=Application/json",method=RequestMethod.POST)
public void addComment(@RequestBody BlogComment blogComment )
{
	// int id=Integer.parseInt(blogid);
	 b=blogCommentDao.get(2);
	 //System.out.println(blogid);
	 blogComment.setTitle(b.getTitle());
	System.out.println("in comment controller "+blogComment.getTitle()+blogComment.getBlog_comment());
	blogCommentDao.addComment(blogComment);
}
@RequestMapping(value="/viewComments/{blogid}",headers="accept=Application/json",method=RequestMethod.GET)
public List<BlogComment> viewComments(@PathVariable("blogid") int blogid)
{
	System.out.println("in comment controller");
	return blogCommentDao.viewComments(blogid);
	
}

}

