package season;

public class Onseason 
{
   int item1,item2;
   int sum;
   int value;
   
   public void discount()
   {
	    value=sum*40/100;
		  sum=sum-value;
		  
	
	   System.out.println("final amount: "+sum);
		   
		   
   }
}
