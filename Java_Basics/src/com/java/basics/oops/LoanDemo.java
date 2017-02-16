package com.java.basics.oops;

public class LoanDemo {

	public static void main(String[] args) {
		
		Loan loan=new Loan();
		//loan.custId= 234;
		//loan.setLoanId(565);
		loan.setcustId(123);
		loan.loanType="Mortgage";
		System.out.println(loan.getLoanDetails(5000, 12));
		loan.displayLoanDetails();
		
		System.out.println("*********");
		
		Loan loan1=new Loan();
		//loan1.custId= -267;
		loan1.setcustId(456);
		//loan1.setLoanId(111);
		loan1.loanType="Car";
		System.out.println(loan1.getLoanDetails(2340, 24));
		loan1.displayLoanDetails();
		

	}
	
}
