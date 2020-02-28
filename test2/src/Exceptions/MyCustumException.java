package Exceptions;

public class MyCustumException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 262501124370780197L;

	MyCustumException(String s){
		super(s);
		super.getMessage();
	}

}
