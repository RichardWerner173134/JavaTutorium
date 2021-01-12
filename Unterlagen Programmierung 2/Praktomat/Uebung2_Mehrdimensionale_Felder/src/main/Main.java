package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Matrix m x n: m = ");
		int m = sc.nextInt();
		System.out.print("Matrix m x n: n = ");
		int n = sc.nextInt();
		
		int[][] mat1 = matrix.MatrixTools.createMatrix(m, n);
		int[][] mat2 = matrix.MatrixTools.createMatrix(n, m);
		
		System.out.println("mat1");
		matrix.MatrixTools.printMatrix(mat1);
		System.out.println("mat2");
		matrix.MatrixTools.printMatrix(mat2);
		
		System.out.println();
		System.out.println("Transponierte Matrix");
		matrix.MatrixTools.printMatrix(matrix.MatrixTools.getTransposedMatrix(mat1));
		
		System.out.println("Die Matrix ist symmetrisch: " + matrix.MatrixTools.isSymmetric(mat1));
		System.out.println("Spur der Matrix = " + matrix.MatrixTools.matrixSpur(mat1));
		
		System.out.println("mat1 * mat 2 = ");
		matrix.MatrixTools.printMatrix(matrix.MatrixTools.matrixMul(mat1, mat2));
	
	}

}
