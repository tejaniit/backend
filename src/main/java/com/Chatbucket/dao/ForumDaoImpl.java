package com.Chatbucket.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Chatbucket.model.Blog;
import com.Chatbucket.model.Forum;
@Transactional
@Repository
public class ForumDaoImpl implements ForumDao{

	@Autowired
	SessionFactory sessionFactory;
		public void addForum(Forum forum) {
			
			sessionFactory.getCurrentSession().save(forum);
		}
		public List<Forum> viewForums() {
		List<Forum> list = sessionFactory.getCurrentSession().createCriteria(Forum.class).list();
		System.out.println("forum");
		return list;
		}
		
		public void deleteForum(Forum forum) {
		sessionFactory.getCurrentSession().delete(forum);
			
			
		}
		
		public void updateForum(Forum forum) {
			
			sessionFactory.getCurrentSession().update(forum);
		}
		public List<Forum> viewForum(boolean status) {
			String hql="from Forum where status="+"'"+true+"'";
			Query query=sessionFactory.getCurrentSession().createQuery(hql);
			List<Forum> list=  query.list();
			return  list;
		}
		
}
