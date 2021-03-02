package ro.ase.csie.cts.g1092.week2;

import ro.ase.csie.cts.g1092.week2.exception.InsufficientFundsException;

public abstract class Account {
	public abstract double getBalance();
	public abstract void deposit(double amount);
	public abstract void transfer(Account destination, double ammount) throws InsufficientFundsException;
	public abstract void withdraw(double amount) throws InsufficientFundsException;
}
