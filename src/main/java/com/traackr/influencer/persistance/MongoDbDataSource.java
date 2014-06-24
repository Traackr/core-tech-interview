package com.traackr.influencer.persistance;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;

@Configuration
public class MongoDbDataSource {
  
  @Value("${mongodb.server.uri}")
  private String mongoURI;
  
  @Value("${mongodb.server.database}")
  private String traackrDb;
  
  @Bean(name = "mongoURI")
  public MongoClientURI mongoURI() {
    return new MongoClientURI(mongoURI);
  }
  
  @Bean(name = "mongoServer")
  public Mongo mongoServer() throws MongoException, UnknownHostException {
    return new MongoClient(mongoURI());
  }
  
  @Bean(name = "traackrDb")
  public DB traackrDb() throws MongoException, UnknownHostException {
    DB db = mongoServer().getDB(traackrDb);
    if (!db.isAuthenticated()) {
      MongoClientURI mongoURI = mongoURI();
      String username = mongoURI.getUsername();
      // If username present, try to authenticate
      if (username != null) {
        db.authenticate(mongoURI.getUsername(), mongoURI.getPassword());
      }
    }
    return db;
  }
}
