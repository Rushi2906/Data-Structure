import java.util.*;

public class Infixtoprefix{

	static Infixtoprefix obj = new Infixtoprefix();
	static int top=-1;
	char [] stack = new char[100];

	public static int precedence(char c){
		switch(c){
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;
		}
		return c;
	}

	public void push(char c){
		int x;
		if(top>=100){
			System.out.println("Stack Overflow.");
		}
		else{
			top++;
			stack[top]=c;	
		}
	}

	public char pop(){
		if(top==-1){
			System.out.println("Stack Underflow");
			return 0;
		}
		return stack[top--];
	}

	public char peek(){
		if(top==-1){
			System.out.println("Stack Underflow");
			return 0;	
		}
		else{
			return stack[top];
		}
	}

	public void toPrefix(String infix)
	{
		
			char symbol;
			String prefix="";

			String rev="";
			for(int i=infix.length()-1;i>=0;i--){
				if(infix.charAt(i)=='('){
					infix.charAt(i)=')';
				}
				if(infix.charAt(i)==')'){
					infix.charAt(i)='(';
				}
				rev=rev+(infix.charAt(i));
			}
			
			for(int i=0;i<rev.length();i++)
			{
				symbol = rev.charAt(i);

				if(Character.isLetter(symbol))
					prefix=prefix+symbol;
				else if(symbol=='(')
				{
					obj.push(symbol);
				}
				else if(symbol==')')
				{
					while(obj.peek()!='(')
					{
						prefix=prefix+obj.pop();
					}
					obj.pop();
				}
				else
				{
					while(top!=-1 && !(obj.peek()=='(') && precedence(symbol)<=precedence(obj.peek()))
					{
						prefix=prefix+obj.pop();
					}
					obj.push(symbol);
				}
			}
			while(top!=-1)
			{
				prefix=prefix+obj.pop();  
			}
			
			for(int j=prefix.length()-1;j>=0;j--){
				System.out.print(prefix.charAt(j));
			}
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String infix;

		System.out.println("Enter Expression: ");
		infix = sc.nextLine();

		Infixtoprefix obj = new Infixtoprefix();
		obj.toPrefix(infix);

	}
}