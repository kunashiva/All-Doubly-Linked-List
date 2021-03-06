import java.util.Scanner;
class RotateDoublyLinkedList
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
 
 void Rotate(int n)
 {
  if(head==null)
  {
   System.out.println("List is empty");
  }
  else
  {
   if(n==0||n>=count)
   {
    return;
   }
   else
   {
    Node current=head;
    for(int i=1;i<n;i++)
    {
      current=current.next;
    }
    tail.next=head;
    head=current.next;
    head.previous=null;
    tail=current;
    tail.next=null;
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
   System.out.println("Elements of the list are");
   Node n=head;
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
  RotateDoublyLinkedList l=new RotateDoublyLinkedList();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no of elements you want to enter");
  int n=s.nextInt();
  System.out.println("Enter the elements");
  for(int i=0;i<n;i++)
  {
   int data=s.nextInt();
   l.AddNode(data);
  }
  System.out.println("Original List");
  l.Display();
  System.out.println("Enter how many times you want to rotate");
  int data=s.nextInt();
  System.out.println("Updated List");
  l.Rotate(data);
  l.Display();
 }
}