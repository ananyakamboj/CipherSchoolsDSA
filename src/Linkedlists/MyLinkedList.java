package Linkedlists;

class Node
{
	int data;
	Node next;//reference variable
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class MyLinkedList {

static Node insertAtHead(Node head,int data)
{
	Node temp=new Node(data);
	temp.next=head;
	head=temp;
	return head;
}

//static insertAtEnd(Node head,int data)
//{
//	Node temp=new Node(data);
//	Node last=head;
//	while(last.next!=null)
//	{
//		last=last.next;
//	}
//	last.next=temp;
//	
//}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		
		//directly using head is not a good way
//		while(head!=null)
//		{
//			System.out.print(head.data+" ");
//			head=head.next;
//	}
		
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		//temp=head;
		System.out.println();
//		while(temp!=null)
//		{
//			System.out.print(temp.data+" ");
//			temp=temp.next;
//		}
		
		head=insertAtHead(head,6);
		temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		
		
	}

}
