import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArraysTest  {

	@Test
	void testArrays() {
		Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
	        new Arrays();
	    });

	    String expectedMessage = "errorDeRango";
	    String actualMessage = exception.getMessage();

		/*System.out.println(expectedMessage);
		System.out.println(actualMessage);*/
	    assertTrue(actualMessage.contains(expectedMessage));
	}

}
