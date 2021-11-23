package com.company;

import com.company.IAccount;

public class StandardAccount implements IAccount{

    protected int AccountNumber;
    protected double CreditLimit;
    protected double Currentbalance;

/// constaructor

    public StandardAccount(int accountNumber, double creditLimit) {
        this.AccountNumber = accountNumber;
        this.CreditLimit = creditLimit;
        if (this.CreditLimit >= 0) {
            this.CreditLimit = 0;
        }

    }


/// פקודות
    @Override
    public void Deposit(double amount) {
        this.Currentbalance = this.Currentbalance + amount;
    }

    @Override
    public double Withdraw(double amount)
    {
        if (amount > (this.CreditLimit*-1))
        {
            this.Currentbalance = this.Currentbalance -(this.CreditLimit*-1);
            return (this.CreditLimit*-1);
        }

        else {
            this.Currentbalance = this.Currentbalance -amount;
            return amount;
        }
    }


    @Override
    public double Getcurrentbalance() {
        return this.Currentbalance;
    }

    @Override
    public int GetAccountNumber() {
        return this.AccountNumber;
    }
}

