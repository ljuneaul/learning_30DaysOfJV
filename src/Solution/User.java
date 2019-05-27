/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solution;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author juneau
 */
public class User {
    
    String username;
    String password;
    int age;
    Set<Integer> orderIDs;
    
    public User(String customeUserName, String customPassword, int customAge, Set<Integer> orderIDs) {
        this.username = customeUserName;
        this.password = customPassword;
        this.age = customAge;
        this.orderIDs = orderIDs;
    }
    
    public static void main(String[] args) {
        Set a = new HashSet();
        a.add(1212);
        User kathryn = new User("blondiebytes", "hello world", 10, a);
    }
    
}
