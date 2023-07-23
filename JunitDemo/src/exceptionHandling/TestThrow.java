package exceptionHandling;
import java.io.IOException;
public class TestThrow {
	void m() throws IOException
	{
		throw new IOException("Device error");
	}
	void n() throws IOException
	{
		m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled..");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestThrow obj = new TestThrow();
		obj.p();
		System.out.println("Normal Flow");

	}

}
