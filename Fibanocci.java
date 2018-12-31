public class Fibanocci{
	public static void main(String args[]){
		int i=1,n=10,t1=0,t2=1,t3;
			System.out.println("First"+ n +"terms");
		while(i<=n){
			System.out.println(t1 +" ");
			t3=t1+t2;
			t1=t2;
			t2=t3;
			
			i++;
		}
	}
}