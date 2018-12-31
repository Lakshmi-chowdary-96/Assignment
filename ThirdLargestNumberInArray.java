public class ThirdLargestNumberInArray{
	public static void main(String args[]){
		int temp,size;
		int array[]={20,68,32,90,67};
		size=array.length;
		for(int i=0;i<size;i++){
		for(int j=i+1;j<size;j++){
		if(array[i]>array[j])
		{
		temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		}
		}
		}
		System.out.println("Third largest number is :"+array[size-3]);
	}
	
}

