//printing a linked list
package Linkedlists;
class Noder{
	int data;
	Noder next;
	Noder(int data)
	{
		this.data=data;
		this.next=null;   
	}
}

public class printLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Noder head=new Noder(1);
		head.next=new Noder(2);
		head.next.next=new Noder(3);
		head.next.next.next=new Noder(4);
		head.next.next.next.next=new Noder(5);
		//making the structure
		//not a good way 
		
		Noder temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	
	}

}
