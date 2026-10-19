package Lv4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ReportResult {
    class Solution {
        static public int[] solution(String[] id_list, String[] report, int k) {
            Set<String> uniqueReports = new HashSet<>(Arrays.asList(report));
            HashMap<String, Integer> reportHashmap = new HashMap<>();
            HashMap<String, HashSet<String>> userReportMap = new HashMap<>();
            for (int i = 0; i < id_list.length; i++) {
                reportHashmap.put(id_list[i], 0);
                userReportMap.put(id_list[i], new HashSet<>());
            }
            for (String rep : uniqueReports) {
                String[] arr = rep.split(" ");
                String reportUser = arr[0];
                String reportedUser = arr[1];
                reportHashmap.put(reportedUser, reportHashmap.getOrDefault(reportedUser, 0) + 1);
                userReportMap.get(reportUser).add(reportedUser);
            }

            Set<String> suspendedUsers = new HashSet<>();
            for (String id : id_list) {
                if (reportHashmap.get(id) >= k) {
                    suspendedUsers.add(id);
                }
            }
            int[] answer = new int[id_list.length];
            for (int i = 0; i < id_list.length; i++) {
                String userId = id_list[i];
                int mailCount = 0;

                HashSet<String> myReportedList = userReportMap.get(userId);
                for (String reportedUser : myReportedList) {
                    if (suspendedUsers.contains(reportedUser)) {
                        mailCount++;
                    }
                }
                answer[i] = mailCount;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        //[2,1,1,0]
        System.out.println(Solution.solution(id_list, report, k));
    }
}
