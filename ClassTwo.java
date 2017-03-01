package testcases;

import org.testng.annotations.Test;

public class ClassTwo 
{
	 @Test(groups="Test1")
	  public void ClassTwofirstTC()
	  {
		  System.out.println("ClassTwofirstTC");
	  }
	  
	  @Test(groups="Test2", timeOut=1000)
	  public void ClassTwosecondTC() throws InterruptedException
	  {
		  Thread.sleep(3000);
		  System.out.println("ClassTwosecondTC");
	  }
	
	
}
