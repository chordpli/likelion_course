package week3.day5.mdis;

public class PopulationMove {

    private int fromSido;
    private int toSido;

    // constructor 추가 fromSido, toSido를 받아서 멤버 변수에 넣는 기능
    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }


}
