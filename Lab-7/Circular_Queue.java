import java.util.Scanner;

class Queue{
	Scanner sc2 = new Scanner(System.in);

	int n=5;
	int [] arr = new int[n];
	int front=-1;
	int rear=-1;
	public void enque(){
		
		if(front==(rear+1)%n){
			System.out.println("Queue is overflow.");
		}
		else{
			System.out.println("Enter the data to be pushed into the Queue");
			int x=sc2.nextInt();
			if(front==-1 && rear==-1){
				front=0;
				rear=0;
				arr[rear]=x;
			}
			else{
				rear=(rear+1)%n;
				arr[rear]=x;
			}
		}
	}

	public void deque(){
		
		if(front==-1 && rear==-1){
			System.out.println("Queue is Empty");
		}
		else if(front==rear){
			System.out.println("Queue is Empty");
			front=-1;
			rear=-1;
		}
		else{
			front=(front+1)%n;
		}
	}

	public void display(){
		int i;
		if(front==-1 && rear==-1){
			System.out.println("Queue is Empty");
		}
		else if(front==rear){
			System.out.println("Queue is Empty");
		}
		System.out.println("The element of the Queue is: ");
		
		for(i=front;i!=rear;i=(i+1)%n){
			System.out.print(arr[i]+" ");
		}
		System.out.println(arr[i]);	
	}
}
class Circular_Queue{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		Queue obj = new Queue();
		while(true){
			System.out.println("\n1.Anque\n2.Deque\n3.Display\n4.Exit");
			int c=sc.nextInt();
			switch(c){
				case 1:
					obj.enque();
					break;
				case 2:
					obj.deque();
					break;
				case 3:
					obj.display();
					break;
				case 4:
					System.exit(0);
			}
		}
	}
}