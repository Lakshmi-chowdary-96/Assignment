public class Main{
		public static void main(String args[]){
			int i,count=0;
			for(i=1;i<=10;i++){
				count=1;
				while(count<=10){
					if(i*count<10){
						System.out.print(i*count+"  ");
					}
					else
						System.out.print(i*count+" ");
						count++;
				} 
					System.out.println(" ");
			}	
		}
}



