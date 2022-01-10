/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package data;

import classes.User;
import com.mongodb.DB;
import java.util.List;

/**
 *
 * @author yoshy
 */
public interface UserInterface {
    public int insertUser(DB db, String collection, User user);
    public int updateUser(DB db, String collection, User user);
    public int deleteUser(DB db, String collection, User user);
    public List<User> showUsers(DB db, String collection);
    
}
