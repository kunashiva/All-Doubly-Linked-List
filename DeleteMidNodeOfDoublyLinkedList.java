import java.util.Scanner;
class DeleteMidNodeOfDoublyLinkedList
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
 
 void DeleteMid()
 {
  if(head==null)
  {
   System.out.println("List is empty");
  }
  else
  {
   Node current=head;
   int mid=count%2==0?(count/2):((count+1)/2);
   for(int i=1;i<mid;i++)
   {
    current=current.next;
   }
   if(current==head)
   {
    
    head=current.next;
   }
   else if(current==tail)
   {
    
    tail=tail.previous;
   }
   else
   {
    current.previous.next=current.next;
    current.next.previous=current.previous;  
   }
    current=null;
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
  DeleteMidNodeOfDoublyLinkedList d=new DeleteMidNodeOfDoublyLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no of elements you want to enter ");
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
   System.out.println("Updated list");
   d.DeleteMid();
   d.Display();
  }
 }
}