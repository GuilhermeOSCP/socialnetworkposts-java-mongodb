package com.guilhermeoscp.socialnetworkposts.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.guilhermeoscp.socialnetworkposts.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
