import java.io.*;
import java.util.*;

public class Transpose{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		int originalMatrix[][] = new int[x][y];

		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				originalMatrix[i][j] = sc.nextInt();
			}
		}

		int transposedMatrix[][] = new int[y][x];

		for(int i=0;i<y;i++){
			for(int j=0;j<x;j++){
				transposedMatrix[i][j] = originalMatrix[j][i];
			}
		}

		System.out.println("Original Matrix:");
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				System.out.print(originalMatrix[i][j]+" ");
			}
			System.out.println();
		}

	System.out.println("Original Matrix:");
		for(int i=0;i<y;i++){
			for(int j=0;j<x;j++){
				System.out.print(transposedMatrix[i][j]+" ");
			}
			System.out.println();
		}
}
}