package com.data;

public class ValidateVowel {
	//public String alphabet;
    static int i;

	
	public void check(String choice) throws VowelException ,CosonentException
	{   
       char alphabet=choice.charAt(0);
	  
		if(alphabet=='a' || alphabet== 'e' || alphabet=='i' || alphabet=='o'|| alphabet=='u')
		{
			throw new VowelException("this is a vowel");
		}
		else
		{	throw new CosonentException("this is a consonent");
	
		
	    }	
	}
	
	
	public static void main(String[] args)
	{   try
		{String choice=args[0];
		ValidateVowel v=new ValidateVowel();
		
		
			v.check(choice);
		}
		
		catch(VowelException e)
		{
			e.printStackTrace();
		}
		
		catch(CosonentException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
