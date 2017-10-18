package main;

public class Main {
	
	public static void main(String[] args)
	{
		if(args.length==0)
		{
			System.out.println("No any parameters are used");
		}
		else
		{
			for(String tmp : args)
			{
				System.out.println("Hello "+tmp);
			}
		}
	}

}
