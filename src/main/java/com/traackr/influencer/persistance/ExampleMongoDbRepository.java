package com.traackr.influencer.persistance;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.mongodb.DB;
import com.mongodb.DBCollection;

@Repository
public class ExampleMongoDbRepository {
  
  @Autowired
  private DB           traackrDb;
  
  private DBCollection collection;
  
  @Value("${mongodb.collection.example}")
  private String       collectionName;
  
  @PostConstruct
  public void init() {
    this.collection = traackrDb.getCollection(collectionName);
  }
  
  public DBCollection getCollection() {
    return this.collection;
  }
}
