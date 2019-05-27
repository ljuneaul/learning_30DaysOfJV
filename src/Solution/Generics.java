/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solution;

/**
 *
 * @author juneau
 */
public class Generics{
    
    public static <T extends Comparable <T>> T findMax(T a, T b) {
        int n = a.compareTo(b);
        if (n < 0) {
            return b;
        } else {
            return a;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(findMax(2, 3));
        System.out.println(findMax(3, 3));
        System.out.println(findMax(3, 2));
        
        System.out.println(findMax(2.0, 3.0));
        System.out.println(findMax('a', 'b'));
        System.out.println(findMax("hello", "there"));
        
//        Generics k = new Generics();
//        System.out.println(findMax(k, k));
    }

//    @Override
//    public int compareTo(Object o) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}
