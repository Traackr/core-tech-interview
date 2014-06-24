/**
 * TestDataFixtures.java - Traackr, Inc.
 * 
 * This document set is the property of Traackr, Inc., a Massachusetts
 * Corporation, and contains confidential and trade secret information. It
 * cannot be transferred from the custody or control of Traackr except as
 * authorized in writing by an officer of Traackr. Neither this item nor the
 * information it contains can be used, transferred, reproduced, published,
 * or disclosed, in whole or in part, directly or indirectly, except as
 * expressly authorized by an officer of Traackr, pursuant to written
 * agreement.
 * 
 * Copyright 2012-2013 Traackr, Inc. All Rights Reserved.
 */
package com.traackr.influencer.utils;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;

/**
 * @author gstathis
 *         Created on: 6/24/14
 */
public class TestDataFixtures {
  
  private static String[] randomNames = new String[] { "Adrian Jones",
      "Alberto Ingram",
      "Alison Coleman",
      "Alton Garrett",
      "Amelia Howard",
      "Amy Sharp",
      "Ana Rodriquez",
      "Annette Rhodes",
      "Antoinette Bennett",
      "Austin Schneider",
      "Ben Bowen",
      "Bernard Gibson",
      "Bethany Ortega",
      "Bobbie Howell",
      "Boyd Cohen",
      "Brendan Colon",
      "Carl Hernandez",
      "Carlos Moran",
      "Cathy Francis",
      "Charlotte Reid",
      "Chelsea Leonard",
      "Clyde Sherman",
      "Cora Green",
      "Curtis Floyd",
      "Daniel Lucas",
      "Danny Maldonado",
      "Dave Silva",
      "Delbert Barton",
      "Delores Herrera",
      "Dexter Ross",
      "Diane Peterson",
      "Dolores Mccormick",
      "Elbert Hanson",
      "Emma Patrick",
      "Ernesto Barnes",
      "Florence Page",
      "Francisco Fletcher",
      "Frankie Snyder",
      "Fred Walsh",
      "Gary Shaw",
      "Gene Bridges",
      "Gertrude Webster",
      "Holly Mckinney",
      "Hugh Sanders",
      "Ignacio Logan",
      "Ivan King",
      "Jan Holland",
      "Jeff Harvey",
      "Jennie Schwartz",
      "Jill Walton",
      "Joann White",
      "Joanne Horton",
      "Joey Moreno",
      "John Newton",
      "Jon Mills",
      "Julie Mcdaniel",
      "Julius Carpenter",
      "Keith Perry",
      "Ken Wells",
      "Kimberly Curtis",
      "Kurt Chandler",
      "Lamar Cobb",
      "Leon Gregory",
      "Lester Powell",
      "Lewis Delgado",
      "Lindsay Palmer",
      "Lionel Frazier",
      "Lloyd Ford",
      "Lois Rogers",
      "Lori Moss",
      "Lydia Townsend",
      "Manuel Ortiz",
      "Maria Gardner",
      "Marion Jacobs",
      "Maxine Boyd",
      "Meredith Rodriguez",
      "Michelle Davis",
      "Mindy Fernandez",
      "Myrtle Romero",
      "Nathaniel Sandoval",
      "Ollie Simpson",
      "Opal Gill",
      "Ora Hicks",
      "Otis Saunders",
      "Pamela Sims",
      "Phil Pratt",
      "Rebecca Rowe",
      "Rene Mcgee",
      "Rochelle Aguilar",
      "Ruby Holloway",
      "Sam Carroll",
      "Saul Beck",
      "Silvia Mccoy",
      "Stacey Roberson",
      "Stephanie Weber",
      "Timothy Maxwell",
      "Tommie Montgomery",
      "Viola Henderson",
      "Woodrow Fitzgerald",
      "Yvette Malone"                };
  
  public static String[] getRandomNames() {
    return randomNames;
  }
  
  public static void populateWithRandomNames(DBCollection collection, String field) {
    for (String name : getRandomNames())
      collection.save(new BasicDBObject(field, name));
  }
}
