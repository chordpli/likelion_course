package week4.day3.hospital;

public class Main {
    public static void main(String[] args) {
        String str =  "서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)";
        if(str.contains("서울")){
            System.out.println("서울");
        }
            
        String output = str.substring(0,str.indexOf("구")+1);
        System.out.println(output);
    }
}
