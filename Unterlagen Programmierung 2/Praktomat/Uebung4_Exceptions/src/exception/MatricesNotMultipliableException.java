package exception;

public class MatricesNotMultipliableException extends Exception{
	private static final String errMsg ="Matrizen nicht multiplizierbar";
	
	public MatricesNotMultipliableException() {
		super(errMsg);
	}
	
	public MatricesNotMultipliableException(String reason) {
		super(errMsg + ", weil " + reason);
	}
}
