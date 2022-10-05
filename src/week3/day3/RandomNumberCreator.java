package week3.day3;

public class RandomNumberCreator implements NumberCreator{
    @Override
    public int randomNumberCreator() {
        return (int)(Math.random()*9);
    }
}
