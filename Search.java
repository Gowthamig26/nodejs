/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author ATTSYSTEMSGROUP
 */
public class Search {
    
   
   static class node {
      int data;
      node next;
      node (int value) {
         data = value;
         next = null;
      }
   }
   static node head;

   // display the list
   static void printList() {
      node p = head;
      System.out.print("\n[");

      //start from the beginning
      while(p != null) {
         System.out.print(" " + p.data + " ");
         p = p.next;
      }
      System.out.print("]");
   }

   //insertion at the beginning
   static void insertatbegin(int data) {

      //create a link
      node lk = new node(data);;

      // point it to old first node
      lk.next = head;
      
      //point first to new first node
      head = lk;
   }
   static int searchlist(int key) {
      node temp = head;
      while(temp != null) {
         if (temp.data == key) {
            return 1;
         }
         temp=temp.next;
      }
      return 0;
   }
   public static void main(String args[]) {
      int k=0;
      insertatbegin(12);
      insertatbegin(22);
      insertatbegin(30);
      insertatbegin(44);
      insertatbegin(50);
      insertatbegin(33);
      System.out.println("Linked List: ");

      // print list
      printList();
      k = searchlist(44);
      if (k == 1)
         System.out.println("\nElement is found");
      else
         System.out.println("\nElement is not present in the list");
   }
}

