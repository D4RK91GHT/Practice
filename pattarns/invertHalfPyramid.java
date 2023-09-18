public class invertHalfPyramid {
    public static void main(String[] args) {

        int n = 4;

        // first method 
        /*
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= i; j--
            ) {
                System.out.print("* ");
            }
            System.out.println();
        }
        */

        // second method 
        /*
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        */



        // Inverted Half Pyramid Roted By 180 Degree
        for (int i = 1; i <= n; i++) {
            // inner loop to print space 
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }






    }
}
