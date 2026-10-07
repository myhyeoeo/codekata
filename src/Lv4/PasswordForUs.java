package Lv4;

import java.util.*;

import static Lv4.PasswordForUs.Solution.solution;

public class PasswordForUs {
    class Solution {
        static public String solution(String s, String skip, int index) {
            StringBuilder sb = new StringBuilder();
            char[] arr = new char[s.length()];
            //1.문자열 s의 각 알파벳을 index만큼 뒤의 알파벳으로 바꾼다
            for (int i = 0; i < s.length(); i++) {
                char a = s.charAt(i);
                for (int j = 0; j < index; j++) {
                    a++;
                    //2. 바뀐 알파벳이 z를 초과하면 a로 돌아간다
                    if (a > 'z') {
                        a = 'a';
                    }
                    //3. skip에 있는 알파벳은 제외하고 건너뛴다
                    while (skip.indexOf(a) != -1) {
                        a++;
                        if (a > 'z') {
                            a = 'a';
                        }
                    }

                }

                sb.append(a);
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("a", "bc", 2));
    }
}
