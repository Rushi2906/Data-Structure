import java.util.*;
class Evaluation_Postfix{
	static Evaluation_Postfix obj = new Evaluation_Postfix();
	int [] stack = new int[100];
	static int top=-1;

	public void push(int c){
		if(top>=100){
			System.out.println("Stack Overflow.");
		}
		else{
			top++;
			stack[top]=c;
		}
	}

	public int pop(){
		if(top==-1){
			System.out.println("Stack Underflow.");
			return 0;
		}
		
		return stack[top--];
	}

	public void operator(int c){
		int operator1,operator2,value;
		switch(c){
		case 43:
			operator2=obj.pop();
			operator1=obj.pop();
			value=operator1+operator2;

			obj.push(value);
			break;

		case 45:
			operator2=obj.pop();
			operator1=obj.pop();
			value=operator1-operator2;

			obj.push(value);
			break;
	
		case 42:
			operator2=obj.pop();
			operator1=obj.pop();
			value=operator1*operator2;
                                   
			obj.push(value);
			break;
		
		case 47:
			operator2=obj.pop();
			operator1=obj.pop();
			value=operator1/operator2;

			obj.push(value);
			break;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter postfix expression: ");
		String str=sc.nextLine();

		for(int i=0;i<str.length();i++){                                                                                                                                                                                                                                                                    
			int c=str.charAt(i);                 

			if(c==45 || c==43 || c==42 || c==47){
				obj.operator(c);
			}                      
			else{                                        
				int temp=(int)c-48;
				obj.push(temp);
			}
		}
		System.out.println(obj.pop());
	}
}