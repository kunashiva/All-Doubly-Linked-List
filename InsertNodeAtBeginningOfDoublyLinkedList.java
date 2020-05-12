import java.util.Scanner;
class InsertNodeAtBeginningOfDoublyLinkedList
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
   head=tail=newNode;
  }
  else
  {
   tail.next=newNode;
   newNode.previous=tail;
   tail=newNode;
  }
 }
 
 void InsertAtBeginning(int data)
 {
  Node newNode=new Node(data);
  if(head==null)
  {
   head=tail=newNode;
  }
  else
  {
   newNode.next=head;
   newNode.previous=null; 
   head=newNode;
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
  InsertNodeAtBeginningOfDoublyLinkedList l=new InsertNodeAtBeginningOfDoublyLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no of elements you want to enter");
  int n=s.nextInt();
  System.out.println("Enter the elements");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   l.AddNode(data);
  }
  System.out.println("OriginalList:");
  l.Display();
  System.out.println("Enter the element you want to enter at beginning");
  int data=s.nextInt();
  l.InsertAtBeginning(data);
  System.out.println("Updated List");
  l.Display();
 }
}