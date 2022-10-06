package week3.day4.collection.map;

import java.util.HashMap;

public class MapExercise2 {
    public static void main(String[] args) {
        String repoAddr = "https://github.com/Qkite/java-excercise-01/tree/main/src".toLowerCase();
        // a ~ z
        HashMap<String, Integer> alphabetCnt = new HashMap<>();
        String alphabet;
        for(int i = 0; i<repoAddr.length(); i++){
            alphabet = String.valueOf(repoAddr.charAt(i));
            alphabetCnt.put(alphabet, alphabetCnt.getOrDefault(alphabet,0)+1);
        }

        System.out.println(alphabetCnt.get("t"));
    }
}
