package exception;

public class MatrixSpurNotAvailableException extends Exception{
	private static final String errMsg ="Matrixspur nicht verf�gbar";
	
	public MatrixSpurNotAvailableException() {
		super(errMsg);
	}
	
	public MatrixSpurNotAvailableException(String reason) {
		super(errMsg + ", weil " + reason);
	}
}
