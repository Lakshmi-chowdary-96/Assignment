public class Quadratic {

    public static void main(String[] args) {

        double a = 2.3, b = 4, c = 5.6;
        double r1, r2;

        double determinant = b * b - 4 * a * c;

        
        if(determinant > 0) {
            r1 = (-b + Math.sqrt(determinant)) / (2 * a);
            r2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.format("r1 = %.2f and r2 = %.2f", r1 , r2);
        }
        
        else if(determinant == 0) {
            r1 = r2 = -b / (2 * a);

            System.out.format("r1 = r2 = %.2f;", r1);
        }
       
        else {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);

            System.out.format("r1 = %.2f+%.2fi and r2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
        }
    }
}