package hw07_201501405;
import java.util.*;

public class BankAccount {

	
	private int accountNumber; // 계좌번호
	private String owner; // 예금주
	private int balance; // 잔액 표시
		
	public BankAccount () {}
	public BankAccount(int ac, String o, int b) {
		//accountNumber = ac;
		//owner = o;
		//balance = b;
				 
		this.accountNumber = ac;
		this.owner = o;
		this.balance = b;
		 
	} // 생성자

	public int getacnum() { return accountNumber; }
	public void setacnum(int ac) { accountNumber = ac;  }
	public String geto() { return owner; }
	public void seto(String o) { owner = o; }
	public int getb() { return balance;} 
	public void setb(int b) { balance = b; }

	
	void deposit (int amount) { // 저금 기능 메소드
		balance += amount;		
	}
	
	void withdraw (int amount) { // 인출 기능 메소드
		if(amount <= balance)
			balance -= amount;
		else
			System.out.println("잔액이 부족합니다.");
	}
	
	public String toString() { //잔액 출력 메소드
		
		 return ("잔액은  " +balance + "입니다.");
	}
	
	public void print() {
		
		System.out.println("계좌번호 : " + accountNumber);
		System.out.println("예금주 : " + owner);
		System.out.println("잔액 : " + balance);
	}
	
	public int sendAccount(int amount, BankAccount otherAccount) {// 계좌이체 기능 메소드
	
		this.withdraw(amount);
		otherAccount.deposit(amount);
		
		System.out.println("계좌 1");
		this.print();
		System.out.println("계좌 2");
		otherAccount.print();
		System.out.println();
	
		return amount;
	}
	

}
