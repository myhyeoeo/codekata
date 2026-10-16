package Lv4;

import static Lv4.ParkWalking.Solution.solution;

public class ParkWalking {
    class Solution {
        static public int[] solution(String[] park, String[] routes) {
            int h = park.length;
            int w = park[0].length();
            int start_x = 0;
            int start_y = 0;
            for (int i = 0; i < park.length; i++) {
                for (int j = 0; j < park[i].length(); j++) {
                    if (park[i].charAt(j) == 'S') {
                        start_x = j;
                        start_y = i;
                    }
                }
            }
            for (int i = 0; i < routes.length; i++) {
                char way = routes[i].charAt(0);
                int to = routes[i].charAt(2) - '0';
                int nx = start_x;
                int ny = start_y;
                boolean isPossible = true;
                for (int j = 0; j < to; j++) {
                    switch (way) {
                        case 'E':
                            nx++;
                            break;
                        case 'W':
                            nx--;
                            break;
                        case 'S':
                            ny++;
                            break;
                        case 'N':
                            ny--;
                            break;
                    }
                    if (nx < 0 || ny < 0 || nx >= w || ny >= h || park[ny].charAt(nx) == 'X') {
                        isPossible = false;
                        break;
                    }
                }
                if (isPossible) {
                    start_x = nx;
                    start_y = ny;
                }

            }
//            System.out.println(start_x+" "+start_y);
            return new int[]{start_y, start_x};
        }
    }

    public static void main(String[] args) {
        String[] park = {"SOO", "OOO", "OOO"};
        String[] routes = {"E 2", "S 2", "W 1"};
        //result = {2,1};
        System.out.println(solution(park,routes));
    }
}
