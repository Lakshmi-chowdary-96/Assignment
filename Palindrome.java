class Palindrome{
	public static void main(String args[]){
		int n=123;r,s=0,t;
		t=n;
		while(n>0){
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
		if(t==s){
		    System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome"
		}
		
		
	}
}