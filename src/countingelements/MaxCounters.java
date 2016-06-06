package countingelements;

public class MaxCounters {

	public static void main(String[] args) {

		int[] A = new int[7];

		A[0] = 3;
		A[1] = 4;
		A[2] = 4;
		A[3] = 6;
		A[4] = 1;
		A[5] = 4;
		A[6] = 4;

		int[] solution = solution(5, A);

		for (int i = 0; i < solution.length; i++) {
			int j = solution[i];

			System.out.println(j + ", ");
		}
	}

	public static int[] solution(int N, int[] A) {

		int currentMax = 0, max = 0, currentIndex;
		int[] result = new int[N];

		for (int i = 0; i < A.length; i++) {

			currentIndex = A[i] - 1;

			if (A[i] >= 1 && A[i] <= N ) {

				result[currentIndex] = Math.max(max, result[currentIndex]) + 1;
				currentMax = Math.max(currentMax, result[currentIndex]);

			} else if (A[i] == N + 1) {
				max = currentMax;
			}
		}

		for (int i = 0; i < result.length; i++) {
			result[i] = Math.max(result[i], max);
		}

		return result;
	}

	// 66%
	/*
	 * public static int[] solution(int N, int[] A) {
	 * 
	 * int[] result = new int[N]; int maxCounter = 0; boolean updateAll = false;
	 * 
	 * for (int i = 0; i < A.length; i++) {
	 * 
	 * for (int j = 0; j < result.length; j++) {
	 * 
	 * // if A[K] = N + 1 then operation K is max counter. if (A[i] == N + 1) {
	 * updateAll = true; break; } // if A[K] = X, such that 1 ≤ X ≤ N, then
	 * operation K is // increase(X), else if (A[i] == j + 1) {
	 * 
	 * result[j] = result[j] + 1;
	 * 
	 * // update max counter if (result[j] > maxCounter) { maxCounter =
	 * result[j]; }
	 * 
	 * break; } }
	 * 
	 * if (updateAll) { for (int j = 0; j < result.length; j++) { result[j] =
	 * maxCounter; } updateAll = false; } }
	 * 
	 * return result; }
	 */

}

/*
 * A non-empty zero-indexed array A of M integers is given. This array
 * represents consecutive operations:
 * 
 * if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X), if A[K] =
 * N + 1 then operation K is max counter. For example, given integer N = 5 and
 * array A such that:
 * 
 * A[0] = 3 A[1] = 4 A[2] = 4 A[3] = 6 A[4] = 1 A[5] = 4 A[6] = 4 the values of
 * the counters after each consecutive operation will be:
 * 
 * (0, 0, 1, 0, 0) (0, 0, 1, 1, 0) (0, 0, 1, 2, 0) (2, 2, 2, 2, 2) (3, 2, 2, 2,
 * 2) (3, 2, 2, 3, 2) (3, 2, 2, 4, 2) The goal is to calculate the value of
 * every counter after all operations.
 * 
 * Write a function:
 * 
 * class Solution { public int[] solution(int N, int[] A); }
 * 
 * that, given an integer N and a non-empty zero-indexed array A consisting of M
 * integers, returns a sequence of integers representing the values of the
 * counters.
 * 
 * The sequence should be returned as:
 * 
 * a structure Results (in C), or a vector of integers (in C++), or a record
 * Results (in Pascal), or an array of integers (in any other programming
 * language). For example, given:
 * 
 * A[0] = 3 A[1] = 4 A[2] = 4 A[3] = 6 A[4] = 1 A[5] = 4 A[6] = 4 the function
 * should return [3, 2, 2, 4, 2], as explained above.
 * 
 * Assume that:
 * 
 * N and M are integers within the range [1..100,000]; each element of array A
 * is an integer within the range [1..N + 1]. Complexity:
 * 
 * expected worst-case time complexity is O(N+M); expected worst-case space
 * complexity is O(N), beyond input storage (not counting the storage required
 * for input arguments). Elements of input arrays can be modified.
 * 
 * Copyright 2009–2016 by Codility Limited. All Rights Reserved. Unauthorized
 * copying, publication or disclosure prohibited.
 */
