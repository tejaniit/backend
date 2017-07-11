package com.Chatbucket.dao;

import java.util.List;

import com.Chatbucket.model.Blog;
import com.Chatbucket.model.Jobs;

public interface JobsDao {
void addJobs(Jobs jobs);
List<Jobs> viewJobs();

void deleteJob(Jobs jobs);
void updateJob(Jobs jobs);

}
