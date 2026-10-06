package Lv4;

import java.util.HashMap;

/*
target에서 연결되어 나올 수 있는지 확인, 안되면 다른 키
 */
public class StrangeKeymap {
    class Solution {
        static public int[] solution(String[] keymap, String[] targets) {
            int[] answer = new int[targets.length];
            HashMap<Character, Integer> hashMap = new HashMap<>();
            for (String key : keymap) {
                for (int i = 0; i < key.length(); i++) {
                    char c = key.charAt(i);
                    int count = i + 1;
                    hashMap.computeIfAbsent(c, k->count);
                    hashMap.put(c,Math.min(hashMap.get(c),count));
                }
            }
            for(int j = 0; j < targets.length; j++){
                for(int i=0; i<targets[j].length(); i++){
                    char c = targets[j].charAt(i);
                    if(!hashMap.containsKey(c)){
                        answer[j] = -1;
                        break;
                    }
                    else{
                        answer[j] += hashMap.get(c);
                    }
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD", "AABB"};

        System.out.println(Solution.solution(keymap, targets));
    }
}
