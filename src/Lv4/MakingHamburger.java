package Lv4;

import java.util.ArrayList;

public class MakingHamburger {
    class Solution {
        static public int solution(int[] ingredient) {
            //빵-야채-고기-빵
            ArrayList<Integer> arr = new ArrayList<>();
            for (int a : ingredient) {
                arr.add(a);
            }
            int count = 0;
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) == 1) {
                    if (i + 1 < arr.size() && arr.get(i + 1) == 2) {
                        if (i + 2 < arr.size() && arr.get(i + 2) == 3) {
                            if (i + 3 < arr.size() && arr.get(i + 3) == 1) {
                                count++;
                                for (int k = 0; k < 4; k++) {
                                    arr.remove(i);
                                }
                                i = Math.max(-1, i - 4);
                            }
                        }
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(Solution.solution(ingredient));
    }
}
