import java.util.Scanner;
class DeleteBeginnigNodeInDoublyLinkedList
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
 int  count=0;
 
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
 
 void DeleteAtBeginning()
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
   Node firstNode=head;
   head=firstNode.next;
   head.previous=null;
   firstNode=null;
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
   Node current=head;
   System.out.println("Element of the list");
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
  DeleteBeginnigNodeInDoublyLinkedList d=new DeleteBeginnigNodeInDoublyLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the no of elements you want to Enter ");
  int n=s.nextInt();
  System.out.println("Enter Elements");
  for(int i=0;i<n;i++)
  {
   int  data=s.nextInt();
   d.AddNode(data);
  }
  System.out.println("Original List");
  d.Display();
  while(d.head!=null)
  {
   d.DeleteAtBeginning();
   System.out.println("Updated List");
   d.Display();
  }
 }
}