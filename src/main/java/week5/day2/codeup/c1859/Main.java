package week5.day2.codeup.c1859;

public class Main {

    public void printARow(int n, String now) {
        if (n == now.length()) {
            return;
        }else{
            System.out.print("*");
            System.out.println();
        }
        printARow(n-1, now);
    }
/*    public void recursiveStar(int n, int depth, String result){
        if(result.length() == depth){
            return;
        }else{
            if (result.length()+1 == n) {
                result;
                System.out.print("*");
                System.out.println();
                recursiveStar(0, depth+1, result);
            }
            System.out.print("*");
            recursiveStar(n +1, depth, result);
        }
    }*/
    public static void main(String[] args) {
        Main main = new Main();
        main.printARow(5,"");
    }
}
