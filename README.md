# Java_Banking_App

Assignment 1:
  
This Assignment was designed to take you through the process of creating basic classes and instantiating their objects. It also introduces the concepts of inheritance and polymorphism in the form of overriding methods in the java programming environment. 
 
In this assignment we will be creating bank accounts of two kinds:  a generic bank account and a chequing account. The chequing account is different from the generic account in one main aspect. It has an overdraft limit. This means that chequing accounts can have a balance below 0 up to the overdraft limit. Because the chequing account has all the features of a basic account plus additional features, it should inhertit (or extend) the basic account class. 

To test all of the features, you will create a main test class called Simulation. This class will contain the main method of the program. It will be a static class and contain a single array of type account (the basic account). The Simulation class will have methods to add both basic and chequing accounts to the array. The Simulation class will also have methods to search for an account by its account number and to print the information on all accounts in the array.


Overview of the process:

A general class Account will be created with functionality common to all accounts. It is therefore the superclass of all account classes in this assignment. 

Another class ChequingAccount will be created that inherits (extends) from the superclass Account. The ChequingAccount will vary in state from the superclass with the addition of an overdraft limit. Polymorphism will also be used to make the subclass ChequingAccount have the withdraw functionality behave differently from the superclass (in order to accommodate the overdraft ability of chequing accounts).

 
