package com.company;

public interface IAccount {
    void Deposit(double amount);
    double Withdraw(double amount);
    double Getcurrentbalance();
    int GetAccountNumber();
}
