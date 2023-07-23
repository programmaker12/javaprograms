package Junit;
// imports
import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
/*----------------------------------------------------*/
public class ParameterizedTestdemo {
	
	@ParameterizedTest
	@ValueSource(ints = {1, 2, 3, 4, 5})
	void withValueSource(int number)
	{
		assertNotNull(number);
	}

}
