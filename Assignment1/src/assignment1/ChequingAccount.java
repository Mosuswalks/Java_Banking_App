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
 * @author 100649804
 */
public class ChequingAccount extends Account{
    //Properties
    private double overDraftLimit;
    
    //Overloaded Constructor with super() keyword to invoke the parent class constructor.
    public ChequingAccount(long accNum, double accBalance, String owner, double overDraft){
     super(accNum, accBalance, owner);
     
        accountNum = accNum; 
        accountBalance = accBalance;
        ownerInfo = owner;
        overDraftLimit = overDraft;
    }
    
    // Overriden withDrawFunds Method to account for the overDraft Limit.
    @Override
    public boolean withdrawFunds(double amount){
        if(amount <=(accountBalance+overDraftLimit)){
            accountBalance -= amount;
            return true;
        }
        else{
            System.out.println("Insuffcient Funds");
            return false;
        }
    }
    
    @Override
    public String toString(){
        //Override ToString Method with the addition of OverDraftLimit
        return "****************************" +
               "\nAccount Number: " + accountNum +
               "\nAccount Owner: " + ownerInfo +
               "\nAccount Balance: $" + accountBalance +
               "\nOver Draft Limit: $" + overDraftLimit +
               "****************************";
    }
}
