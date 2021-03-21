package codilitysolutions;

public class Util {
	
	public String getRandomIntArray(int lengthMin, int lengthMax, int minNum, int maxNum) {
		int lengthOfArray = getRandomNumber(lengthMin, lengthMax);
		
		int[] randomArray = new int[lengthOfArray];
		System.out.println(String.format("Array of length %s of numbers between <%s, %s>", lengthOfArray, minNum, maxNum) );
		
		String finalArray = "{ ";
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = getRandomNumber(minNum, maxNum); // storing random integers in an array
			finalArray = finalArray.concat(String.valueOf(randomArray[i])).concat(", ");
		}
		
		finalArray = finalArray.substring(0, finalArray.length() - 1);
		return finalArray.concat("}");

	}
	
	public int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}

}
