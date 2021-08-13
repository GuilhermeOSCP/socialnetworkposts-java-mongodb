package com.guilhermeoscp.socialnetworkposts.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.guilhermeoscp.socialnetworkposts.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
