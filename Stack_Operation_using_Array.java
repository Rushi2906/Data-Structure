import java.util.Scanner;

class Stack_Operation_Demo{
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
		if(top>=n-1){
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

	void change(int i,int x){
		if(top==-1){
			System.out.println("Stack Underflow");
			return;
		}
		else{
			stack[top-i+1]=x;
			return;
		}
	}
	
}
public class Stack_Operation{
	public static void main(String[] args){
		Scanner sc2=new Scanner(System.in);
		int ch;
		Stack_Operation_Demo obj=new Stack_Operation_Demo();
		obj.accept();
		while(true){
			System.out.print("\n1.PUSH\n2.PEEP\n3.Display\n4.Change\n5.Exit\n");
			ch=sc2.nextInt();
			switch(ch){
				case 1:obj.push();
					break;
				case 2:obj.pop();
					break;
				case 3:obj.display();
					break;
				case 4:
					System.out.println("Enter ith element from top that can be changed");
					int i=sc2.nextInt();
					System.out.println("Enter new Element");
					int x=sc2.nextInt();
					obj.change(i,x);
					break;
				case 5:System.exit(0);
				default: System.out.println("Wrong Choice: ");
			}
		}
	}
}