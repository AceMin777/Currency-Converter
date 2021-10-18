import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount, dollar, pound, euro, yen, ringgit, rupee;
		int code;
		char choice;
		 
		DecimalFormat f = new DecimalFormat("##.##");
 
		Scanner sc = new Scanner(System.in);
 
		System.out.println("Currency Converter");
		
		do {
			System.out.println("\nWhich currency You want to Convert ? ");
			
			System.out.println("1:Ruppe \t2:Dollar \t3:Pound \n4:Euro \t5:Yen \t6:Ringgit ");
			code = sc.nextInt();
			
			System.out.println("How much Money you want to convert ?");
			amount = sc.nextFloat();
			
			switch(code) {
			case 1:
				dollar = amount / 70;
				System.out.println(amount + " Rupee is " + f.format(dollar) + " Dollars");
	 
				pound = amount / 88;
				System.out.println(amount + " Rupee is "  + f.format(pound) + " Pound");
	 
				euro = amount / 80;
				System.out.println(amount + " Rupee is "  + f.format(euro) + " Euro");
	 
				yen = amount / 0.63;
				System.out.println(amount + " Rupee is "  + f.format(yen) + " Yen");
	 
				ringgit = amount / 16;
				System.out.println(amount + " Rupee is "  + f.format(ringgit) + " ringgit");
				break;
			case 2:
				rupee = amount * 70;
				System.out.println(amount + " Dollar is " + f.format(rupee) + " Ruppes");
	 
				pound = amount * 0.78;
				System.out.println(amount + " Dollar is " + f.format(pound) + " Pound");
	 
				euro = amount * 0.87;
				System.out.println(amount + " Dollar is " + f.format(euro) + " Euro");
	 
				yen = amount * 111.087;
				System.out.println(amount + " Dollar is " + f.format(yen) + " Yen");
	 
				ringgit = amount * 4.17;
				System.out.println(amount + " Dollar is " + f.format(ringgit) + " ringgit");
				break;
			case 3:
				rupee = amount * 88;
				System.out.println(amount + " pound is " + f.format(rupee) + " Ruppes");
	 
				dollar = amount * 1.26;
				System.out.println(amount + " pound is " + f.format(dollar) + " Dollar");
	 
				euro = amount * 1.10;
				System.out.println(amount + " pound is " + f.format(euro) + " Euro");
	 
				yen = amount * 140.93;
				System.out.println(amount + " pound is " + f.format(yen) + " Yen");
	 
				ringgit = amount * 5.29;
				System.out.println(amount + " pound is " + f.format(ringgit) + " ringgit");
				break;
			case 4:
				rupee = amount * 80;
				System.out.println(amount + " euro is " + f.format(rupee) + " Ruppes");
	 
				dollar = amount * 1.14;
				System.out.println(amount + " euro is " + f.format(dollar) + " Dollar");
	 
				pound = amount * 0.90;
				System.out.println(amount + " euro is " + f.format(pound) + " Pound");
	 
				yen = amount * 127.32;
				System.out.println(amount + " euro is " + f.format(yen) + " Yen");
	 
				ringgit = amount * 4.78;
				System.out.println(amount + " euro is " + f.format(ringgit) + " ringgit");
				break;
			case 5:
				rupee = amount * 0.63;
				System.out.println(amount + " yen is " + f.format(rupee) + " Ruppes");
	 
				dollar = amount * 0.008;
				System.out.println(amount + " yen is " + f.format(dollar) + " Dollar");
	 
				pound = amount * 0.007;
				System.out.println(amount + " yen is " + f.format(pound) + " Pound");
	 
				euro = amount * 0.007;
				System.out.println(amount + " yen is " + f.format(euro) + " Euro");
	 
				ringgit = amount * 0.037;
				System.out.println(amount + " yen is " + f.format(ringgit) + " ringgit");
				break;
			case 6:
				rupee = amount * 16.8;
				System.out.println(amount + " ringgit is " + f.format(rupee) + " Ruppes");
	 
				dollar = amount * 0.239;
				System.out.println(amount + " ringgit is " + f.format(dollar) + " dollar");
	 
				pound = amount * 0.188;
				System.out.println(amount + " ringgit is " + f.format(pound) + " pound");
	 
				euro = amount * 0.209;
				System.out.println(amount + " ringgit is " + f.format(euro) + " euro");
	 
				yen = amount * 26.63;
				System.out.println(amount + " ringgit is " + f.format(yen) + " yen");
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
			System.out.print("\n Would You like to convert another Currency?"
					        + "\n Enter Y for yes or N for no: ");
			
	        choice = sc.next().charAt(0);
		} while((choice == 'y') || (choice == 'Y'));
		System.out.println("Currency Converter Ends");
	}
}
