package com.pignora.pandora.repository;

import com.pignora.pandora.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository  extends MongoRepository<User, String> {
}
