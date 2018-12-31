public class DectoBinPalindrome {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
       int num=566,index=0,i;
       int a[]=new int[100];
       while(num>0)
       {
           a[index]=num%2;
           num=num/2;
           index++;
       }
       String binary="";
       for(i=index-1;i>=0;i--)
       {
           System.out.print(a[i]);
           binary+=a[i];
       }
       int binaryNum=Integer.parseInt(binary);
       int pal=binaryNum,result=0;
       while(binaryNum>0)
       {
           result=result*10+binaryNum%10;
           binaryNum=binaryNum/10;
       }
       if(result==pal)
           System.out.println(" is Palindrome");
           else
              System.out.println(" is Not palindrome"); 
         
    }
}


