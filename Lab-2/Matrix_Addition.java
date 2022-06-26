import java.util.Scanner;
public class Matrix_Addition{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows for matrix");
		int rows=sc.nextInt();
		System.out.println("Enter number of columns for matrix");
		int columns=sc.nextInt();

		int array1 [][] = new int[rows][columns];
		int array2 [][] = new int[rows][columns];

		System.out.println("Enter array1 elements: ");
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				array1 [i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter array2 elements: ");
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				array2 [i][j] = sc.nextInt();
			}
		}

		System.out.println("----------Matrix-1----------");
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("----------Matrix-2----------");
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print(array2[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("Addition of matrix is-------------- ");

		int [][] answer = new int[rows][columns];

		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				answer [i][j] = array1[i][j]+array2[i][j];
				System.out.print(answer[i][j]+" ");
			}
			System.out.println();
		}
	}
}