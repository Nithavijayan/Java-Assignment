package pkge;

public class FirstProgram {
  int num1,num2,num3;
	public  void sum(int num1,int num2)
	{
			num3=num1+num2;
		System.out.println("result is : "+num3);
		
	}
	public static void main(String[] args) {
		FirstProgram obj=new FirstProgram();
		obj.sum(10,15);
		// TODO Auto-generated method stub

	}

}
