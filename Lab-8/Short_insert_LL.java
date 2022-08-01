class List{
	Node head;

	class Node{
		int data;
		Node next;

		Node(int a){
			data=a;
			next=null;
		}
	}

	public void insert(int data){
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

	public void shortLL(){
		Node temp=head;
		int c=0;
		int d;
		while(temp!=null){
			temp=temp.next;
			c++;
		}
		Node temp1;
		Node temp2;

		for(int i=0;i<c;i++){
			temp1=head;
			temp2=temp1.next;
			for(int j=0;j<c-1;j++){
				if(temp2.data<temp1.data){
					d=temp1.data;
					temp1.data=temp2.data;
					temp2.data=d;
				}
				temp1=temp2;
				temp2=temp2.next;
			}
		}
	}

    public void insertLL(int data){
        Node nnode2 = new Node(data);
        Node current=head;
		if(head==null){
			head=nnode2;
		}
		else if(nnode2.data<=head.data){
			nnode2.next=head;
			head=nnode2;
		}
		else{
			while(current.next!=null && current.next.data<nnode2.data){
				current=current.next;
			}
			nnode2.next=current.next;
			current.next=nnode2;
		}
    }

	public void display(){
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
class Short_linkedlist{
	public static void main(String[] args){
		List li = new List();
        li.insert(25);
        li.insert(56);
        li.insert(89);
        li.display();
        li.shortLL();
        li.display();
        li.insertLL(0);
        li.display();
    }
}