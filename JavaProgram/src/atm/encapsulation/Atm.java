package atm.encapsulation;

public class Atm 
{ 
	private int pin;
	
	public void validate()
	{
		if(pin==1001||pin==1234||pin==1212)
		
			System.out.println("pin number is valid");
		
		else
		
			System.out.println("pin number is not valid");
				
		
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
}
