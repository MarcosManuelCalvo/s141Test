import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnyTest {

	@Test
	void testAgost() {
		Any any = new Any();
		String s = any.mes(8);
		assertEquals("Agost", s);
	}
	
	@Test
	void testSize() {
		Any any = new Any();
		   assertEquals(12, any.tamany());
		}

}
