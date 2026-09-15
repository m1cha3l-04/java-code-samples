import java.util.Scanner;
public class SampleWhile3 {
    public static void main(String[] args) {
        int num = 0;
        String name, ans;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a your name: ");
            name = input.next();

            System.out.print("Do you want to continue? (yes/no): ");
            ans = input.next();

            if (ans.equals("no")) {
                System.out.println("Exiting... !!");
                break;
            }
            //num++;
        }
    }
}
