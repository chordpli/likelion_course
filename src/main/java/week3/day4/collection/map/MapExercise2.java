package week3.day4.collection.map;

import java.util.HashMap;

public class MapExercise2 {
    public static void main(String[] args) {
        String repoAddr = "https://github.com/chordpli/likelion_course/tree/main/src/week3/day4/collection/set".toLowerCase();
        // a ~ z
        HashMap<String, Integer> alphabetCnt = new HashMap<>();
        String alphabet;
        for(int i = 0; i<repoAddr.length(); i++){
            alphabet = String.valueOf(repoAddr.charAt(i));
            for(char j = 'a'; j <= 'z'; j++){
                if(alphabet.equals(String.valueOf(j))){
                    alphabetCnt.put(alphabet, alphabetCnt.getOrDefault(alphabet,0)+1);
                    break;
                }
            }
        }

        System.out.println(alphabetCnt.get("_"));
    }
}
