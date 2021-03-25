package codilitysolutions;

public class Util {

	public String getRandomIntArray(int lengthMin, int lengthMax, int minNum, int maxNum) {
		int lengthOfArray = getRandomNumber(lengthMin, lengthMax);

		int[] randomArray = new int[lengthOfArray];
		System.out.println(
				String.format("Array of length %s of numbers between <%s, %s>", lengthOfArray, minNum, maxNum));

		String finalArray = "{ ";
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = getRandomNumber(minNum, maxNum); // storing random integers in an array
			finalArray = finalArray.concat(String.valueOf(randomArray[i])).concat(", ");
		}

		finalArray = finalArray.substring(0, finalArray.length() - 1);
		return finalArray.concat("}");

	}

	public String getRandomIntArrayWithPairs(int lengthMin, int lengthMax, int minNum, int maxNum) {
		int lengthOfArray = getOddRandomNumber(lengthMin, lengthMax);
		// 5 = [ 2, 4, 4, 2 , 1 ]
		int[] randomArray = new int[lengthOfArray];
		System.out.println(
				String.format("Array of length %s of numbers between <%s, %s>", lengthOfArray, minNum, maxNum));

		int halfLength = lengthOfArray / 2;
//		System.out.println("halfLength " + halfLength);
		String finalArray = "{ ";
		for (int i = 0; i < halfLength; i++) {
			randomArray[i] = getRandomNumber(minNum, maxNum); // storing random integers in an array
//			System.out.println(" -i:" + i + "-A.added- " + randomArray[i]);
			finalArray = finalArray.concat(String.valueOf(randomArray[i])).concat(", ");
		}

		int j = 0;
		for (int i = halfLength; i < lengthOfArray - 1; i++, j++) {
			randomArray[i] = randomArray[j];
//			System.out.println(" -i:" + i + "-j:" + j + "-B.added- " + randomArray[i]);	
			finalArray = finalArray.concat(String.valueOf(randomArray[i])).concat(", ");
		}
		randomArray[lengthOfArray - 1] = maxNum + 1;
		finalArray = finalArray.concat(maxNum + 1 + "}");
		return finalArray;

	}

	public int getRandomNumber(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}

	public int getOddRandomNumber(int min, int max) {
		return getRandomNumber(min, max) * 2 + 1;
	}

}
