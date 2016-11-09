package hemuppgift1_B2;

public class Main {
	
	public static void main(String[] args){
	
		int nbrtests = 200;
		
		CoinSimulator cs = new CoinSimulator(20,7,1);
		
		for(int i=0; i<nbrtests; i++){
			cs.calculateMean();
			System.out.println(i);
		}
		System.out.println("c.i width: "+cs.calculateCIWidth());
		}

}
