/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkeddata;

public class LinkedList {

    public static void addNode(Node head, String data) {
        Node n = new Node(data);
        n.next = null;
        n.next = head.next;
        head.next = n;

    }

    public static void traverse(Node head) {
        while (head.next != null) {
            System.out.println(head.next.name);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node("");
        addNode(head, "C");
        addNode(head, "B");
        addNode(head, "A");
        traverse(head);
    }
}
