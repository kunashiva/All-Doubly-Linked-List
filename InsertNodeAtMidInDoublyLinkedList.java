import java.util.Scanner;
class InsertNodeAtMidInDoublyLinkedList
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
 
 void InsertAtMid(int data)
 {
  Node newNode=new Node(data);
  if(head==null)
  {
   head=tail=newNode;
  } 
  else
  {
   Node current=head;
   Node temp=null;//uesd for pointing next elemment of mid;
   int mid=(count%2==0)?(count/2):((count+1)/2);
   for(int i=1;i<mid;i++)
   {
    current=current.next;
   }
   //node temp will point next to mid
   temp=current.next;
   //temp.previous=current;
   //newNode will be added between current and temp
   current.next=newNode;
   newNode.previous=current;
   newNode.next=temp;
   temp.previous=newNode;
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
  InsertNodeAtMidInDoublyLinkedList l=new InsertNodeAtMidInDoublyLinkedList();
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
  System.out.println("Enter the element that you want to enter at Mid in List");
  int data=s.nextInt();
  l.InsertAtMid(data);
  System.out.println("Updated List");
  l.Display();
 } 
}