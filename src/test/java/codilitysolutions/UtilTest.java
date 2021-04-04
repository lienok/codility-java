package codilitysolutions;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Ignore;
import org.junit.Test;

public class UtilTest {

	@Ignore @Test
	public void createRandomIntArrayTest() {
		Util util = new Util();
		String array = util.getRandomIntArray(0, 100, -1000, 1000);
		System.out.println(array);
	}
	
	@Test
	public void createRandomIntArrayWithPairsTest() {
		Util util = new Util();
		String array = util.getRandomIntArrayWithPairs(1, 200, 1, 10000);
		System.out.println("\n"+array);
	}
	
	@Test
	public void reverseAB() {
		Util util = new Util();
		assertArrayEquals(util.reverseAB( new int[] { 7, 90 }), new int[] { 90, 7 });
		assertArrayEquals(util.reverseAB( new int[] { Integer.MAX_VALUE *2, Integer.MAX_VALUE * 2-1 }), new int[] { Integer.MAX_VALUE * 2-1, Integer.MAX_VALUE *2 });
		assertArrayEquals(util.reverseAB( new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE -1 }), new int[] { Integer.MAX_VALUE -1, Integer.MAX_VALUE });
		assertArrayEquals(util.reverseAB( new int[] { -7, 90 }), new int[] { 90, -7 });
		assertArrayEquals(util.reverseAB( new int[] { -7, -90 }), new int[] { -90, -7 });
	}


}
