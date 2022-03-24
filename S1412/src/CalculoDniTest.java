import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CalculoDniTest {

	@Test
	void testTest() {
		ArrayList<String> test = new ArrayList<String>();
		test.add("47773713E");
		test.add("47773714T");
		test.add("56754569E");
		test.add("15252425K");
		test.add("23143862C");
		test.add("49552078G");
		test.add("74078362P");
		test.add("56054772T");
		test.add("81269997A");
		test.add("81269997A");
		assertEquals(true, CalculoDni.test(test));
		
	}
	
	@Test
	void testLetra() {
		assertEquals('E', CalculoDni.letraDni(47773713));
	}
	
	@Test
	void testDniValid() {
		assertEquals(true, CalculoDni.dniValid("47773713E"));
	}
}
