package hemuppgift1_B2;

public class Main {
	
	public static void main(String[] args){
		int test = 0;
		for(int i=0; i<1000; i++){
			CoinSimulator cs = new CoinSimulator(16,2,1);
			test += cs.calculateMean();
			
		}
		
		System.out.println(test/1000);
		System.out.println(322-(test/1000));
		
		
		
		
		//System.out.println(cs.calculateMean());
	
			//cs.visualizeArray();
		
		
	}

}
