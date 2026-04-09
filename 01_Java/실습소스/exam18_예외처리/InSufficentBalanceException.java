package exam18_예외처리;

public class InSufficentBalanceException extends Exception{
	public InSufficentBalanceException(String message) {
		super(message);
	}

}
