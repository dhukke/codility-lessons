package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CyclicRotation {

	public static void main(String[] args) {

		int[] A = { 3, 8, 9, 7, 6 };
		
		int[] solution = solution(A, 3);
		
		String solutionString = "{";
		String separator = "";
		for (int i = 0; i < solution.length; i++) {
			solutionString += separator + solution[i];
			separator = " ,";
		}
		solutionString += "}";
		
		System.out.println(solutionString);
	}

	public static int[] solution(int[] A, int K) {

		if (A.length > 0) {

			List<Integer> asList = Arrays.stream(A).boxed().collect(Collectors.toList());

			for (int i = 0; i < K; i++) {
				int remove = asList.remove(asList.size() - 1);
				asList.add(0, remove);
			}

			int[] ret = new int[asList.size()];

			for (int i = 0; i < ret.length; i++) {
				ret[i] = asList.get(i).intValue();
			}

			return ret;
		}

		return A;
	}
}

/*A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is also moved to the first place.

For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate array A K times; that is, each element of A will be shifted to the right by K indexes.

Write a function:

class Solution { public int[] solution(int[] A, int K); }

that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].

Assume that:

N and K are integers within the range [0..100];
each element of array A is an integer within the range [−1,000..1,000].
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.

Copyright 2009–2016 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.*/