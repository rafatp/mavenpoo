/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenmongoconnection;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author rafaelpereira
 */
public class ConnectionMongoDB {
    public static void main(String[] args) {
        MongoClient client = new MongoClient();
        MongoDatabase db = client.getDatabase("peopledb");
        MongoCollection<Document> people = db.getCollection("people");
        Document onePeople = people.find().first();
        System.out.println("Return MongoDB: "+onePeople);
        client.close();
    }
}


