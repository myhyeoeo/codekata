package Lv4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static Lv4.RunningRace.Solution.solution;

public class RunningRace {
    class Solution {
        static public String[] solution(String[] players, String[] callings) {
        //players 현재 등수 , callings 추월 호명
            HashMap<String, Integer> hashMap = new HashMap<>();
            for(int i=0; i<players.length; i++){
                hashMap.put(players[i],i);
            }
            for(String calledplayer : callings){
                int rank = hashMap.get(calledplayer);
                int front = rank - 1;
                String frontPlayer = players[front];
                players[rank] = frontPlayer;
                players[front] = calledplayer;
                hashMap.put(calledplayer,front);
                hashMap.put(frontPlayer,rank);
            }
            return players;
        }
    }

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        solution(players,callings);
    }
}
