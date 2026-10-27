package Lv4;

import java.util.ArrayList;

public class PredictedTournament {
    class Solution
    {
        static public int solution(int n, int a, int b)
        {
            int answer = 0;
            while(a!=b){
                a = (a+1)/2;
                b = (b+1)/2;
                answer += 1;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        int N = 8;
        int A = 4;
        int B = 7; //3
        System.out.println(Solution.solution(N,A,B));
    }
}
