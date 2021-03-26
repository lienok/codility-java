package codilitysolutions.arrays;

class OddOccurencesInArray {
	public int solution(int[] A) {
//			[4, 2, 1, 1, 2]
//		[1, 2, 4, 1, 2]
		int uniqueNum = A[0];
		Integer[] help = new Integer[1000000];

		for (int n : A) {
			if (help[n] == null) {
				help[n] = 1;
			} else {
				help[n] = 2;
			}
		}
		
		for (int n = 0; n < help.length; n++) {
			if (help[n] != null && help[n] == 1) {
				uniqueNum = n;
			}
		}

		return uniqueNum;
	}
}
//44% https://app.codility.com/demo/results/trainingNDCRVK-JAY/
//55% https://app.codility.com/demo/results/trainingDTEK99-ADS/