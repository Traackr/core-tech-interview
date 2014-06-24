package com.traackr.influencer.persistance;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/appContext.test.xml" })
public class ExampleMongoDbRepositoryTest {
  
  @Autowired
  private ExampleMongoDbRepository exampleMongoDbRepository;
  
  @Test
  public void init() {
    Assert.assertNotNull(exampleMongoDbRepository.getCollection());
  }
}
