package Lv3;

import static Lv3.babbling.Solution.solution;

public class babbling {
    class Solution{
        static public int solution(String[] babbling){
            int answer = 0;
            String[] can = {"aya","ye","woo","ma"};
            String[] cant = {"ayaaya", "yeye", "woowoo", "mama"};
            //연속 사용 x,
            for(String a : babbling){
                boolean isInvalid = false;
                for (String b : cant) {
                    if (a.contains(b)) {
                        isInvalid = true;
                        break;
                    }
                }
                if (isInvalid) continue;

                for (String b : can) {
                    a = a.replace(b," ");
                }
                if (a.trim().isEmpty()) {
                    answer++;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        String[] arr = {"aya","yee","u","maa"};
        System.out.println(solution(arr));
    }
}
