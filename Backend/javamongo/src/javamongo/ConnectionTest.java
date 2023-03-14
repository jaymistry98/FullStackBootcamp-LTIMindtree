package javamongo;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class ConnectionTest {

	public static void main(String[] args) {
		
		MongoClient client = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		
		MongoDatabase database = client.getDatabase("jay_db");
		//System.out.println("Connected with mongodb");
		
		MongoCollection<Document> collection = database.getCollection("myuser");
		
		FindIterable<Document> itr = collection.find();
		Iterator it = itr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Document doc1 = new Document("uname","amar").append("email", "amar@mail.com");
		
		//collection.insertOne(doc1);
		//System.out.println("user added");

	}

}
