package com.data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManipulation
{
   
	public static void main(String[] args)
	{
		
    	 
		FileInputStream fis=null;
		FileOutputStream fos=null;
		int x;
		try
		{
			
			fis=new FileInputStream(".//resources//text1.txt");
			fos=new FileOutputStream(".//resources//Demotext.txt");
			
			
			do
			{
				x=fis.read();
				if(x!=-1)
					fos.write((char)x);
				
			}  while(x!=-1);
        }
		catch(IOException e)
		{
			e.printStackTrace();
	
		}
		finally
		{
			try
			{
				fis.close();
				fos.close();
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}