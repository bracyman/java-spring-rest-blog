package com.pluralsight.blog.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.pluralsight.blog.model.Post;

@Component
public interface PostRepository extends JpaRepository<Post, Long> {
	
	public List<Post> findByTitleContaining(String title);
	
	public List<Post> findByAuthor_Lastname(String lastname);
}