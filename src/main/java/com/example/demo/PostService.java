package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PostService {
	@Autowired
	PostRepository postRepository;

	public List<Post> findAll() {
		return postRepository.findAll();
	}

	public Post create(Post post) {
		return postRepository.save(post);
	}
}
