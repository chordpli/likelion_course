package week3.day4.codeup.c3108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());   // 입력 데이터의 갯수

        String input, command, studentName;
        int studentCode;
        Map<Integer, String> studentMap = new LinkedHashMap<>();

        StringTokenizer st;
        for(int i = 0 ; i < n; i++){
            input = br.readLine();
            st = new StringTokenizer(input);
            command = st.nextToken();
            studentCode = Integer.parseInt(st.nextToken());
            studentName = st.nextToken();

            if(command.equals("I")){
                studentMap.put(studentCode, studentName);
            }else if(command.equals("D")){
                studentMap.remove(studentCode);
            }
        }

        String idx = br.readLine();
        st = new StringTokenizer(idx);
        while(st.hasMoreTokens()){
            String value = (new ArrayList<String>(studentMap.values())).get(Integer.parseInt(st.nextToken()));
            System.out.println();
        }


        br.close();
    }
}
