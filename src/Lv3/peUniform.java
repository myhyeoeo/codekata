package Lv3;

public class peUniform {
    class Solution {
        static public int solution(int n, int[] lost, int[] reserve) {
            //reserve가 여벌 가진 애들의 +-1 빌려줄 수 있다, reserve도 뺏길 수 있다
            int answer = 0;
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] += 1;
            }
            for (int i = 0; i < reserve.length; i++) {
                arr[reserve[i] - 1] += 1;
            }
            for (int a : lost) {
                arr[a - 1] -= 1;
            }
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    if (arr[i] > 1 && arr[i + 1] < 1) {
                        arr[i] -= 1;
                        arr[i + 1] += 1;
                    }
                } else if (i == arr.length - 1) {
                    if (arr[i] > 1 && arr[i - 1] < 1) {
                        arr[i] -= 1;
                        arr[i - 1] += 1;
                    }
                } else {
                    if (arr[i] > 1 && arr[i - 1] < 1) {
                        arr[i] -= 1;
                        arr[i - 1] += 1;
                    }
                    if (arr[i] > 1 && arr[i + 1] < 1) {
                        arr[i] -= 1;
                        arr[i + 1] += 1;
                    }
                }
            }
            for (int a : arr) {
                if (a > 0) {
                    answer++;
                }
            }
//            for (int i = 0; i < arr.length; i++) {
//                System.out.println("arr[" + i + "] = " + arr[i]);
//            }

            return answer;
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int[] lost = {2};
        int[] reserve = {3};
        System.out.println(Solution.solution(n, lost, reserve));
    }
}
