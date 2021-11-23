package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank
{
    private List<IAccount> bankAccounts;

    public Bank() {
        this.bankAccounts = new ArrayList<>();
    }


    @Override
    public void OpenAccount(IAccount account) {
        this.bankAccounts.add(account);
    }

    @Override
    public void CloseAccount(int accountNumber) {
        boolean foundAcount = false;
        IAccount accountToClose = null;
        for (IAccount account : bankAccounts) {
            if (account.GetAccountNumber() == accountNumber) {
                foundAcount = true;
                accountToClose = account;
                break;

            }
        }

        if (foundAcount) {
            if (accountToClose.Getcurrentbalance() >= 0) {
                bankAccounts.remove(accountToClose);
            } else {
                System.out.println("Account is not closed due to debt");
            }
        }

    }
    @Override
    public List<IAccount> GetAllAccounts()
    {
        return bankAccounts;
    }

    @Override
    public List<IAccount> GetAllAccountsInDebt()
    {
        List<IAccount> accountInDebt = new ArrayList<>();
        for(IAccount account : bankAccounts)
        {
            if (account.Getcurrentbalance() < 0)
            {
                accountInDebt.add(account);
            }
        }
        return accountInDebt;

    }

    @Override
    public List<IAccount> GetAllAccountWithBalance(double balanceAbove)
    {
        List<IAccount> accountsWithBalance = new ArrayList<IAccount>();
        for(IAccount account : bankAccounts)
        {
            if (account.Getcurrentbalance() > balanceAbove)
            {
                accountsWithBalance.add(account);
            }
        }
        return accountsWithBalance;
    }

}







