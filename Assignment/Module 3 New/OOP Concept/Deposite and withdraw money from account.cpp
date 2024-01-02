#include <iostream>
using namespace std;

class BankAccount
{
	private:
	    int accountNumber;
	    double balance;
	
	public:
	    BankAccount(int accNumber, double initialBalance) 
		{
	        accountNumber = accNumber;
	        balance = initialBalance;
	    }
	
	    int getAccountNumber() const 
		{
	        return accountNumber;
	    }
	
	    double getBalance() const
		{
	        return balance;
	    }
	
	    void deposit(double amount) 
		{
	        if (amount > 0) 
			{
	            balance += amount;
	            cout << "Deposit of " << amount<< endl;
	        } 
			else
			{
			
	            cout << "Invalid deposit amount. Please enter a positive amount." << endl;
	        }
	    }
	    void withdraw(double amount)
		{
	        if (amount > 0 && amount <= balance)
			{
	            balance -= amount;
	            cout << "Withdrawal of " << amount<< endl;
	        }
			else 
			{
	            cout << "Invalid withdrawal amount or insufficient funds." << endl;
	        }
	    }
};

main() 
{
    BankAccount myAccount(123457890, 10000);

    cout << "Account Number: " << myAccount.getAccountNumber() << endl;
    cout << "Initial Balance: " << myAccount.getBalance() << endl;

    myAccount.deposit(100000);
    myAccount.withdraw(8000);
    myAccount.withdraw(15000);

    cout << "\nFinal Balance: " << myAccount.getBalance() << endl;

}

