class Linear{
	public static void main(String args[]){
	int array[]={10,3,90,45,67};
	int size=array.length;
	int num=45;
	for(int i=0;i<size-1;i++){
		if(array[i]==num){
			System.out.println("number found at"+i);
			}
			else{
				System.out.println("number not found");
			}
		}
	}
	
}
