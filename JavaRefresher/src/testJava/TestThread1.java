package testJava;

public class TestThread1 extends Thread {
	public int iC,iJ,iP;
	public void run()
	{
		try
		{
			
			for(iC=2; iC<=100; iC++)
			{
				iP=1;
				for(iJ=2; iJ<=Math.sqrt(iC); iJ++)
					if(iC%iJ == 0)
					{
						iP=0;break;
					}
					if(iP ==1)
						System.out.println("Prime no"+iC);
					//Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}