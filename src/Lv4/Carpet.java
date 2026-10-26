package Lv4;

public class Carpet {
    class Solution {
        static public int[] solution(int brown, int yellow) {
            int S = brown + yellow;
            int[] answer =  new int[2];

            for(int i=S-1; i>0; i--){
                if(S%i!=0) continue;
                int height = S/i;
                int y = (i-2) * (height-2);
                int b = S - y;
                if (y == yellow && b == brown) {
                    answer[0] = i;
                    answer[1] = height;
                    break;
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2; // [4,3]
    }
}
