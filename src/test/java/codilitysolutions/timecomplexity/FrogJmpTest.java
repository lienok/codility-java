package codilitysolutions.timecomplexity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FrogJmpTest {

	private FrogJmp frogJmp;

	@Before
	public void setup() {
		frogJmp = new FrogJmp();
	}

	@Test
	public void shouldFindLowestNeededSteps_1() {
		int result = frogJmp.solution(10, 85, 30);

		assertEquals(3, result);
	}
	
	@Test
	public void shouldFindLowestNeededSteps_2() {
		int result = frogJmp.solution(1, 5, 2);

		assertEquals(2, result);
	}
	
	@Test
	public void shouldFindLowestNeededStepsManyJumps() {
		int result = frogJmp.solution(1, 1000000, 5);

		assertEquals(200000, result);
	}
	
	@Test
	public void shouldFindLowestNeededStepsMaxDistance() { //1,000,000,000
		int result = frogJmp.solution(1, 1000000000, 1);

		assertEquals(999999999, result);
	}
	
	@Test
	public void shouldFindLowestNeededStepsNoJumpNeeded() { //1,000,000,000
		int result = frogJmp.solution(1, 1, 3);

		assertEquals(0, result);
	}
	
	@Test
	public void shouldFindLowestNeededStepsOneJumpNeeded() { //1,000,000,000
		int result = frogJmp.solution(1, 2, 3);

		assertEquals(1, result);
	}

}
