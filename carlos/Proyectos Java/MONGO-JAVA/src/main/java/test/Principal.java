/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import com.mongodb.*;
import java.util.Arrays;

/**
 *
 * @author yoshy
 */
public class Principal {
    public static void main(String[] args) {
        MongoClient mongo = makeConnection();
        if(mongo != null) {
            DB db = mongo.getDB("bdMongo");
            
            /*String table = "bd_test";
            System.out.println("¡Base de datos creada!");
            insertUser(db, table, "Alberto", "Mexico");
            insertUser(db, table, "Salcero", "U.S.A.");
            insertUser(db, table, "Perez", "Alemania");*/
            //showCollection(db, "bd_test");
            //searchUserName(db, "bd_test", "Salcer     o");
            /*System.out.println("Antes del Update");
            showCollection(db, "bd_test");
            updateUser(db, "bd_test", "Salcero", "Monterrey");
            System.out.println("Despues del Update");
            showCollection(db, "bd_test");*/
            
            /*System.out.println("Antes del Delete");
            showCollection(db, "bd_test");
            deleteUser(db, "bd_test", "Monterrey");
            System.out.println("Despues del Delete");*/
            showCollection(db, "bd_test");
            
        }
    }
    
    public static MongoClient makeConnection() {
        String user = "carl";
        String database = "admin";
        char[] password = {'M','o','n','g','o','2','0','2','1'};
        System.out.println("PROBAR CONEXION MANGODB");        
        MongoClient mongo = null;
        
        MongoCredential credential = MongoCredential.createCredential(user, database, password);
        //MongoClientURI uri = new MongoClientURI("mongodb://carl:Mongo2021@localhost:27017/?authSource=admin");
        
        mongo = new MongoClient(new ServerAddress("localhost", 27017), Arrays.asList(credential));
        
        return mongo;
    }
    
    public static void insertUser(DB db, String collection, String name, String country) {
        DBCollection colec = db.getCollection(collection);
        
        BasicDBObject document = new BasicDBObject();
        document.put("nombre", name);
        document.put("pais", country);        
        colec.insert(document);
        
    }
    
    public static void showCollection(DB db, String collection) {
        DBCollection colec = db.getCollection(collection);
        
        DBCursor cursor = colec.find();
        
        while(cursor.hasNext()) {
            System.out.println("* " + cursor.next().get("nombre") + " - " + cursor.curr().get("pais"));
        }
    }
    
    public static void searchUserName(DB db, String collection, String name) {
        DBCollection colec = db.getCollection(collection);
        BasicDBObject query = new BasicDBObject();
        query.put("nombre", name);
        DBCursor cursor = colec.find(query);
        while(cursor.hasNext()){
            System.out.println("-- " + cursor.next().get("nombre") + " - "+ cursor.curr().get("pais"));
        }
    }
    
    public static void updateUser(DB db, String collection, String name, String country) {
        DBCollection colec = db.getCollection(collection);
        
        BasicDBObject updateCountry = new BasicDBObject();
        updateCountry.append("$set", new BasicDBObject().append("pais", country));
        
        BasicDBObject searchUserName = new BasicDBObject();
        searchUserName.append("nombre", name);
        
        colec.updateMulti(searchUserName, updateCountry);
    }
    
    public static void deleteUser(DB db, String collection, String name) {
        DBCollection colec = db.getCollection(collection);
        
        colec.remove(new BasicDBObject().append("pais", name));
    }
}
