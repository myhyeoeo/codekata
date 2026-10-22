package Lv4;

import java.util.ArrayList;

import static Lv4.BinaryChanges.Solution.solution;

public class BinaryChanges {
    class Solution {
        static public int[] solution(String s) {
            ArrayList<Integer> arr = new ArrayList<>();
            int totalRemovedZero = 0;
            int convert = 0;
            while (!s.equals("1")) {
                int removedZero = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) - 48 == 0) {
                        removedZero++;
                    }
                }
                totalRemovedZero += removedZero;
                int remainedLength = s.length() - removedZero;
                s = Integer.toBinaryString(remainedLength);
                convert++;
            }
            return new int[]{convert, totalRemovedZero};
        }
    }

    public static void main(String[] args) {
        String s = "110010101001";
        System.out.println(solution(s));
    }
}
