import java.util.Scanner;

public class Swap_Numbers{
	public static void swap(int n1,int n2){
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("----------After Swapping----------");
		System.out.println("1st Number is: "+n1);
		System.out.println("2nd Number is: "+n2);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st Number: ");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		int n2=sc.nextInt();
		swap(n1,n2);

	}
}