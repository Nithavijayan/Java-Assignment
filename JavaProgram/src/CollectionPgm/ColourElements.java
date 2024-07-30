package CollectionPgm;

import java.util.ArrayList;

public class ColourElements 
{
	static ArrayList <String> ls=new ArrayList <String> ();
	
	public static void main(String[] args)
	{
		Colour clr=new Colour();
		clr.colours();
		clr.iterate();
		clr.remove(ls.get(3));
		clr.retrieve(ls.get(2));
		clr.search(ls.get(4));

	}
}
