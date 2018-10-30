
public class PowerSet {
	
	

	public static void main(String[] args) {
		String arr[]={"1","2","3"};
		int powerSetSize=(int) Math.pow(2,arr.length);
		
		getPowerSet(arr,powerSetSize);
		
		
		
		//{},{1},{2},{3},{1,2},{1,3},{2,3},{1,2,3}

	}

	private static void getPowerSet(String[] arr, int powerSetSize) {
		for(int i=0;i<powerSetSize;i++){
			System.out.print("{");
			for(int j=0;j<arr.length;j++){
				if((i &(1<<j))>0){
					System.out.print(arr[j]);
				}				
			}
			System.out.print("}");
			System.out.println();
			
		}		
	}

}
