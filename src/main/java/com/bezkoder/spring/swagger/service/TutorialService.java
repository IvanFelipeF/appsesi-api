package com.bezkoder.spring.swagger.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bezkoder.spring.swagger.model.Tutorial;

@Service
public class TutorialService {

  static List<Tutorial> tutorials = new ArrayList<Tutorial>();
  static long id = 0;

  public List<Tutorial> findAll() {
    return tutorials;
  }

  public Tutorial save(Tutorial tutorial) {
    // update Tutorial
    if (tutorial.getId() != 0) {
      long _id = tutorial.getId();

      for (int idx = 0; idx < tutorials.size(); idx++)
        if (_id == tutorials.get(idx).getId()) {
          tutorials.set(idx, tutorial);
          break;
        }

      return tutorial;
    }

    tutorial.setId(++id);
    tutorials.add(tutorial);
    return tutorial;
  }

  
}
