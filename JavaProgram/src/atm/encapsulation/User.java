package atm.encapsulation;

import java.util.Scanner;

public class User {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Atm obj=new Atm();
		System.out.println("enter your pin number");
		obj.setPin(sc.nextInt());
		obj.validate();
		//int pn=obj.getPin();
	}
}
