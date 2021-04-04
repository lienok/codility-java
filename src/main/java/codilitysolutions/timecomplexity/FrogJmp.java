package codilitysolutions.timecomplexity;

public class FrogJmp {
	public int solution(int X, int Y, int D) {
		int distance = Y - X;

		if (distance == 0) {
			return 0;
		}

		int steps = distance / D;
		int minSteps = (distance % D) == 0 ? steps : steps + 1;

		return minSteps;

	}

}
// 44% https://app.codility.com/demo/results/trainingBD7TJ6-BJE/ 6minut
// 88% https://app.codility.com/demo/results/trainingZXF3UP-K5R/
// 100% https://app.codility.com/demo/results/trainingM8A4BM-WQW/
