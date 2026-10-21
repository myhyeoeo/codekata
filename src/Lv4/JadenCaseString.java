package Lv4;

import static Lv4.JadenCaseString.Solution.solution;

public class JadenCaseString {
    class Solution {
        static public String solution(String s) {
            String[] arr = s.split(" ",-1);
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < arr.length; i++) {
                String word = arr[i];

                if (word.length() > 0) {
                    char c = word.charAt(0);
                    if (c >= 'a' && c <= 'z') {
                        sb.append((char) (c - 32));
                    } else {
                        sb.append(c);
                    }

                    for (int j = 1; j < word.length(); j++) {
                        char nextC = word.charAt(j);
                        if (nextC >= 'A' && nextC <= 'Z') {
                            sb.append((char) (nextC + 32));
                        } else {
                            sb.append(nextC);
                        }
                    }
                }

                if (i < arr.length - 1) {
                    sb.append(" ");
                }
            }

            return sb.toString();
        }
    }

    public static void main(String[] args) {
        String s = "3people unFollowed me";
        System.out.println(solution(s));
    }
}
