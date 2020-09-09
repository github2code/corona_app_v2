package com.corona.coronaData;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CoronaDataAPIRespository extends MongoRepository<Corona_data_state_collection,String> {

}
