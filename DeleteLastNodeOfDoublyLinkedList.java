import java.util.Scanner;
class DeleteLastNodeOfDoublyLinkedList
{
 class Node
 {
  int data;
  Node next;
  Node previous;
  Node(int data)
  {
   this.data=data;
   this.previous=null;
   this.next=null;
  }
 }
 
 Node head=null;
 Node tail=null;
 int count=0;
  
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
  count++;
 }
 
 void DeleteAtEnd()
 {
  if(head==null)
  {
   System.out.println("List is empty");
  }
  else if(count==1)
  {
   head=tail=null;
  }
  else if(head!=tail)
  {
   Node lastNode=tail;
   tail=lastNode.previous;
   tail.next=null;
   lastNode=null;
  }
  count--;
 } 
 
 void Display()
 {
  if(head==null)
  {
   System.out.println("List is empty");
  }
  else
  {
   System.out.println("Elements of the list");
   Node current=head;
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
  DeleteLastNodeOfDoublyLinkedList d=new DeleteLastNodeOfDoublyLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no of elements you want to enter");
  int n=s.nextInt();
  System.out.println("Enter the elements ");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   d.AddNode(data);
  }
  System.out.println("Original List");
  d.Display();
  while(d.head!=null)
  {
   System.out.println("Updated List");
   d.DeleteAtEnd();
   d.Display();
  }
 }
}