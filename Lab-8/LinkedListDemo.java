import java.util.Scanner;
class List{
	static Node head;

	static class Node{
		int data;
		Node next;

		Node(int a){
			data=a;
			next=null;
		}
	}

	public static void insert(int data){
		Node nnode=new Node(data);

		if(head==null){
			head=nnode;
		}
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=nnode;
		}
	}

	public static void delete(){
		if(head==null){
			System.out.println("List is empty");
		}

		if(head.next==null){
			head=null;
		}

		Node secondLast = head;
		Node lastNode = head.next;

		while(lastNode.next!=null){
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}

		secondLast.next=null;
	}

	public static void display(){
		Node temp=head;
		if(head==null){
			System.out.println("List is empty");
		}
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
class LinkedListDemo{
	public static void main(String[] args){
		List li = new List();
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("\n1.insert\n2.delete\n3.display\n4.exit\n");
			int c=sc.nextInt();

			switch(c){
				case 1:
					System.out.println("Enter the data to be insert: ");
					int x=sc.nextInt();
					li.insert(x);
					break;
				case 2:
					li.delete();
					break;
				case 3:
					li.display();
					break;
				
				case 4:
					System.exit(0);
					break;
			}
		}
	}
}