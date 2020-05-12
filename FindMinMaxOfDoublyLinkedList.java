import java.util.Scanner;
class FindMinMaxOfDoublyLinkedList
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
   head=tail=newNode;
  }
  else
  {
   tail.next=newNode;
   newNode.previous=tail;
   tail=newNode;
  }
 }
 
 void MaxAndMin()
 {
  if(head==null)
  {
   System.out.println("List is empty");
  }
  else
  {
   Node current=head;
   int max=current.data;
   int min=current.data;
   while(current!=null)
   {
    if(min>current.data)
    {
     min=current.data;
    }
    if(max<current.data)
    {
     max=current.data;
    }
    current=current.next;
   }
   System.out.println("Max of List is: "+max+" Min of List is: "+min);
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
   System.out.println("Elements of the list are");
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
  FindMinMaxOfDoublyLinkedList l=new FindMinMaxOfDoublyLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no of elements you want to enter");
  int n=s.nextInt();
  System.out.println("Enter the elements  ");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   l.AddNode(data);
  }
  System.out.println("Original List");
  l.Display();
  l.MaxAndMin();
 }
}