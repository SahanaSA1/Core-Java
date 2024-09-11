package com.tnsif.project;
import java.util.List;
public interface BankingService {
	void addCustomer(Customer customer);
    void addAccount(Account account);
    void addBeneficiary(Beneficiary beneficiary);
    void addTransaction(Transaction transaction);
    Customer findCustomerById(int customerId);
    List<Account> listAccountsByCustomerId(int customerId);
    List<Transaction> listTransactionsByAccountId(int accountId);
    List<Beneficiary> listBeneficiariesByCustomerId(int customerId);

}
