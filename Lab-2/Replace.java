import java.util.Scanner;

public class Replace{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of array: ");
		int n = sc.nextInt();
		int [] arr = new int[n];

		System.out.println("Enter A: ");
		int a = sc.nextInt();
		System.out.println("Enter B: ");
		int b = sc.nextInt();

		System.out.println("Enter array elements.");
		for(int i=0;i<n;i++){
			System.out.println("Enter arr["+i+"]");
			arr[i]=sc.nextInt();
		}

		int flag=0;

		for(int i=0;i<n;i++){
			if(a==arr[i]){
				arr[i] = b;
				System.out.println("Index of replacement= "+i);
			}
			if(a!=arr[i]){
				flag=1;
				
			}
		}

		if(flag==1){
			System.out.println("No. a is not matching with any index.");
		}

		if(flag==0){
			System.out.println("New array after replacement is: ");
			for(int i=0;i<n;i++){
				System.out.println("arr["+i+"]="+arr[i]);
			}
		}
	}
}