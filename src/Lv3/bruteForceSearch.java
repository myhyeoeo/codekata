package Lv3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bruteForceSearch {
    class Solution{
        static public int[] solution(int[] answers){
            int[] answer = new int[3];
            int[] p1 = {1,2,3,4,5};
            int[] p2 = {2,1,2,3,2,4,2,5};
            int[] p3 = {3,3,1,1,2,2,4,4,5,5};

            for(int i=0; i<answers.length; i++){
                if(answers[i] == p1[i%p1.length]){
                    answer[0]++;
                }
                if(answers[i] == p2[i%p2.length]){
                    answer[1]++;
                }
                if(answers[i] == p3[i%p3.length]){
                    answer[2]++;
                }
            }
            int max = Math.max(answer[0],(Math.max(answer[1],answer[2])));

            List<Integer> list = new ArrayList<>();
            for(int i=0; i<3; i++){
                if(max == answer[i]){
                    list.add(i+1);
                }
            }
            int[] arr = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                arr[i] = list.get(i);
            }

            return arr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,4,2};
        System.out.println(Arrays.toString(Solution.solution(arr)));
    }
}
