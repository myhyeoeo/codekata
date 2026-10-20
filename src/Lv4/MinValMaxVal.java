package Lv4;

import java.util.ArrayList;
import java.util.Collections;

public class MinValMaxVal {
    class Solution {
        static public String solution(String s) {
            String[] arr = s.split(" ");
            ArrayList<Integer> num = new ArrayList<>();
            for(int i=0; i<arr.length; i++){
                num.add(Integer.parseInt(arr[i]));
            }
            Collections.sort(num);
            int min = num.get(0);
            int max = num.get(num.size()-1);
            StringBuilder sb = new StringBuilder();
            sb.append(min);sb.append(" ");sb.append(max);
            return sb.toString();
        }
    }

    public static void main(String[] args) {

    }
}
