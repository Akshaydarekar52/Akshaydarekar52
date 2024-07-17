public class Halfpyramid {
    public static void main(String[] args) {
        System.out.println("");
        int n = 4;

        // outer loop 
        for(int i=1; i<=n; i++) {
            // inner loop 
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
