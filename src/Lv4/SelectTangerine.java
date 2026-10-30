package Lv4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SelectTangerine {
	class Solution {
		static public int solution(int k, int[] tangerine) {
			HashMap<Integer, Integer> hashMap = new HashMap<>();
			for (int a : tangerine) {
				hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
			}
			List<Integer> counts = new ArrayList<>(hashMap.values());
			counts.sort(Collections.reverseOrder());

			int answer = 0;
			for (int a : counts) {
				k -= a;
				answer++;
				if (k <= 0)
					break;
			}
			return answer;
		}
	}

	public static void main(String[] args) {
		int k = 6;
		int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3}; // 3
		int answer = Solution.solution(k,tangerine);
		System.out.println(answer);
	}
}
