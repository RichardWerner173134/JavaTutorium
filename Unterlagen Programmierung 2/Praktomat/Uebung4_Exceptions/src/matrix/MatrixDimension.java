package matrix;

import exception.InvalidMatrixException;
import exception.MatrixNotInitializedException;

public class MatrixDimension {
	private int width;
	private int height;
	
	public MatrixDimension(int[][] matrix) throws MatrixNotInitializedException, InvalidMatrixException{
		
		if(matrix == null) {
			//Ausgabe MatrixNotInitializedException
			throw new MatrixNotInitializedException();		
		}
		if(matrix.length == 0) {
			throw new InvalidMatrixException();
		}
		
		for(int c = 0; c < matrix.length; c++) {
			if(matrix[c] == null) {
				//Ausgabe MatrixNotInitializedException
				throw new MatrixNotInitializedException("Zeile" + c + " nicht intiialisiert");
			}
			if(matrix[c].length == 0 || matrix[c].length != matrix[0].length) {			
				//Ausgabe InvalidMatrixException 
				throw new InvalidMatrixException("Zeile " + c + ", ungültige Anzahl");
			}
		}
		
		this.width = matrix[0].length;
		this.height = matrix.length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}