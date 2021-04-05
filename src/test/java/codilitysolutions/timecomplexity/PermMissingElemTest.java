package codilitysolutions.timecomplexity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PermMissingElemTest {

	private PermMissingElem frogJmp;

	@Before
	public void setup() {
		frogJmp = new PermMissingElem();
	}

	@Test
	public void shouldFindMissingElement() {
		int result = frogJmp.solution(new int[] {2, 3, 1, 5});

		assertEquals(4, result);
	}
	
	@Test
	public void shouldFindMissingElementArraySizeOne() {
		// n = 1	(0-100000)
		int result = frogJmp.solution(new int[] {2});

		assertEquals(1, result);
	}
	
	@Test
	public void shouldFindMissingElementArraySizeZero() {
		// n = 0	(0-100000)
		int result = frogJmp.solution(new int[] {});

		assertEquals(1, result);
	}

}