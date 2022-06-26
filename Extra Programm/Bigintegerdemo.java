import java.math.BigInteger;
import java.util.Scanner;

public class Bigintegerdemo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in); 
		
		BigInteger sum;

		String no1 = sc.nextLine();
		String no2 = sc.nextLine();

		BigInteger a = new BigInteger(no1);
		BigInteger b = new BigInteger(no2);

		sum = a.add(b);

		System.out.println("The sum is: "+sum);

	}
}