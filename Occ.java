public class occ{
	static int countOccurences(int arr[],int n,int x){
		int res=0;
		for(int i=0;i<n;i++){
		if(x==arr[i])
		res++;
		return res;
		
	}
	public static void main(String args[]){
		int arr[]={1,2,2,3,6,6,9,9};
		int n=arr.length;
		int x=2;
		System.out.println(countOccurences(arr,n,x));
	}

}

