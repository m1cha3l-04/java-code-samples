// mirrored right triangle

// s s s s * 
// s s s * * 
// s s * * * 
// s * * * * 
// * * * * * 

public class Sample3{
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) // outer loop
            { 
            for (int s = 5; s >= i + 1; s--){
                System.out.print("s ");
            }    
            for (int j = 1; j <= i; j++) { // inner llop
                System.out.print("* ");
            }
            System.out.println(); // next row
        }
    }
}