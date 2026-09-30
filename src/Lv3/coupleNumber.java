package Lv3;

import java.util.ArrayList;
import java.util.HashMap;

import static Lv3.coupleNumber.Solution.solution;

public class coupleNumber {
    class Solution{
        static public String solution(String x, String y){
            String answer = "";
            int[] countX = new int[10];
            int[] countY = new int[10];
            for(int i=0; i<x.length(); i++){
                countX[x.charAt(i)-'0']++;
            }
            for(int i=0; i<y.length(); i++){
                countY[y.charAt(i)-'0']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int i=9; i>=0; i--){
                int commonCount = Math.min(countX[i],countY[i]);
                for(int j=0; j<commonCount; j++){
                    sb.append(i);
                }
            }
            if(sb.length()==0)return "-1";
            if(sb.charAt(0)=='0')return "0";

            return sb.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("100","203045"));
    }
}
