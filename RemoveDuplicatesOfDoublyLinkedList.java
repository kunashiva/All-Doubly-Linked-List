import java.util.Scanner;
class RemoveDuplicatesOfDoublyLinkedList
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
 
 void RemoveDuplicates()
 {
  if(head==null)
  {
   System.out.println("List is empty");
  }
  else
  {
   Node current=head;
   Node index=null, temp=null;
   while(current!=null)
   {
    index=current.next;
    while(index!=null)
    {
     if(current.data==index.data)
     {
      temp=index;
      index.previous.next=index.next;
      if(index.next!=null)
      {
       index.next.previous=index.previous;
      }
      temp=null;
     }
     index=index.next;
    }
    current=current.next;
   }
  }
 }
 
 void Display()
 {
  if(head==null)
  {
   System.out.println("List is  Empty");
  }
  else
  {
   Node n=head;
   System.out.println("Elementss of the list are");
   while(n!=null)
   {
    System.out.print(n.data+" ");
    n=n.next;
   }
   System.out.println();
  }
 }
 
 public static void main(String ar[])
 {
  RemoveDuplicatesOfDoublyLinkedList r=new RemoveDuplicatesOfDoublyLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no of elements you want to Enter");
  int n=s.nextInt();
  System.out.println("Enter the elements ");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   r.AddNode(data);
  }
  System.out.println("Original List is:");
  r.Display();
  System.out.println("Updated List");
  r.RemoveDuplicates();
  r.Display();
 }
}