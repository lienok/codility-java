package codilitysolutions;

import org.junit.Test;

public class UtilTest {

	@Test
	public void createRandomTest() {
		Util util = new Util();
		String array = util.getRandomIntArray(0, 100, -1000, 1000);
		System.out.println(array);
	}

}
