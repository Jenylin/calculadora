/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import com.mongodb.*;
import java.util.Arrays;


/**
 *
 * @author yoshy
 */
public class ConnectMongoDB {

    private static final String MONGO_USER = "carl";
    private static final String MONGO_DB = "admin";
    private static final char[] MONGO_PASS = {'M', 'o', 'n', 'g', 'o', '2', '0', '2', '1'};

    public  MongoClient makeConnection() {
        System.out.println("Ejecutando conexión...");
        MongoClient mongo = null;
        try {
            MongoCredential credential = MongoCredential.createCredential(MONGO_USER, MONGO_DB, MONGO_PASS);
            mongo = new MongoClient(new ServerAddress("localhost", 27017), Arrays.asList(credential));
            
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return mongo;
    }

}
