public class Pattern{
    public void pattern1(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern2(){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern3(){
        for(int i=1;i<=5;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern4(){
        for(int i=1;i<=5;i++){
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] aa){
        Pattern p = new Pattern();
        p.pattern1();
        System.out.println();
        p.pattern2();
        System.out.println();
        p.pattern3();
        System.out.println();
        p.pattern4();
    }
}