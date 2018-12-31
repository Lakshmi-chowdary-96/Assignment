


public class Program21
{
     static int smallestNo(int num)
    {
        int[] frequency=new int[10];
        while(num>0)
        {
            int lastDigit=num%10;
            frequency[lastDigit]++;
            num=num/10;
        }
        int result=0;
        for(int i=1;i<=9;i++)
        {
            if(frequency[i]!=0) {
                result=i;
                frequency[i]--;
                break;
            }
        }
        for(int i=0;i<=9;i++)
        {
            while(frequency[i]--!=0)
            {
                result=result*10+i;
            }
        }
        return result;
    }
     static int largestNo(int num)
    {
            int[] freq=new int[10];
            String str=Integer.toString(num);
            for(int i=0;i<str.length();i++)
            {
                freq[str.charAt(i)-'0']++;
            }
            int result=0,mul=1;
            for(int i=0;i<=9;i++)
            {
                while(freq[i]>0)
                {
                    result=result+(i*mul);
                    freq[i]--;
                    mul=mul*10;
                }
            }
            return result;
    }   
    public static void main(String[] args) 
    {
        int num=45402230;
        System.out.println("Smallest number : "+smallestNo(num));
        System.out.println("Largest number : "+largestNo(num));

    }
}
