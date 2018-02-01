package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_001 {

	

	@Test				
	public void Dummy_test_to_pass() 
	{									 
	Assert.assertEquals(1,1); 		
	}	
	@Test				
	 public void Dummy_test_to_fail()
	 {								 
	Assert.assertEquals(1,12);
	
	}
	
	

}

