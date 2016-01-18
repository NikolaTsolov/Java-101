package mondey;

import static org.junit.Assert.*;

import javax.swing.text.html.HTMLEditorKit.Parser;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PropartiesParserTest {
	
	@Test
	public void testMakeKeyValue() {
		assertEquals("KV", "a1", PropartiesParser.makeKeyValue("a1=b1")[0]);
		assertEquals("KV", "b1", PropartiesParser.makeKeyValue("a1=b1")[1] );
		assertEquals("KV", "a2", PropartiesParser.makeKeyValue("a2 =b2")[0]);
		assertEquals("KV", "b2", PropartiesParser.makeKeyValue("a2 =b2")[1]);
		assertEquals("KV", "b3", PropartiesParser.makeKeyValue("a3  =  b3")[1]);
		
		
	}

	
	@BeforeClass
	public static void createFiles() {
		FileUtils files;
	}
	
	@AfterClass
	public static void deleteFiles() {

	}
	

}
