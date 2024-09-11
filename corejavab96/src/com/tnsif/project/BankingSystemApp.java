package com.tnsif.project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankingSystemApp {

    public static void main(String[] args) {
        BankingService bankingService = new BankingServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\nBanking System");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Account");
            System.out.println("3. Add Beneficiary");
            System.out.println("4. Add Transaction");
            System.out.println("5. Find Customer by Id");
            System.out.println("6. List all Accounts of specific Customer");
            System.out.println("7. List all Transactions of specific Account");
            System.out.println("8. List all Beneficiaries of specific Customer");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            // Validate choice input
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 9.");
                scanner.next(); // Consume invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer Id: ");
                    int customerId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Contact No: ");
                    String contact = scanner.nextLine();
                    bankingService.addCustomer(new Customer(customerId, name, address, contact));
                    System.out.println("Customer added successfully.");
                    break;
                case 2:
                    System.out.print("Enter Account Id: ");
                    int accountId = scanner.nextInt();
                    System.out.print("Enter Customer Id: ");
                    int custId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Account Type (Saving/Current): ");
                    String accountType = scanner.nextLine();
                    System.out.print("Enter Balance: ");
                    double balance = scanner.nextDouble();
                    bankingService.addAccount(new Account(accountId, custId, accountType, balance));
                    System.out.println("Account added successfully.");
                    break;
                case 3:
                    System.out.print("Enter Beneficiary Id: ");
                    int beneficiaryId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Beneficiary Name: ");
                    String beneficiaryName = scanner.nextLine();
                    System.out.print("Enter Customer Id: ");
                    int benCustId = scanner.nextInt();
                    bankingService.addBeneficiary(new Beneficiary(beneficiaryId, beneficiaryName, benCustId));
                    System.out.println("Beneficiary added successfully.");
                    break;
                case 4:
                    System.out.print("Enter Transaction Id: ");
                    int transactionId = scanner.nextInt();
                    System.out.print("Enter Account Id: ");
                    int transAccountId = scanner.nextInt();
                    System.out.print("Enter Amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Transaction Type (Deposit/Withdraw): ");
                    String type = scanner.nextLine();
                    bankingService.addTransaction(new Transaction(transactionId, transAccountId, amount, type));
                    System.out.println("Transaction added successfully.");
                    break;
                case 5:
                    System.out.print("Enter Customer Id: ");
                    int findCustId = scanner.nextInt();
                    Customer customer = bankingService.findCustomerById(findCustId);
                    if (customer != null) {
                        System.out.println("Customer Found: " + customer.getName());
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;
                case 6:
                    System.out.print("Enter Customer Id: ");
                    int listCustId = scanner.nextInt();
                    System.out.println("Accounts for Customer Id " + listCustId + ":");
                    for (Account acc : bankingService.listAccountsByCustomerId(listCustId)) {
                        System.out.println("Account Id: " + acc.getAccountId() + ", Type: " + acc.getAccountType() + ", Balance: " + acc.getBalance());
                    }
                    break;
                case 7:
                    System.out.print("Enter Account Id: ");
                    int listAccId = scanner.nextInt();
                    System.out.println("Transactions for Account Id " + listAccId + ":");
                    for (Transaction trans : bankingService.listTransactionsByAccountId(listAccId)) {
                        System.out.println("Transaction Id: " + trans.getTransactionId() + ", Amount: " + trans.getAmount() + ", Type: " + trans.getType());
                    }
                    break;
                case 8:
                    System.out.print("Enter Customer Id: ");
                    int listBenCustId = scanner.nextInt();
                    System.out.println("Beneficiaries for Customer Id " + listBenCustId + ":");
                    for (Beneficiary ben : bankingService.listBeneficiariesByCustomerId(listBenCustId)) {
                        System.out.println("Beneficiary Id: " + ben.getBeneficiaryId() + ", Name: " + ben.getName());
                    }
                    break;
                case 9:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 9);

        scanner.close();
    }
}

                 

               