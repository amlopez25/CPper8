import java.util.Scanner;

class CashRegister {
  public static void main(String[] args) {
    Scanner kin = new Scanner(System.in);
    
    System.out.print("Please enter the amount of a bill: ");
    double bill = kin.nextDouble();
    System.out.print("How mauch are you paying: ");
    double paid = kin.nextDouble();
    double change = paid - bill;
    System.out.println("The change is " + change); 
    System.out.println();
    
    int twenties = (int)(change / 20);
    System.out.println("$20: " + twenties);
    change = change % 20;
    
    int tens = (int)(change / 10);
    System.out.println("$10: " + tens);
    change = change % 10;
    
    int fives = (int)(change / 5);
    System.out.println("$5: " + fives);
    change = change % 5;
    
    int ones = (int)(change / 1);
    System.out.println("$1: " + ones);
    change = change % 1;
    
    int quarters = (int)(change / .25);
    System.out.println("$0.25: " + quarters);
    change = change % .25;
    
    int dimes = (int)(change / .10);
    System.out.println("$0.10: " + dimes);
    change = change % .10;
    
    int nickels = (int)(change / .05);
    System.out.println("$0.05: " + nickels);
    change = change % .05;
    
    int pennies = (int)(change / .01);
    System.out.println("$0.01: " + pennies);
     
     

  }
}