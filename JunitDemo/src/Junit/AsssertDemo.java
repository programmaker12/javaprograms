package Junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AsssertDemo
{
	
@Test	
 public void compare()
 {
	 int result = 1;
	 int expected = 1;
	 assertEquals(result, expected);
 }
 @Test
 public void simpleAdd1()
 {
	 int result = 1;
	 int expected = 2;
	 assertEquals(result, expected);
 }
 @Test
 public void simpleADD2()
 {
	 int result = 2;
	 int expected = 2;
	 assertEquals(result, expected);
 }
}
