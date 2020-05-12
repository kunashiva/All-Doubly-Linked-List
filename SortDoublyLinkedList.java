import java.util.Scanner;
class SortDoublyLinkedList
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
 
 void Sort()
 { 
  if(head==null)
  {
   System.out.println("List is empty");
  } 
  else
  {
   Node current,index;
   int temp=0;
   for(current=head;current!=null;current=current.next)
   {
    for(index=current.next;index!=null;index=index.next)
    {
     if(current.data>index.data)
     {
      temp=current.data;
      current.data=index.data;
      index.data=temp;
     }
    }
   }
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
  SortDoublyLinkedList l=new SortDoublyLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no of elements you want to enter");
  int n=s.nextInt();
  System.out.println("Enter the elements ");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   l.AddNode(data);
  } 
  System.out.println("Original List");
  l.Display();
  System.out.println("After Sorting");
  l.Sort();
  l.Display();
 }
}