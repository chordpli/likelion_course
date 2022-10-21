package week3.day3.theater;

public class Main {
    public static void main(String[] args) {
        Lola lola = new JaeRim();
        Theater kinkyBoots = new Theater(lola);
        kinkyBoots.stageOpening();
        kinkyBoots.stageEnding();

        lola = new HongSeok();
        kinkyBoots = new Theater(lola);
        kinkyBoots.stageOpening();
        kinkyBoots.stageEnding();
    }
}
