package codilitysolutions.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class CyclicRotationTest {
	private CyclicRotation cyclicRotation;

	@Before
	public void setup() {
		cyclicRotation = new CyclicRotation();
	}

	@Test
	public void shouldRotateArrayOfFiveDigitsThreeTimes() {
		int[] inArray = new int[] { 3, 8, 9, 7, 6 };
		int kTimes = 3;

		int[] result = cyclicRotation.solution(inArray, kTimes);

		assertArrayEquals(new int[] { 9, 7, 6, 3, 8 }, result);
	}
	
	@Test
	public void shouldRotateArrayOfFiveDigitsZeroTimes() {
		int[] inArray = new int[] { 3, 8, 9, 7, 6 };
		int kTimes = 0;

		int[] result = cyclicRotation.solution(inArray, kTimes);

		assertArrayEquals(new int[] { 3, 8, 9, 7, 6  }, result);
	}
	
	@Test
	public void shouldRotateArrayOfFiveDigitsFiveTimes() {
		int[] inArray = new int[] { 3, 8, 9, 7, 6 };
		int kTimes = 5;

		int[] result = cyclicRotation.solution(inArray, kTimes);

		assertArrayEquals(new int[] { 3, 8, 9, 7, 6  }, result);
	}
	
	@Test
	public void shouldRotateArrayOfFiveDigitsSevenTimes() {
		int[] inArray = new int[] { 3, 8, 9, 7, 6 };
		int kTimes = 7;

		int[] result = cyclicRotation.solution(inArray, kTimes);

		assertArrayEquals(new int[] { 7, 6, 3, 8, 9  }, result);
	}
	
	@Test
	public void shouldRotateArrayOfFiveDigitsSeventyTimes() {
		int[] inArray = new int[] { 3, 8, 9, 7, 6 };
		int kTimes = 70;

		int[] result = cyclicRotation.solution(inArray, kTimes);

		assertArrayEquals(new int[] { 3, 8, 9, 7, 6  }, result);
	}

	@Test
	public void shouldRotateArrayOfSingleDigit() {
		int[] inArray = new int[] { 4 };
		int kTimes = 3;

		int[] result = cyclicRotation.solution(inArray, kTimes);

		assertArrayEquals(new int[] { 4 }, result);
	}
	
	@Test
	public void shouldnotRotateEmptyArray() {
		int[] inArray = new int[] {  };
		int kTimes = 3;

		int[] result = cyclicRotation.solution(inArray, kTimes);

		assertArrayEquals(new int[] { }, result);
	}
	
	
	@Test
	public void shouldRotateArrayOf89Digits() {
		int [] inArray = new int[] {-866, 108, 614, 598, -439, 818, 768, -874, -905, 626, 984, -173, -959, 792, -801, -895, -504, 342, 368, -296, 462, -794
				, 297, -864, 999, 760, -439, 37, 243, 246, 463, -820, -225, 41, 615, 682, 879, 419, 879, -126, -933, -919, -792, -801, -589, 481, -800, 594
				, 189, -174, 652, 102, -769, -582, -238, 692, 484, 44, 254, -382, 782, -532, 488, -399, -854, -523, -825, -230, 413, 672, -662, -741, 570
				, 370, -376, 807, 229, 438, -595, 839, -739, -539, -936, 837, 463, -756, 297, 269, 709, -577, -688, -199, 14, -349, 370, -925, 656, 708, 347
				, -35, -359, -227, 607, -135, 525, -996, 865, 315, -985, 671, 491, 96, 507, 76, 159, 718, -681, -289, 677, 237, 226, 261, 411, 246, -406, 371
				, -223, 978, -561, -640, 937, 555, -486, -464, -905, 607, -304, -823, -185, -259, -378, 202, 438, -497, 131, 132, 32, 421, 111, 755, -546
				, -255, -133, -275, -215, 645, -440, 864, 136, -993, 421, -75, 260, 343, -97, 141, 517, -146, 425, -804, -865, -453, -736, -57, -520, -473, -557
				, -825, 586, -360, 563, -418, 131, 861, -22, 68, 632, -859, 806, 638, 772, -328, 12, 159, 452, -994, 882, 504, 386, -141, 140, 798, 925, 971, 180
				, 795, 125, -8, -122, 773, 42, 947};

		int kTimes = 2;
		int[] result = cyclicRotation.solution(inArray, kTimes);

		assertArrayEquals(new int[] { 42, 947, -866, 108, 614, 598, -439, 818, 768, -874, -905, 626, 984, -173, -959, 792, -801, -895, -504, 342, 368, -296, 462, -794
				, 297, -864, 999, 760, -439, 37, 243, 246, 463, -820, -225, 41, 615, 682, 879, 419, 879, -126, -933, -919, -792, -801, -589, 481, -800, 594
				, 189, -174, 652, 102, -769, -582, -238, 692, 484, 44, 254, -382, 782, -532, 488, -399, -854, -523, -825, -230, 413, 672, -662, -741, 570
				, 370, -376, 807, 229, 438, -595, 839, -739, -539, -936, 837, 463, -756, 297, 269, 709, -577, -688, -199, 14, -349, 370, -925, 656, 708, 347
				, -35, -359, -227, 607, -135, 525, -996, 865, 315, -985, 671, 491, 96, 507, 76, 159, 718, -681, -289, 677, 237, 226, 261, 411, 246, -406, 371
				, -223, 978, -561, -640, 937, 555, -486, -464, -905, 607, -304, -823, -185, -259, -378, 202, 438, -497, 131, 132, 32, 421, 111, 755, -546
				, -255, -133, -275, -215, 645, -440, 864, 136, -993, 421, -75, 260, 343, -97, 141, 517, -146, 425, -804, -865, -453, -736, -57, -520, -473, -557
				, -825, 586, -360, 563, -418, 131, 861, -22, 68, 632, -859, 806, 638, 772, -328, 12, 159, 452, -994, 882, 504, 386, -141, 140, 798, 925, 971, 180
				, 795, 125, -8, -122, 773 }, result);
	}
	
}
