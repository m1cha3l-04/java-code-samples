import java.util.Random;
public class SampleDemoRand {
    public static void main(String[] args) {
        Random rand = new Random();
        int randNum = rand.nextInt(100)+1;

        System.out.println(randNum);
    }
}
