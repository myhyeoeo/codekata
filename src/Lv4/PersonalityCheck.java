package Lv4;

import java.util.HashMap;

import static Lv4.PersonalityCheck.Solution.solution;

public class PersonalityCheck {
    class Solution {
        static public String solution(String[] survey, int[] choices) {
            HashMap<Character, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < survey.length; i++) {
                char key1 = survey[i].charAt(0);
                char key2 = survey[i].charAt(1);
                switch (choices[i]){
                    case 1:
                        hashMap.put(key1, hashMap.getOrDefault(key1, 0) + 3);
                        break;
                    case 2:
                        hashMap.put(key1, hashMap.getOrDefault(key1, 0) + 2);
                        break;
                    case 3:
                        hashMap.put(key1, hashMap.getOrDefault(key1, 0) + 1);
                        break;
                    case 5:
                        hashMap.put(key2, hashMap.getOrDefault(key2, 0) + 1);
                        break;
                    case 6:
                        hashMap.put(key2, hashMap.getOrDefault(key2, 0) + 2);
                        break;
                    case 7:
                        hashMap.put(key2, hashMap.getOrDefault(key2, 0) + 3);
                        break;
                }
            }
            StringBuilder sb = new StringBuilder();

            if (hashMap.getOrDefault('R', 0) >= hashMap.getOrDefault('T', 0)) {
                sb.append('R');
            } else {
                sb.append('T');
            }

            if (hashMap.getOrDefault('C', 0) >= hashMap.getOrDefault('F', 0)) {
                sb.append('C');
            } else {
                sb.append('F');
            }

            if (hashMap.getOrDefault('J', 0) >= hashMap.getOrDefault('M', 0)) {
                sb.append('J');
            } else {
                sb.append('M');
            }

            if (hashMap.getOrDefault('A', 0) >= hashMap.getOrDefault('N', 0)) {
                sb.append('A');
            } else {
                sb.append('N');
            }

            return sb.toString();
        }
    }

    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choice = {5, 3, 2, 7, 5};
        System.out.println(solution(survey,choice));
    }
}
