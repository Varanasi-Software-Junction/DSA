/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkeddata;


public class Node {
public String  name;
public  Node next;

    public Node(String name) {
        this.name = name;
        this.next=null;
    }

    @Override
    public String toString() {
        return "Node{" + "name=" + name + '}';
    }
    


}
