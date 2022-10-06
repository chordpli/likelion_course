package week3.day4.collection;

public class IsAlphabet {
    public static void main(String[] args) {
        IsAlphabet isAlphabet = new IsAlphabet();

        String str = "abcdefg1234";
        for(int i = 0; i < str.length(); i++){
            if(isAlphabet.isAlphabet(str.charAt(i))){
                System.out.print(str.charAt(i) + " ");
            }
        }
    }

    public boolean isAlphabet(char alphabet){
        boolean result = false;
        for(char c = 'a' ; c <= 'z' ; c++){
            if(alphabet == c){
                result = true;
            }
        }
        return result;
    }
}
