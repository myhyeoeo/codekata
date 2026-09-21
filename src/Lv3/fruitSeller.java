package Lv3;

import java.util.Arrays;

public class fruitSeller {
    static public int solution(int k, int m, int[] score){
        //k가 점수 높을수록좋음, 한상자에 m개씩, score는 각 과일 품질
        //가장 낮은점수 * 개수 로 최대 이익만들기
        int answer = 0;
        Arrays.sort(score);
        for(int i=score.length-m; i>=0; i-=m){
            answer+=score[i] * m;
//            System.out.println(score[i]);
        }
//        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] score = {1,2,3,1,2,3,1};
        solution(3,4,score);
    }
}
