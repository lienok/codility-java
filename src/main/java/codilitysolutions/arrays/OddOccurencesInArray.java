package codilitysolutions.arrays;

import java.util.*;

class OddOccurencesInArray {
	public int solution(int[] A) {

		int uniqueNum = 0;
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(A[0]);
		uniqueNum = A[0];

		for (int n : A) {
			if (nums.contains(n)) {

			} else {
				nums.add(n);
				uniqueNum = n;
			}

		}

		return uniqueNum;
	}
}
// 44% https://app.codility.com/demo/results/trainingNDCRVK-JAY/