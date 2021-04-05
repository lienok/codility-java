package codilitysolutions.timecomplexity;

public class PermMissingElem {

	public int solution(int[] A) {
		//{} n = 0 	should contain [1..1]
        int sumA = this.sumArray(A);
        System.out.println(sumA);

        int sumAext = 0;
        System.out.println(A.length);
        for (int i = 1; i <= A.length+1; ++i) {
            sumAext += i;
        }
        System.out.println(sumAext);

        return sumAext - sumA;
    }

    int sumArray(int[] anyA) {
        int sum = 0;
        for (int value : anyA) {
            sum += value;
        }
        return sum;
    }
}
