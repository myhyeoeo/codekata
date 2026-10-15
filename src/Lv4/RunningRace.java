package Lv4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Lv4.RunningRace.Solution.solution;

public class RunningRace {
    class Solution {
        static public String[] solution(String[] players, String[] callings) {
        //players 현재 등수 , callings 추월 호명
            List<String> arr = new ArrayList<>();
            for(int i=0; i<players.length; i++){
                arr.add(players[i]);
            }
            for(String calledPlayer : callings){
                for(int i=0; i<arr.size(); i++){
                    if(arr.get(i).equals(calledPlayer)){
                        Collections.swap(arr,i,i-1);
                    }
                }
            }
            return arr.toArray(new String[0]);
        }
    }

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        solution(players,callings);
    }
}
