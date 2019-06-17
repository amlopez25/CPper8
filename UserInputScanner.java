
import java.util.Scanner;

public class UserInputScanner{
	public static void main(String[] args){
		Scanner kin = new Scanner(System.in);

		System.out.print("What is your first and last name? ");
		String name = kin.nextLine();
		System.out.println("Hello " + name + ", it's nice to meet you!");
		System.out.print("what is your Street Address?");
		String address = kin.nextLine();
		System.out.print("What is your city?");
		String city = kin.nextLine();
		System.out.print("What is your state?");
		String state = kin.nextLine();
		System.out.print("What is your zip?");
		String zip = kin.nextLine();
		new Scanner(System.in);
         	System.out.println( name );
		System.out.println( address );
		System.out.println( city + state + zip );
	}
}
