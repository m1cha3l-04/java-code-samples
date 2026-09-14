
// the program will print mirror inverted mirroed right triangle
// s s * * * * * * * * 
// s s s * * * * * * * 
// s s s s * * * * * * 
// s s s s s * * * * * 
// s s s s s s * * * * 
// s s s s s s s * * * 
// s s s s s s s s * * 
// s s s s s s s s s * 

public class Sample4 {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i <= num; i++){
            for (int s = 1; s <= i-1; s++){
                System.out.print("s ");
            }
            for (int j = num; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
