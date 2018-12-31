public class ArmPalPrimeEO{
    public static void main(String [] str){
        int num=0,arm=0,pal=0,pri=0,eve=0,odd=0;
        int arr[]= new int[]{2332,898,153,370,371,407};
        
        for(int n=0; n<arr.length; n++){
            num=arr[n];
            //1 armstrong
            int pow=0,rem=0, res=1, num1=0;
            int temp1= num;
            while(temp1> 0){
                temp1/=10;
                pow++;
            }
            temp1= num;
            while(temp1> 0){
                rem= temp1%10;
                for(int i=0; i<pow; i++){
                res=res*rem;
            }
            num1+=res;
            res=1;
            temp1/=10;
            }
            if(num==num1)
                arm++;
            
            //2 palindrome
            int num2=0,r=0;
            int temp2=num;
        
            while(temp2>0){
                r= temp2%10;
                num2= (num2*10)+ r;
                temp2/= 10;
            }
            if(num2 == num)
                pal++;
            
            //3 prime
            int flag=0;
            for(int i=2; i<num/2; i++){
                if(num%i==0){
                    flag=1;
                    break;
                }
            }
            if (flag==0)
                pri++;
            
            //4,5 even,odd
            if(num%2==0)
                eve++;
            else
                odd++;
        }
        System.out.println("No. of armstrong numbers : "+arm);
        System.out.println("No. of palindrome numbers : "+pal);
        System.out.println("No. of prime numbers : "+pri);
        System.out.println("No. of even numbers : "+eve);
        System.out.println("No. of odd numbers : "+odd);
    }
}