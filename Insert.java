/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import static org.omg.CORBA.AnySeqHelper.insert;


public class Insert {
  static class node {
      int data;
      node next;
      node (int value) {
         data = value;
         next = null;
      }
   }
   static node head;

   static void printList() {
      node p = head;
      System.out.print("\n[");

      while(p != null) {
         System.out.print(" " + p.data + " ");
         p = p.next;
      }
      System.out.print("]");
   }
   
   static void insertatbegin(int data) {

      node lk = new node(data);;

      lk.next = head;
      head = lk;
   }
//   static void deletenode(int key) {
//      node temp = head;
//      node prev = null;
//      if (temp != null && temp.data == key) {
//         head = temp.next;
//         return;
//      }
//      
//      // Find the key to be deleted
//      while (temp != null && temp.data != key) {
//         prev = temp;
//         temp = temp.next;
//      }
//      
//      // If the key is not present
//      if (temp == null) return;
//      
//      // Remove the node
//      prev.next = temp.next;
//   }
   
   
//    static void deleteatbegin() {
//      head = head.next;
//    }
   
   
  static void insertafternode(node list, int data) {
      node lk = new node(data);
      lk.next = list.next;
      list.next = lk;
   }
   public static void main(String args[]) {
      int k=0;
      insertatbegin(12);
      insertatbegin(22);
      insertatbegin(30);
      insertatbegin(44);
      insertatbegin(50);
      insertatbegin(33);
      insertafternode(head.next, 60);
      insertafternode(head.next.next, 53);
      System.out.println("Linked List: ");

      // print list
      printList();

      //deleteatbegin();
      //deleteatend();
//      deletenode(12);
//      System.out.println("\nLinked List after deletion: ");


//deleteatbegin();
//      System.out.println("\nLinked List after deletion: ");

      // print list
      printList();
   }
}   
    

