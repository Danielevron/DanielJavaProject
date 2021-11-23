package com.company;

public class PremiumAccount extends StandardAccount {
//constarctur
    public PremiumAccount(int accountNumber){
        super(accountNumber,accountNumber);
    }

    @Override
    public double Withdraw(double amount) {
        this.Currentbalance = this.Currentbalance - amount;
        return amount;

    }
}
