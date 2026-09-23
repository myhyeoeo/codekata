package Lv3;

import java.util.ArrayList;

import static Lv3.makePrimeNum.Solution.solution;

public class makePrimeNum {
    class Solution{
        static public int solution(int[] nums){
            //짝짝홀 홀홀홀
            int answer = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0; i<nums.length-2; i++){
                for(int j=i+1; j<nums.length-1; j++){
                    for(int k=j+1; k<nums.length; k++){
                        int sum = nums[i]+nums[j]+nums[k];
                        if(sum%2==1||sum==2){
                            boolean isPrime = true;
                            for(int q=2; q*q<=sum; q++){
                                if(sum%q==0){
                                    isPrime = false;
                                    break;
                                }
                            }
                            if(isPrime) answer++;
                        }
                    }
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,7,6,4};
        System.out.println(solution(arr));
    }
}
