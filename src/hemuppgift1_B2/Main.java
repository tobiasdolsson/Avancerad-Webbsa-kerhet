package hemuppgift1_B2;

public class Main {
	
	public static void main(String[] args){
		int test = 0;
		int deviation = 0;

		int nbrtests = 1000;
		double lambda = 3.66;
		
		
		for(int i=0; i<nbrtests; i++){


			CoinSimulator cs = new CoinSimulator(20,7,1);
			test += cs.calculateMean();
			//deviation += cs.calculateDeviation(322);
			//cs.visualizeArray();
			System.out.println(i);
		}
		

		System.out.println(test/nbrtests);


		//System.out.println(deviation/1000);		
		//System.out.println(cs.calculateMean());
		//cs.visualizeArray();
		
	}

}
