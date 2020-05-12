import java.util.Scanner;
class SreachAnElementInDoublyLinkedList
{
 class Node
 {
  int data;
  Node previous=null;
  Node next=null;
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
 
 void Search(int data)
 {
  if(head==null)
  {
   System.out.println("List is empty");
  }
  else
  {
   Node current=head;
   boolean flag=false;
   int n=1;
   while(current!=null)
   {
    if(current.data==data)
    {
     flag=true;
     break;
    }
    current=current.next;
    n++;
   }
   System.out.println("Element found at "+n+" Node");
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
   Node n=head;
   System.out.println("Elements of the List are");
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
  SreachAnElementInDoublyLinkedList l=new SreachAnElementInDoublyLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no of elements you want to enter");
  int  n=s.nextInt();
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   l.AddNode(data);
  }
  System.out.println("Original List");
  l.Display();
  System.out.println("Enter the element you want to search");
  int data=s.nextInt();
  l.Search(data);
 }
}