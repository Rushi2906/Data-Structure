import java.util.Scanner;

public class Prime_Without_Operator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int n = sc.nextInt();
			
		Prime_Without_Operator obj = new Prime_Without_Operator();
		obj.prime(n);
	}

	void prime(int n){
		int flag=1;
		for(int i=2;i<n;i++){
			if(countModule(n,i)==0){
				flag=0;
				break;
			}
		}
		if(flag==0){
			System.out.println("Given number is not Prime");
		}
		if(flag==1){
			System.out.println("Given number is Prime");
		}
	}

	int countModule(int n,int i){
		while(n>=i){
			n=n-i;
		}
		return n;
	}
}
