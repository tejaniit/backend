package com.Chatbucket.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Chatbucket.model.Blog;
import com.Chatbucket.model.BlogComment;
@Transactional
@Repository
@ComponentScan("com")
public class BlogCommentDaoImpl implements BlogCommentDao{
@Autowired
	SessionFactory sessionfactory;
	public void addComment(BlogComment blogComment) {
	
	
		sessionfactory.getCurrentSession().save(blogComment);
	}

	public List<BlogComment> viewComments(int blogid) {
		System.out.println("in comment daoimpl");
		Criteria ct=sessionfactory.getCurrentSession().createCriteria(BlogComment.class);
		 ct.add(Restrictions.eq("blogid", blogid));
		 List<BlogComment> list=ct.list();
		 Iterator <BlogComment>it =list.iterator();
		 while(it.hasNext())
		 {
			 BlogComment bc=(BlogComment)it.next();
			 System.out.println(bc.getBlog_comment());
		 }
		 
		return list;
	}

	public Blog get( int blogid) {
		// TODO Auto-generated method stub
		String hql="from Blog where blog_id="+blogid;
		System.out.println(hql);
	 Session s=sessionfactory.openSession();
	 Transaction t= s.beginTransaction();
	 Query query=s.createQuery(hql);
	 List<Blog> list=query.list();
	 if (list==null)
	 {
		 return null;
	 }
	 else {
		 System.out.println("get method");
		 t.commit();
		s.close();
		 return list.get(0);
	 }
	 
		
	}

}
