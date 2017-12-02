
package unitTesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import help.StringHelper;

public class StringTestHelper {
	StringHelper helper;
	
	@Before
	public void before(){
		helper = new StringHelper();
	}

	@Test
	public void testTruncateAInFirst2Positions_test_AAbcd(){
		assertEquals("bcd", helper.truncateAInFirst2Positions("AAbcd"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_test_empty(){
		assertEquals("", helper.truncateAInFirst2Positions(""));
	}
	
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_test_SOKOS(){
		assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("SOKOS"));
	}
	
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_test_AABAA(){
		assertEquals(true, helper.areFirstAndLastTwoCharactersTheSame("AABAA"));
	}

}