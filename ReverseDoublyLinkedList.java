import java.util.Scanner;
class ReverseDoublyLinkedList
{
 class Node
 {
  int data;
  Node previous;
  Node next;
  Node(int data)
  {
   this.data=data;
   this.previous=null;
   this.next=null;
  }
 }
 
 Node head=null;
 Node tail=null;
 
 void AddNode(int data)
 {  
  Node newNode=new Node(data);
  if(head==null)
  {
   head=newNode;
   tail=newNode;
  }
  else
  {
   tail.next=newNode;
   newNode.previous=tail;
   tail=newNode;
  }
 }
 
 void Reverse()
 {
  Node current=head;
  Node temp=null;
  if(head==null)
  {
   System.out.println("List is empty");
  }
  else
  {
   while(current!=null)
   {
    temp=current.next;
    current.next=current.previous;
    current.previous=temp;
    current=current.previous;
   }
   temp=head;
   head=tail;
   tail=temp;
  }
 }
 
 void Display()
 {
  if(head==null)
  {
   System.out.println("List is empty");
  }
  else 
  {
   Node current=head;
   System.out.println("Elements of the list are");
   while(current!=null)
   {
    System.out.print(current.data+" ");
    current=current.next;
   }
   System.out.println();
  }
 }
 
 public static void main(String ar[])
 {
  ReverseDoublyLinkedList r=new ReverseDoublyLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no of elements you want to enter");
  int n=s.nextInt();
  System.out.println("Enter the elements");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   r.AddNode(data);
  }
  System.out.println("Original List is");
  r.Display();
  System.out.println("Reverse of the list is");
  r.Reverse();
  r.Display();
 }
}