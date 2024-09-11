package com.tnsif.project;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankingServiceImpl implements BankingService {
    private Map<Integer, Customer> customers = new HashMap<>();
    private Map<Integer, Account> accounts = new HashMap<>();
    private Map<Integer, Transaction> transactions = new HashMap<>();
    private Map<Integer, Beneficiary> beneficiaries = new HashMap<>();

    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountId(), account);
    }

    public void addBeneficiary(Beneficiary beneficiary) {
        beneficiaries.put(beneficiary.getBeneficiaryId(), beneficiary);
    }

    public void addTransaction(Transaction transaction) {
        transactions.put(transaction.getTransactionId(), transaction);
    }

    public Customer findCustomerById(int customerId) {
        return customers.get(customerId);
    }

    public List<Account> listAccountsByCustomerId(int customerId) {
        List<Account> customerAccounts = new ArrayList<>();
        for (Account account : accounts.values()) {
            if (account.getCustomerId() == customerId) {
                customerAccounts.add(account);
            }
        }
        return customerAccounts;
    }

    public List<Transaction> listTransactionsByAccountId(int accountId) {
        List<Transaction> accountTransactions = new ArrayList<>();
        for (Transaction transaction : transactions.values()) {
            if (transaction.getAccountId() == accountId) {
                accountTransactions.add(transaction);
            }
        }
        return accountTransactions;
    }

    public List<Beneficiary> listBeneficiariesByCustomerId(int customerId) {
        List<Beneficiary> customerBeneficiaries = new ArrayList<>();
        for (Beneficiary beneficiary : beneficiaries.values()) {
            if (beneficiary.getCustomerId() == customerId) {
                customerBeneficiaries.add(beneficiary);
            }
        }
        return customerBeneficiaries;
    }
}



