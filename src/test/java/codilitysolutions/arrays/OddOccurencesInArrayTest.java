package codilitysolutions.arrays;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OddOccurencesInArrayTest {
	private OddOccurencesInArray oddOccurencesInArray;
	
	@Before
	public void setup() {		
		oddOccurencesInArray = new OddOccurencesInArray();
	}

	@Test
	public void shouldReturnTheValueOfUnpairElement() {
		int[] inArray = new int[] { 9, 3, 9, 3, 9, 7, 9 };
		
		int result = oddOccurencesInArray.solution(inArray);

		assertEquals(7, result);
	}

}
