package codilitysolutions.arrays;

import java.util.*;

class OddOccurencesInArray {
	public int solution(int[] A) {
		int uniqueNum = 0;
		Map<Integer, Integer> nums = new HashMap<Integer, Integer>();

		for (int n : A) {
			if (nums.get(n) == null) {
				nums.put(n, 1);
			} else {
				int count = nums.get(n);
				nums.put(n, ++count);				
			}						
		}
		
		for(Integer n : nums.keySet()) {
			if (nums.get(n) % 2 != 0) {
				uniqueNum = n;
			}
		}
		

		return uniqueNum;
	}
}
//44% https://app.codility.com/demo/results/trainingNDCRVK-JAY/
//55% https://app.codility.com/demo/results/trainingDTEK99-ADS/
//100% https://app.codility.com/demo/results/trainingPK5FE9-328/