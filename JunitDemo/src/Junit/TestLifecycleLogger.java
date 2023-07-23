package Junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

@TestInstance(Lifecycle.PER_CLASS)
public interface TestLifecycleLogger {

	@BeforeAll
	default void beforeAllTest()
	{
		System.out.println("Before all tests");
	}
	
	@AfterAll
	default void afterAllTests()
	{
		System.out.println("After all tests");
	}
	
	@Test
	default void testMethod()
	{
		System.out.println("This is test method");
	}
}
