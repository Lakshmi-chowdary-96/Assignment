public class Bonus{
    int bonus=0;
    String analyst,associate,consultant;
    public void Bonus(int exp,String des){
        if(des.equals("analyst")&&exp>0){
            if(exp>0&&exp<2)
                bonus=5000;
            else if(exp>2&&exp<5)
                    bonus=10000;
                else
                    bonus=15000;
        }
        if(des.equals("associate")&&exp>0){
            if(exp>0&&exp<2)
                bonus=7000;
            else if(exp>2&&exp<5)
                    bonus=12000;
                else
                    bonus=15000;
        }
        if(des.equals("consultant")&&exp>0){
            if(exp>0&&exp<2)
                bonus=10000;
            else if(exp>2&&exp<5)
                    bonus=15000;
                else
                    bonus=20000;
        }
        System.out.println("Employee with designation "+des+" and experience "+exp+" will get "+bonus+" Rs. of bonus");
    }
    
    public static void main(String [] str){
        Bonus bcal=new Bonus();
        bcal.Bonus(3,"analyst");
        bcal.Bonus(5,"associate");
        bcal.Bonus(4,"consultant");
        bcal.Bonus(9,"consultant");
    
    }
}




