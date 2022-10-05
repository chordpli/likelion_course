package week3.day3.theater;

public class Theater {
    private Lola lola;

    public Theater(Lola lola) {
        this.lola = lola;
    }

    public void stageOpening(){
        System.out.println("킹키부츠 오프닝을 시작합니다!");
        System.out.println(lola.hello());
    }

    public void stageEnding(){
        System.out.println("킹키부츠 엔딩을 시작합니다!");
        System.out.println(lola.bye());
    }
}
