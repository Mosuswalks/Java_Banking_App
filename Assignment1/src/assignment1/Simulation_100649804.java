/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * Name: Mohamed Abdi 
 * Student Number: ***-***-***
 */


package assignment1;
/**
 *
 * @author 100-649-804
 * 
 */
public class Simulation_100649804 {
    
    /* Initialize the max variable for the number of elements that
     * the array will have and arrElements to keep track of the array indexes
     */
    private static int max = 10;
    private static int arrElements = 0;
    
    // Initialize the Array of Account Class Objects
    private static Account[] accList;
    
    // Adds Accounts based on the parameter values passed.
    private static boolean addAccount(long accNum, double accBalance, String owner){

        if(arrElements < max){
            Account account = new Account(accNum,accBalance,owner);
            accList[arrElements] = account;
            arrElements++;
            return true;
        }
        else{
            System.out.println("No more room in the Array.");
            return false;
        }
    }
    
    // Adds Chequing Accounts with the addition of the overdraft parameter.
    private static boolean addCheqAccount(long accNum, double accBalance, 
                                        String owner, double overDraft){
        if(arrElements < max){
            ChequingAccount acc = new ChequingAccount(accNum,accBalance,
                                               owner,overDraft);
            accList[arrElements] = acc;
            arrElements++;
            return true;
        }
        else{
            System.out.println("No more room in the Array.");
            return false;
        }
    }
   
    // For Loop that iterates through the array and prints each object
    private static void printAccounts(){
        for(int i = 0; i < arrElements; i++)
         System.out.println(accList[i]+"\n");
    }
    
    //For loop that searches through the array list for matching Account Numbers.
    private static int findAccount(long accNum){
        for(int i = 0;i < arrElements;i++){    
            if(accList[i].accountNum == accNum){
                return i;
            }
        }
        System.out.println("Account not Found");
        return -1;
    }
  
    public static void main(String[] args) {
        //Initialize the Array using the max variable to set the amount of elements.
        accList = new Account[max];
        
        // Adding Accounts and Chequing Accounts
        addAccount(993823,1200345.34,"Kevin Bacon");
        addCheqAccount(446372,73468.34,"Jason Mark",1000);
        addAccount(294735,5000.00,"Miles Joe");
        addCheqAccount(882734,786.00,"Jane Austin",4000);
        addAccount(192703,23500.00,"Andrew Kein");
        
        // Display Acounts
        printAccounts();
        
        // Perform the required transactions.
        accList[findAccount(192703)].depositFunds(4000);
        accList[findAccount(882734)].withdrawFunds(3000);
        accList[findAccount(993823)].transferFunds(accList[findAccount(446372)],100000.00);
        accList[findAccount(294735)].withdrawFunds(9000);
        
        // Display Accounts again to verify that the transactions were performed.
        printAccounts();
        
    } 
}
