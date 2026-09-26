package Lv3;

import static Lv3.overColoring.Solution.solution;

public class overColoring {
    class Solution{
        static public int solution(int n, int m, int[] section){
            //벽 길이 : n / 롤러 길이 : m / 벗겨진 구역 section[]
            int answer = 0;
            int start = 0;
            int end = 0;

            System.out.println(start+" "+end);

            for(int i=0; i<section.length; i++){
                if(section[i]>end){
                    answer++;
                    start = section[i];
                    end = start + m - 1;
                }

            }

            return answer;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int m = 4;
        int[] section = {1,4};
//        System.out.println(section[-1]);
        System.out.println(solution(n,m,section));
    }
}
