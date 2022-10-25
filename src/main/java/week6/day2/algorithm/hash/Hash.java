package week6.day2.algorithm.hash;

public class Hash {
    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            int ascii = c;
            System.out.printf("%s %d \n", c, ascii);
            asciiSum += ascii;
        }
        System.out.println("asciiSum : " + asciiSum);
        return asciiSum % 90;
    }

    public static void main(String[] args) {
        Hash hash = new Hash();
        hash.hash("junho");
    }
}
