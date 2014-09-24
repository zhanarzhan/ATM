package atm;

import java.util.Scanner;

public class ATM {

    
    public static void main(String[] args) {
        
        int choice, amount;
        
        while (choice !=4){
            choice = menu();
            switch(choice)
            {
                case 1:
                    System.out.println("What amount would you like to put in?");
                    Scanner keyboard = new Scanner (System.in);                    
                    int sum=keyboard.nextInt();
                    
                    if (sum == 0){
                        System.out.println("You have entered and incorrect amount");
                        System.out.println();
                        System.out.println();
                    }
                    
                    else {
                        amount+=sum;
                        showDeposit(amount);
                    }
                    break;
                    
                case 2:
                    System.out.println("What amount would you like to take?");
                    sum = keyboard.nextInt();
                    if (sum == 0){
                        System.out.println("You have entered and incorrect amount");
                        System.out.println();
                        System.out.println();
                    }
                    
                    else {
                        amount-=sum;
                        showWithdrawall(amount);
                    }
                    break;
               
                case 3:
                    showBalance(balance);
                    break;
               
                case 4:
                    System.out.println("End!");
                    break;
            }
    }
    
        public static int menu()
        {
            Scanner keyboard = new Scanner (System.in);
            int choice = 0;
            
            System.out.println("Welcome to ATM!");
            System.out.println();
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Balance");
            System.out.println("4. Cancel");
            System.out.println();
            System.out.println("Your selection: ");
            
            choice = keyboard.nextInt();
            
            return choice;            
        }    
    }
}
