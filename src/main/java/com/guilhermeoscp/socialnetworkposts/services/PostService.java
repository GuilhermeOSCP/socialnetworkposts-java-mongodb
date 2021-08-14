package com.guilhermeoscp.socialnetworkposts.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilhermeoscp.socialnetworkposts.domain.Post;
import com.guilhermeoscp.socialnetworkposts.repository.PostRepository;
import com.guilhermeoscp.socialnetworkposts.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}