public class HcfAndLcm{
public static void main(String[] args){
	 int num1=10,num2=20,neu,deno,hcf,lcm,t;
	 if(num1>num2){
		neu=num1;
		deno=num2;
		}
	 else{
	 neu=num2;
	 deno=num1;
	 }
	 while(deno!=0){
	 t=deno;
	 deno=neu%deno;
	 neu=t;
	      }
	 hcf=neu;
	 lcm=(num1*num2)/hcf;
	 
	 System.out.println(hcf);
	 System.out.println(lcm);
	 }
}
