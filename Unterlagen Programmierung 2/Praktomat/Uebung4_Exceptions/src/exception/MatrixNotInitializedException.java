package exception;

public class MatrixNotInitializedException extends Exception{
	private static final String errMsg ="Matrix nicht initialisiert";
	
	public MatrixNotInitializedException() {
		super(errMsg);
	}
	
	public MatrixNotInitializedException(String reason) {
		super(errMsg + ", weil " + reason);
	}
}
