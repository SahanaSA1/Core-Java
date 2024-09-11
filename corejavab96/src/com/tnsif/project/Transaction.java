package com.tnsif.project;

public class Transaction {
	 private int transactionId;
	    private int accountId;
	    private double amount;
	    private String type; // Deposit or Withdraw

	    public Transaction(int transactionId, int accountId, double amount, String type) {
	        this.transactionId = transactionId;
	        this.accountId = accountId;
	        this.amount = amount;
	        this.type = type;


}

		public int getTransactionId() {
			return transactionId;
		}

		public void setTransactionId(int transactionId) {
			this.transactionId = transactionId;
		}

		public int getAccountId() {
			return accountId;
		}

		public void setAccountId(int accountId) {
			this.accountId = accountId;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
}
