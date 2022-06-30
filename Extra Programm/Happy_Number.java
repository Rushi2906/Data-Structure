import java.util.Scanner;

public class Happy_Number{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number: ");
		int n= sc.nextInt();

		int arr[] =new int[100];
		int b=0,x,i=0,flag=0;

		while(true){
			b=0;
			while(n!=0){
				x=n%10;
				n=n/10;
				b=b+(x*x);
			}
			System.out.println(b);
			if(b==1){
				System.out.println("Given Number is Happy Number.");
				break;
			}

			for(int j=0;j<i;j++){
				if(arr[j]==b){
					flag=1;
					break;
				}
			}

			if(flag==1){
				System.out.println("Given Number is not Happy Number.");
				break;
			}
			else{
				arr[i++]=b;
				n=b;
			}
		}
	}
}