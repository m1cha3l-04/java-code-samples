// inverted right triangle
// * * * * *
// * * * *
// * * *
// * *
// *

public class Sample2 {
    public static void main(String[] args) {

        for(int i = 5; i >= 1; i--){ //outer loop
            // System.out.print(i);
            for(int j = 1; j <= i; j++){ //inner loop
                System.out.print(" *");
            }
            System.out.println();
        }

        // System.out.println("hello");
    }
}
