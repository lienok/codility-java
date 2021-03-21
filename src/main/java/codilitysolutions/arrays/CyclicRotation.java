package codilitysolutions.arrays;

class CyclicRotation {
	public int[] solution(int[] A, int K) {
		int[] result = new int [A.length];

		if (A.length == 0) {
			return result;
		}
		int rest = K % A.length;
		
		int newPosition = rest;
		
		for (int i = 0; i < A.length; i++) {
			if (newPosition > A.length - 1) {
				newPosition = 0;
			}
			result[newPosition] = A[i];
			newPosition++;
		}

		return result;
	}
}
//87% https://app.codility.com/demo/results/trainingW2CKXJ-65U/
//100% https://app.codility.com/demo/results/training3GP53Q-2PN/
