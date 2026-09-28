package Lv3;

public class lotto {
    class Solution {
        static public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = {};
            int count = 0;
            int zeroCount = 0;
            int[] arr = new int[2];
            for(int i=0; i<lottos.length; i++){
                if(lottos[i] == 0) zeroCount++;
                for(int num : win_nums){
                    if (num == lottos[i]){
                        count ++;
                        System.out.println("i = "+i+", count = "+count);
                    }
                }
            }
            arr[0] = zeroCount+count;
            arr[1] = count;


            for(int i=0; i<arr.length; i++){
                switch (arr[i]){
                    case 2 :
                        arr[i] = 5;
                        break;
                    case 3 :
                        arr[i] = 4;
                        break;
                    case 4 :
                        arr[i] = 3;
                        break;
                    case 5 :
                        arr[i] = 2;
                        break;
                    case 6:
                        arr[i] = 1;
                        break;
                    default:
                        arr[i] = 6;
                        break;
                }
            }

            return arr;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {44,1,0,0,31,25,};
        int[] arr2 = {31,10,45,1,6,19};
        Solution.solution(arr1,arr2);
    }
}
