package test;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.DBCursor;

import com.mongodb.ServerAddress;
import java.util.Arrays;

public class Conn {

   public static void main( String args[] ) {
	
      try{   
		
         // To connect to mongodb server
         Mongo mongoClient = new Mongo( "localhost" , 27017 );
			
         // Now connect to your databases
         DB db = mongoClient.getDB( "test" );
         System.out.println("Connect to database successfully");
			
     /*   String root="root";
        String root1="root";
		boolean auth = db.authenticateCommand(root, root1);*/
      //   System.out.println("Authentication: "+auth);
			
         DBCollection coll = db.createCollection("mycol", null);
         System.out.println("Collection created successfully");
      }catch(Exception e){
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      }
   }
}