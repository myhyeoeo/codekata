package Lv4;

import static Lv4.LeastCommonMultiple.Solution.*;

public class LeastCommonMultiple {
	class Solution {
		static public int solution(int[] arr) {
			if (arr.length == 1)
				return arr[0];
			int g = gcd(arr[0], arr[1]);
			int num = (arr[0] * arr[1]) / g;
			if (arr.length > 2) {
				for (int i = 2; i < arr.length; i++) {
					g = gcd(num, arr[i]);
					num = (num * arr[i]) / g;
				}
			}
			return num;
		}

		static private int gcd(int a, int b) {
			int r = a % b;
			if (r == 0)
				return b;
			else
				return gcd(b, r);
		}

	}

	public static void main(String[] args) {
		int[] arr = {2, 6, 8, 14};
		System.out.println(solution(arr));
	}
}
