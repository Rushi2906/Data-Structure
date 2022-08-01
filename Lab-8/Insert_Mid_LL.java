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

    public void insertMid(int data){
    	Node nnode2=new Node(data);
    	int c=0;
    	Node temp=head;
		while(temp!=null){
			temp=temp.next;
			c++;
		}
		Node last=head;
		c=c/2;
		for(int i=0;i<c-1;i++){
			last=last.next;
		}
		nnode2.next=last.next;
		last.next=nnode2;
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
class Insert_Mid_LL{
	public static void main(String[] args){
		List li = new List();
        li.insert(1);
        li.insert(56);
        li.insert(89);
        li.insert(50);
        li.insert(38);
        li.insert(19);
        li.display();
        li.insertMid(29);
        li.display();
    }
}