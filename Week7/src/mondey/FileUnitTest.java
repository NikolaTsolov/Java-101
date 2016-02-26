package mondey;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class FileUnitTest {

	@BeforeClass
	public static void init() {
		
	}
	
	@AfterClass
	public static void destroy() {
		
	}
	
	@Test
	public void testMakeKeyValue() {
		assertEquals("a1", PropartiesParser.makeKeyValue("a1=b1")[0]);
	}

}
