package com.traackr.influencer.services;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class QueryService {
  
  private Logger log = LoggerFactory.getLogger(QueryService.class);
  
  @PostConstruct
  public void init() {
    log.info("Influencer#QueryService initializing");
  }
}
