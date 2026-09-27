package Lv3;

import static Lv3.weaponOfWarriro.Solution.solution;

public class weaponOfWarriro {
    class Solution {
        static public int solution(int number, int limit, int power) {
            int answer = 0;

            int[] arr = new int[number];
            for(int i=1; i<=number; i++){
                int count = 0;
                for(int j=i; j>=1; j--){
//                    System.out.println("j="+j);
                    if(i % j==0){
                        count++;
                    }
//                    System.out.println(i+" : "+count);
                }
                arr[i-1] = count;
            }


            for(int i=0; i<arr.length; i++){
                if(arr[i]>limit){
                    arr[i] = power;
                }
                answer+=arr[i];
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(10,3,2));
    }
}
