/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solution;

/**
 *
 * @author 000772198
 */
public class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) { val = x; }
    
    public String print() {
        ListNode current = this;
        String result = "";
        while (current != null) {
            result += current.val + ", ";
            current = current.next;
        }
        return result;
    }
    
    @Override
    public String toString() {
        return this.print();
    }
}
