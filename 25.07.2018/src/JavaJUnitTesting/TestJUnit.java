package JavaJUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJUnit {

	@Test
	public void testAdd()
	{
		String str="Working fine";
		assertEquals(str,"Working fine");
	}
	public void test() {
		fail("Not yet implemented");
	}

}
