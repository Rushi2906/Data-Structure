import java.util.Scanner;

public class Stack_Operation_using_Array{
	int stack[]=new int[20];
	int n,top;

	Scanner sc = new Scanner(System.in);

	void accept(){
		System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		top=-1;
	}

	void push(){
		int x;
		if(top==n-1){
			System.out.println("Stack Overflow.");
			return;
		}
		System.out.println("Enter the data to be pushed: ");
		x=sc.nextInt();
		stack[++top]=x;
	}

	void pop(){
		int x;
		if(top==-1){
			System.out.println("Stack Underflow");
			return;
		}
		x=stack[top--];
	}

	void display(){
		int i;
		if(top==-1){
			System.out.println("No Element");
			return;
		}
		System.out.println("The elements of the stack are: ");
		for(i=0;i<=top;i++){
			System.out.print(stack[i]+" ");
		}
	}
	public static void main(String[] args){
		Scanner sc2=new Scanner(System.in);
		int ch;
		Stack_Operation_using_Array s =new Stack_Operation_using_Array();
		s.accept();
		while(true){
			System.out.print("\n1.PUSH\n2.PEEP\n3.Display\n4.Exit\n");
			ch=sc2.nextInt();
			switch(ch){
				case 1:s.push();
					break;
				case 2:s.pop();
					break;
				case 3:s.display();
					break;
				case 4:System.exit(0);
				default: System.out.println("Wrong Choice: ");
			}
		}
	}
}

