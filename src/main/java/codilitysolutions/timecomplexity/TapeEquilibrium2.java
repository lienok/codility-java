package codilitysolutions.timecomplexity;

class TapeEquilibrium2 {
	 public int solution(int[] A) {
			int allSum = 0;
			int result = Integer.MAX_VALUE;
	        int firstSum = 0;
			
			for (int num : A) {
				allSum += num;
			}

			if (A.length == 1) {
				result = allSum;
			} else {
				for (int i = 1; i < A.length; i++) {
	                int secondSum = 0;

					firstSum += A[i - 1];
					secondSum = allSum - firstSum;

					int diff = Math.abs(secondSum - firstSum);
					result = diff < result ? diff : result;
				}
			}

			return result;
		}
}
//https://app.codility.com/demo/results/trainingU7YS5W-KPU/