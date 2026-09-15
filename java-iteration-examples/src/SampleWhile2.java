public class SampleWhile2 {
    public static void main(String[] args) {
        int num = 5, sum = 0, val = 1;

        do {
            sum += val;
            val++;
        } while (val <= num);

        System.out.println(sum);

    }
}
