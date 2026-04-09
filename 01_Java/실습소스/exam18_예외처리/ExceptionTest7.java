package exam18_예외처리;

//계좌
class Account{
	
	int balance=100; //잔고
	//출금
	public void withdraw(int amt)throws InSufficentBalanceException {
		if(balance >= amt) {
			balance -= amt;
		}else {
			//잔액부족인 경우 시스템은 예외라고 인식 안함.
			//하지만 개발자는 예외라고 가정할 수 있기 때문에 명시적 예외발생 필요.
			throw new InSufficentBalanceException("잔액부족으로 예외발생");
		}
	}
}
public class ExceptionTest7 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");	
		Account acct = new  Account();
		try {
		 acct.withdraw(50);
		 acct.withdraw(500);
		}catch(InSufficentBalanceException e) {
			System.out.println(e.getMessage()); // "잔액부족으로 예외발생"
		}
		System.out.println("프로그램 정상종료");	
	}//end main
}
