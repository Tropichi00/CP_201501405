package hw07_201501405;
import java.util.*;

public class BankAccount {

	
	private int accountNumber; // ���¹�ȣ
	private String owner; // ������
	private int balance; // �ܾ� ǥ��
		
	public BankAccount () {}
	public BankAccount(int ac, String o, int b) {
		//accountNumber = ac;
		//owner = o;
		//balance = b;
				 
		this.accountNumber = ac;
		this.owner = o;
		this.balance = b;
		 
	} // ������

	public int getacnum() { return accountNumber; }
	public void setacnum(int ac) { accountNumber = ac;  }
	public String geto() { return owner; }
	public void seto(String o) { owner = o; }
	public int getb() { return balance;} 
	public void setb(int b) { balance = b; }

	
	void deposit (int amount) { // ���� ��� �޼ҵ�
		balance += amount;		
	}
	
	void withdraw (int amount) { // ���� ��� �޼ҵ�
		if(amount <= balance)
			balance -= amount;
		else
			System.out.println("�ܾ��� �����մϴ�.");
	}
	
	public String toString() { //�ܾ� ��� �޼ҵ�
		
		 return ("�ܾ���  " +balance + "�Դϴ�.");
	}
	
	public void print() {
		
		System.out.println("���¹�ȣ : " + accountNumber);
		System.out.println("������ : " + owner);
		System.out.println("�ܾ� : " + balance);
	}
	
	public int sendAccount(int amount, BankAccount otherAccount) {// ������ü ��� �޼ҵ�
	
		this.withdraw(amount);
		otherAccount.deposit(amount);
		
		System.out.println("���� 1");
		this.print();
		System.out.println("���� 2");
		otherAccount.print();
		System.out.println();
	
		return amount;
	}
	

}
