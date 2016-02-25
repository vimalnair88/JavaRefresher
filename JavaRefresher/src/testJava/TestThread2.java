package testJava;

public class TestThread2 extends Thread {

	public int iC,iJ,iP,iN,r;
	public void run()
	{
		try
		{
			
			for(iC=1; iC<=100; iC++)
			{
				iP=0;
				iN=iC;
				for(iJ=0; iJ<=iN; iJ++)
				{
					r= iN%10;
					iN=iN/10;
					iP=iP*10+r;
				}
				
				if(iC == iP)
				{
					//if(iC%2==0)
						System.out.println("Palindrome "+iC);
				}
				//Thread.sleep(10);
			}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}