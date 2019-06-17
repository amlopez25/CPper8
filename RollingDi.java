import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner kin = new Scanner(System.in);

      char choice;

    System.out.println("Rolling Two Dice");

   do
     {

  int dr1=(int)(Math.random()*6+1);
      int dr2=(int)(Math.random()*6+1);

  System.out.print("Die 1: " + dr1 + ", ");
  System.out.print("Die 2: " + dr2 + ", ");
  System.out.println("sum of two dice: " + (dr1 + dr2));

    System.out.print("Would you like to roll again? (y/n) ");
    choice = kin.next().charAt(0);
 }

   while ((choice == 'y') || (choice == 'Y')); 
  System.out.println("\n Goodbye");

  }
  
}