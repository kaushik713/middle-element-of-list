package datastructre;
import java.util.Scanner;
/*
 * find the middle element of the list
 */

class Node { 

  int data; 
  Node next; 

  // Constructor for initializing node
  Node(int d) 
  { 
      data = d; 
      next = null; 
  } 
} 
class Linkedlist {
  Node head; /*head of list */

/* This method to insert a new node */
public  void insert( int data) 
{ 
    
  Node newnode = new Node(data); 
  newnode.next = null; 

    /* If the Linked List is empty, then we  make the new node as head of linked list */
  if (this.head == null) { 
    this.head = newnode; 
      } 
    else { 
        /* otherwise we should  traverse the list  till the  tail  and insert the new node there */
      Node tail = this.head; 
      while (tail.next != null) { 
          tail = tail.next; 
      }         /* here we make new node as tail node */
        tail.next = newnode; 
    } 
     
} 
/*
 * this function is used to display middle element of the list
 */
public  void display(int n)  //here n is size of the list
{ 
    Node currentnode = this.head;   
    n=n/2;
    
    /* here we traverse through the Linked list till the counter reaches middle element */
    
    int count=0;
    while (count<n) { 
        
        count++;
        currentnode = currentnode.next; 
    } 
    System.out.println(currentnode.data);
} 

}

public class MiddleList{
  
  public void input()
  {
    Linkedlist list = new Linkedlist(); 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();           /* reads no of elements to be inserted */
    for(int i=0;i<n;i++)
     list.insert(sc.nextInt());     /* insert the element into the list */
    
    list.display(n); 
}
  public static void main(String[] args) {
    MiddleList mdl=new MiddleList();
    mdl.input();
  }
}
