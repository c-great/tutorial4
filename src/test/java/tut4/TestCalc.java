package tut4;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class TestCalc {
	
	@Test
	public void testAdd() {
		assertEquals(20, new Calc().add(15, 5));
	}
}
