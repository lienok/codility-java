package codilitysolutions;

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


}
