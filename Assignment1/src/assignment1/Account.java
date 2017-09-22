package assignment1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * Name: Mohamed Abdi 
 * Student Number: 100-649-804
 */

/**
 *
 * @author 100-649-804
 */
public class Account {
    protected long accountNum;
    protected double accountBalance;
    protected String ownerInfo;
    
    //Overloaded Constructor that takes 3 parameters.
    public Account(long accNum, double balance, String owner){
        accountNum = accNum;
        accountBalance = balance;
        ownerInfo = owner;
    }
    /* Withdraw Funds takes 1 parameter(amount being withdrawn) 
     * and simply subtracts it from the balance.
     */
    public boolean withdrawFunds(double amount){
        if(accountBalance > amount){
            accountBalance -= amount;
            return true;
        }
        else{
            System.out.println("\nThe amount you've entered is more then the available funds.");
        }
            return false;
    }
    
    public void depositFunds(double amount){
        accountBalance += amount;
    }
    
    /* Transfer fund method first removes the amount from the account 
     * and then deposits the amount to the target account. An error message is printed 
     * if the amount exceeds the balance.
     */
    public boolean transferFunds(Account targetAccount, double amount){
        if(accountBalance >= amount){
            accountBalance -= amount;
            targetAccount.depositFunds(amount);
            return true;
        }
        else{
            System.out.println("\nError: Insufficient funds, no deposit done");
            return false;
        }
    }

    @Override
    public String toString(){
        //Overriden ToString Method
        return "****************************" +
               "\nAccount Number: " + accountNum +
               "\nAccount Owner: " + ownerInfo +
               "\nAccount Balance: $" + accountBalance +
               "\n****************************";
    }

    //Accesors 
    protected long getAccountNumber(){
        return accountNum;
    }
    
    protected double getAccountBalance(){
        return accountBalance;
    }
    
    protected String getOwner(){
        return ownerInfo;
    }
    
    
    
}

