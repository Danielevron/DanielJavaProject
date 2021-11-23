package com.company;

//import com.company.IAccount;

    public class BasicAccount extends StandardAccount {
        protected double WithdrawLimit;
        protected double CreditLimit;


        // constacur
        public BasicAccount(int accountNumber, double withdrawLimit)
        {
            super(accountNumber,withdrawLimit);
            this.WithdrawLimit = withdrawLimit;
            this.CreditLimit = 0;
        }

        @Override
        public double Withdraw(double amount) {
            if (amount >= this.WithdrawLimit ) {
                if (this.WithdrawLimit <= this.Currentbalance) {
                    this.Currentbalance = this.Currentbalance - this.WithdrawLimit;
                    return this.WithdrawLimit;
                } else {
                    return this.Currentbalance;
                }
            }
            else
                {
                    if (amount <= this.Currentbalance)
                    {
                        this.Currentbalance = this.Currentbalance - amount;
                        return amount;}
                    else
                    {
                        return this.Currentbalance;
                    }
                }
            }









    }



