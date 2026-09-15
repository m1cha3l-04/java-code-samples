public class Sample0 {
    public static void main(String[] args) {
        String program = "BSCS";
        
        int num = 1, num2 = 1;
        do {
            System.out.println("do while: " +program);
            num++;
        } while (num <= 5);

        System.out.println();

        while (num2 <= 5) {
            System.out.println("while: "+program);
            num2++;
            
        }
    }
}