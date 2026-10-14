package Lv4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static Lv4.PrivacyCollectTerms.Solution.solution;

public class PrivacyCollectTerms {
    class Solution {
        static public int[] solution(String today, String[] terms, String[] privacies) {
            //모든 달은 28일까지 있다고 가정
            String[] date = today.split("\\.");
            int year = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            int day = Integer.parseInt(date[2]);
            int totaldays = (year * 12 * 28) + (month * 28) + day;

            HashMap<Character, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < terms.length; i++) {
                String[] termP = terms[i].split(" ");
                char key = terms[i].charAt(0);
                int value = Integer.parseInt(termP[1]);
                hashMap.put(key, value);
            }
            List<Integer> answerList = new ArrayList<>();

            for (int i = 0; i < privacies.length; i++){
                String[] arr = privacies[i].split(" ");
                String[] privacyDate = arr[0].split("\\.");
                int privacyYear = Integer.parseInt(privacyDate[0]);
                int privacyMonth = Integer.parseInt(privacyDate[1]);
                int privacyDay = Integer.parseInt(privacyDate[2]);
                char alphabet = arr[1].charAt(0);

                int termMonth = hashMap.get(alphabet);
                privacyMonth += termMonth;
                if(privacyMonth>12){
                    privacyYear += privacyMonth/12;
                    privacyMonth = privacyMonth%12;
                }
                if (privacyMonth == 0) {
                    privacyYear -= 1;
                    privacyMonth = 12;
                }
                privacyDay -= 1;
                if (privacyDay == 0) {
                    privacyDay = 28;
                    privacyMonth -= 1;
                    if (privacyMonth == 0) {
                        privacyYear -= 1;
                        privacyMonth = 12;
                    }
                }
                int expireTotalDays = (privacyYear * 12 * 28) + (privacyMonth * 28) + privacyDay;
                if (totaldays > expireTotalDays) {
                    answerList.add(i + 1); // 인덱스는 1부터 시작하므로 +1
                }

            }
            return answerList.stream().mapToInt(Integer::intValue).toArray();        }
    }

    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(solution(today, terms, privacies));


    }
}
