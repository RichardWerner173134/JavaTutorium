package exception;

public class InvalidMatrixException extends Exception{
	private static final String errMsg ="Matrix ungültig";
	
	public InvalidMatrixException() {
		super(errMsg);
	}
	
	public InvalidMatrixException(String reason) {
		super(errMsg + ", weil " + reason);
	}
}
