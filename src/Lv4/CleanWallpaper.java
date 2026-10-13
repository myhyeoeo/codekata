package Lv4;

public class CleanWallpaper {
    class Solution {
        static public int[] solution(String[] wallpaper) {
            // 시작점
            int lux = 9999;
            int luy = 9999;
            // 끝점
            int rdx = 0;
            int rdy = 0;

            for (int i = 0; i < wallpaper.length; i++) {
                for (int j = 0; j < wallpaper[i].length(); j++) {
                    if (wallpaper[i].charAt(j) == '#') {
                        if (lux > j) {
                            lux = j;
                        }
                        if (luy > i) {
                            luy = i;
                        }
                        if(rdx < j){
                            rdx = j;
                        }
                        if(rdy < i){
                            rdy = i;
                        }
                    }
                }
            }

//            System.out.println("lux : " + lux + " luy : " + luy + " rdx : "+ rdx + " rdy : "+rdy);

            int[] arr = {luy, lux, rdy+1, rdx+1};
//            for(int a : arr){
//                System.out.println(a);
//            }
            return arr;
        }
    }

    public static void main(String[] args) {
//        String[] wallpaper = {".#...", "..#..", "...#."};
//        String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        String[] wallpaper = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        System.out.println(Solution.solution(wallpaper));//0,1,3,4
    }
}
