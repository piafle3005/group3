package com.napier.sem;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class App
{
    public static void main(String[] args)
    {
        // connecting the project with MongoDB
        MongoClient mongoClient = new MongoClient("mongo-dbserver");
        MongoDatabase database = mongoClient.getDatabase("mydb");
        MongoCollection<Document> collection = database.getCollection("test");
        // Try if it works
        Document doc = new Document("name", "Test")
                .append("class", "Test class")
                .append("year", "Test year")
                .append("result", new Document("CW", 95).append("EX", 85));
        collection.insertOne(doc);

        Document myDoc = collection.find().first();
        System.out.println(myDoc.toJson());
    }
}