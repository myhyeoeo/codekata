package Lv4;

import java.util.HashMap;

import static Lv4.splitString.Solution.solution;

public class splitString {
    class Solution {
        static public int solution(String s) {
            int answer = 0;
            int countX = 0; // X가 나온 횟수
            int countY = 0; // 다른 수들이 나온 횟수
            char x = ' ';
            for (int i = 0; i < s.length(); i++) {
                if(countX == 0){
                    x = s.charAt(i);
                    countX++;
                } else if (countX > 0) {
                    if(s.charAt(i) == x){
                        countX++;
                    }
                    else {
                        countY++;
                    }
                    if(countX == countY){
                        answer++;
                        countX = 0;
                        countY = 0;
                    }
                }
            }
            if (countX != 0) {
                answer++;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        String s1 = "banana";
        String s3 = "aaabbaccccabba";
        System.out.println(solution(s3));
    }
}
