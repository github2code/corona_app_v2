package com.corona.impl;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.corona.dao.CoronaDataDao;

@Repository
public interface UserRepository extends MongoRepository<CoronaDataDao, String> {
}
