import java.util.Scanner;
class List{
	static Node head;
	static int count=0;

	static class Node{
		int data;
		Node next;

		Node(int a){
			data=a;
			next=null;
		}
	}

	public static void addFirst(int data){
		Node nnode = new Node(data);

		nnode.next=head;
		head=nnode;

		count++;
	}

	public static void addLast(int data){
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
			count++;
		}
	}

	public static void deleteFirst(){
		if(head==null){
			System.out.println("List is empty");
		}
		head=head.next;
		count--;
	}

	public static void deleteLast(){
		if(head==null){
			System.out.println("List is empty");
		}
		count--;
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
		System.out.println("Number of Element in linkedlist is: "+count);
	}

}
class LinkedListDemo2{
	public static void main(String[] args){
		List li = new List();
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("\n1:addFirst\n2:addLast\n3:deleteFirst\n4:deleteLast\n5:display\n6:exit");
			int c=sc.nextInt();

			switch(c){
				case 1:
					System.out.println("Enter the data to be insert: ");
					int x=sc.nextInt();
					li.addFirst(x);
					break;
				case 2:
					System.out.println("Enter the data to be insert: ");
					int y=sc.nextInt();
					li.addLast(y);
					break;
				case 3:
					li.deleteFirst();
					break;
				case 4:
					li.deleteLast();
					break;
				case 5:
					li.display();
					break;
				case 6:
					System.exit(0);
					break;
			}
		}
	}
}