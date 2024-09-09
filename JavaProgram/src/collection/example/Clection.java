package collection.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Clection 
{

	public static void main(String[] args) 
	{
		ArrayList <String> list=new ArrayList <String> ();
		list.add("TVM");
		list.add("KOLLAM");
		list.add("ALPY");
		list.add("EKM");
		list.add("KZHD");
		list.add("KTM");
		System.out.println("list : "+list);
		
		list.remove(3);// for removing one list
		System.out.println(list);
		
		Collections.sort(list);// sorting 
		System.out.println(list);
		
		System.out.println();
		System.out.println("list using for loop");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println();
		System.out.println("list using for...each loop");
		for(String st:list)
		{
			System.out.println(st);
		}
		
		System.out.println();
		System.out.println("list using Iterator");
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// TODO Auto-generated method stub

	}

}
