/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import static person.HairColor.*;

/**
 *
 * @author 000772198
 */
public class Person {
    HairColor hairColor = BLACK;
    
    public Person() {
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person peterParker = new Person();
        Person spiderMan = peterParker;
        
        spiderMan.hairColor = PINK;
        
        System.out.println("Hear Color of Peter Parker: " + peterParker.hairColor);
        System.out.println("Hear Color of Spideman: " + spiderMan.hairColor);
    }
    
}
