/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import classes.User;
import com.mongodb.*;
import data.ConnectMongoDB;
import data.UserMongo;
import java.util.List;

/**
 *
 * @author yoshy
 */
public class Main {

    public static void main(String[] args) {
        ConnectMongoDB conn = new ConnectMongoDB();
        MongoClient mongo = conn.makeConnection();
        if (mongo != null) {
            UserMongo userMongo = new UserMongo();
            DB db = mongo.getDB("test");
            String table = "users";
            System.out.println("¡Base de datos creada!");
            //User user = new User("Blanquito", "Dolar");
            //userMongo.insertUser(db, table, user);
            // userMongo.showUsers(db, table);
            
            /*User user = new User();
            user.setIdUser(1);
            user.setUserNames("Charlie");
            user.setLastNames("Page");*/
            
            User user = new User();
            user.setIdUser(6);
            
            userMongo.deleteUser(db, table, user);

            List<User> users = userMongo.showUsers(db, table);

            users.forEach(element -> {
                System.out.println(element.getUserNames());
            });
        }
    }

}
