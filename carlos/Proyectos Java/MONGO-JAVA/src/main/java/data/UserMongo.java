package data;

import classes.User;
import com.mongodb.*;
import java.util.*;


public class UserMongo implements UserInterface {

    @Override
    public int insertUser(DB db, String collection, User user) {
        int registers = 0;
        int integer;
        try {
            DBCollection colec = db.getCollection(collection);
            BasicDBObject document = new BasicDBObject();
            document.put("idUser", Math.toIntExact(colec.count() + 1));
            document.put("userNames", user.getUserNames());
            document.put("lastNames", user.getLastNames());
            document.put("email", user.getEmail());
            document.put("cellPhone", user.getCellPhone());
            colec.insert(document);
            registers = document.getInt("idUser");
            System.out.println("Registros insertados " + registers);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        return registers;
    }
    
    @Override
    public int updateUser(DB db, String collection, User user) {
        int registers = 0;
        try {
            DBCollection colec = db.getCollection(collection);
            
            BasicDBObject document = new BasicDBObject();
            //document.append("$set", new BasicDBObject().append("lastNames", user.getLastNames()));
            document.append("userNames", user.getUserNames());
            document.append("lastNames", user.getLastNames());
            document.append("email", user.getEmail());
            document.append("cellPhone", user.getCellPhone());
            
            BasicDBObject setQuery = new BasicDBObject();
            setQuery.append("$set", document);
            
            
            BasicDBObject searchDocument = new BasicDBObject();
            searchDocument.append("idUser", user.getIdUser());
           
            
            colec.update(searchDocument,setQuery);
            
            registers = document.size();
            System.out.println("Registros actualizados " + registers);
        
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

       return registers;
    }
    
    
    @Override
    public List<User> showUsers(DB db, String collection) {
        
        User user = null;
        List<User> users = new ArrayList<>();
        
        try {
            
            DBCollection colec = db.getCollection(collection);
            
            DBCursor cursor = colec.find();
            
            while(cursor.hasNext()) {
                //System.out.println(((Object)cursor.next().get("idUser").getClass().getSimpleName()));
                int idUser = (int) cursor.next().get("idUser");
                String userNames = (String) cursor.curr().get("userNames");
                String lastNames = (String) cursor.curr().get("lastNames");
                String email = (String) cursor.curr().get("email");
                String cellPhone = (String) cursor.curr().get("cellPhone");
                user = new User();
                user.setIdUser(idUser);
                user.setUserNames(userNames);
                user.setLastNames(lastNames);
                user.setEmail(email);
                user.setCellPhone(cellPhone);
                
                users.add(user);
             
            }
            
        } catch(Exception ex) {
            ex.printStackTrace(System.out);
        }
        
        return users;
    }
    
    @Override
    public int deleteUser(DB db, String collection, User user) {
        int registers = 0;
        try {
            DBCollection colec = db.getCollection(collection);
            BasicDBObject document = new BasicDBObject();
            document.append("idUser", user.getIdUser());
            colec.remove(document);
            registers = document.size();
            System.out.println("Registros eliminados " + registers);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return registers;
        
    }

}
