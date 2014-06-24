package com.traackr.influencer.persistance;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mongodb.DB;
import com.mongodb.DBCollection;

@Repository
public class ExampleMongoDbRepository {
  
  @Autowired
  private DB           traackrDb;
  
  private DBCollection collection;
  
  @PostConstruct
  public void init() {
    this.collection = traackrDb.getCollection("test");
  }
  
  public DBCollection getCollection() {
    return this.collection;
  }
}
