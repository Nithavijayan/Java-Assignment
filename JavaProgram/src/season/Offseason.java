package season;
import java.util.*;
public class Offseason extends Onseason
{
	Scanner sc=new Scanner(System.in);
	String season;
	   public void check(int item1,int item2,String season)
	   {
		   this.item1=item1;
		   this.item2=item2;
		   this.season=season;
		   
		   System.out.println("enter your season --onseason or offseason--");
			season=sc.nextLine();
		   
		   sum=item1+item2;
		   System.out.println("total before discount "+sum);
		   
		   if(season.contains("onseason"))
			   super.discount();
		   else
			   discount();
	   }
	   
	  public void discount()
	   { 
		  value=sum*15/100;
		  sum=sum-value;
		   System.out.println("final amount "+sum); 
	   }
	   
	public static void main(String[] args)
	{		
		Offseason obj=new Offseason();
		obj.check(2500,1050,"season");

	}
}
