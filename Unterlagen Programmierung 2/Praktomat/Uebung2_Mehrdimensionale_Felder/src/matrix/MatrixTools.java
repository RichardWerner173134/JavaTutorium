package matrix;

public class MatrixTools {
	public static int[][] createMatrix(int m, int n){
		if(m > 0 && n > 0) {
			int[][] matrix = new int[m][n];		
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					matrix[i][j] = (int)(Math.random() * 10 + 1);
				}
			}
		
			return matrix;
		}
		
		else {
			return null;
		}
	}
	
	public static void printMatrix(int[][] m) {
		
		try{
			for(int i = 0; i < m.length; i++) {
				for(int j = 0; j <  m[0].length; j++) {
					if(j == m[0].length - 1) {
						System.out.println(m[i][j]);
					}
					else {
						System.out.print(m[i][j] + "   ");
					}
				}
			}
		}
		catch (NullPointerException e) {
			System.out.println();
		}
	}
	
	public static int[][] getTransposedMatrix(int[][] m){
		
		try {
			
			int test = m[0].length;
			for(int c = 0; c < m.length; c++) {
				if(m[c].length != test) {
					return null;
				}
			}
			
			int[][] tMat = new int[m[0].length][m.length];
			
			for(int i = 0; i < m.length; i++) {
				for(int j = 0; j < m[0].length; j++) {
					tMat[j][i] = m[i][j];
				}
			}
			
			return tMat;
		}
		
		catch (NullPointerException e){
			return null;
		}
	}
	
	public static boolean isSymmetric(int[][] m) {
		try {

			if(m.length != m[0].length) {
				return false;
			}
			else {
				for(int i = 0; i < m.length; i++) {
					for(int j = 0; j < m[0].length; j++) {
						if(m[i][j] != m[j][i]) {
							return false;
						}
					}
				}
				
				return true;
			}
		}
		catch (NullPointerException e){
			return false;
		}
	}
	
	public static int matrixSpur(int[][] matrix) {
		try{
			int summe = 0;
			
			if(matrix.length != matrix[0].length) {
				return 0;
			}
			else {
				for(int i = 0; i < matrix.length; i++) {
					summe = summe + matrix[i][i];
				}
				return summe;
			}
		}
		catch (NullPointerException e) {
			return 0;
		}
	}
	
	public static int[][] matrixMul(int[][] a, int[][] b){
		
		try {
			
			if(a[0].length != b.length) {
				return null;
			}
			
			int[][] pMat = new int[a.length][b[0].length];
			int sum;
			
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < b[0].length; j++) {
					sum = 0;
					for(int k = 0; k < b.length; k++) {
						sum += a[i][k] * b[k][j];
					}
					pMat [i][j] = sum;
				}
			}
				
			return pMat;
		}
		catch(NullPointerException e) {
			return null;
		}
	}


	
	
}
