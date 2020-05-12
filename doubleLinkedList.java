import java.util.Scanner;
class doubleLinkedList
{
 class Node
 {
  int data;
  Node next;
  Node previous;
  Node(int data)
  {
   this.data=data;
   this.next=null; 
   this.previous=null;
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
 
 void Display()
 {
  if(head==null)
  {
   System.out.println("List is empty");
  }
  else
  {
   Node current=head;
   Node last=null;
   System.out.println("Elements of the list are");
   while(current!=null)
   {
    System.out.print(current.data+" ");
    last=current;
    current=current.next;
   }
   System.out.println();
   while(last!=null)
   {
    System.out.print(last.data+" ");
    last=last.previous;
   }
   System.out.println();
  }
 }
  
 public static void main(String ar[])
 {
  doubleLinkedList d=new doubleLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no of elements you want to enter");
  int n=s.nextInt();
  System.out.println("Enter the Elements");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   d.AddNode(data);
  }
  System.out.println("Original List");
  d.Display();
 }
}