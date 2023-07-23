package Junit;


import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
public class AssumptionDemo {
	@Test
	void testOnDev ()
	{
		System.setProperty("ENV", "DEV");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));		
	}
	@Test
	void testOnProd()
	{
		System.setProperty("DEV", "PROD");
		Assumptions.assumeFalse("PROD".equals(System.getProperty("DEV")), AssumptionDemo::message);
	}

	private static String message()
	{
		return "Test Execution failed";
	}
}
