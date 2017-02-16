package com.java.basics.oops;

public class Loan {
	private static int idGenerator;
	
	private int loanId ;
	private int custId;
	String loanType;
	int RATE_OF_INTEREST=8;
	
	public Loan(){
		
		loanId=++idGenerator;
	}
	/* public void setLoanId(int loanId){
		
		this.loanId=loanId;
			
	}
	*/
	
	public int getLoanId(){
		
		return loanId;
	}
	
	public void setcustId(int custId){
		
		this.custId=custId;
	}
	
	
	public int getcustId(){
		
		return custId;
	}
	
	
	public void displayLoanDetails(){
		
		System.out.println("Loan Type: " + loanType + " " + "custId : "+ custId + "Loan Id : " + loanId ); 
		
	}
	public float getLoanDetails(float principal,int tenure){
		float interestAmount=(principal*tenure*RATE_OF_INTEREST)/100;
		return interestAmount;
		
	}


	
}
