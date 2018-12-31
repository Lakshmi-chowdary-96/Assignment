public class Binary{
	public static void main(String args[]){
		int array[]={10,40,50,70,80};
		int size=array.length;
		int low=0;
		int high=size-1;
		int value=70;
		int mid=0;
		mid=low+(high-low)/2;
		
		while(low<high){
			if(array[mid]==value){
			 System.out.println("mid");
			 break;
			 }
			
			else if(array[mid]<value)
			low=mid+1;
			
			else high=mid-1;
			
			
		}
		mid=(low+high)/2;
		}
}