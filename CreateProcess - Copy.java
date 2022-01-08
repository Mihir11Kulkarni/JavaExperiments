import java.io.*;
class CreateProcess
{
	public static void main(String []args)throws Exception
	{
			String command ="C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
			String command1 ="C:\\Program Files\\TextPad 8\\TextPad.exe";
			try
			{
				Runtime run =Runtime.getRuntime();
				Process proc = run.exec(command);
			    proc = run.exec(command1);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}





