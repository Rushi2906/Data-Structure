import java.util.Scanner;
public class Matrix_Multiplication{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int r1=3,c1=2;
		int r2=2,c2=3;
		int [][] array1 = new int[r1][c1];
		int [][] array2 = new int[r2][c2];

		System.out.println("Enter array1 elements: ");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				array1 [i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter array2 elements: ");
		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
				array2 [i][j] = sc.nextInt();
			}
		}

		System.out.println("----------Matrix-1----------");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("----------Matrix-2----------");
		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
				System.out.print(array2[i][j]+" ");
			}
			System.out.println();	
		}

		System.out.println("Multiplication of matrix is-------------- ");

		int [][] answer = new int[r1][c2];

		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){
				answer[i][j]=0;
				for(int k=0;k<c1;k++){
					answer [i][j] += array1[i][k]*array2[k][j];
				}
				System.out.print(answer [i][j]+" ");
			}
			System.out.println();
		}
	}
}