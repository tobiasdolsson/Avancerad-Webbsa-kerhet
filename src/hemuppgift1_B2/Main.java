package hemuppgift1_B2;

public class Main {
	
	public static void main(String[] args){
		int test = 0;
		int variance = 0;
		int expectedMean = 322;
		int nbrtests = 3000;
		double deviation = 0;
		double lambda = 3.66;
		int temp = 0;
		CoinSimulator cs = new CoinSimulator(16,2,1);
		
		for(int i=0; i<nbrtests; i++){
			temp = cs.calculateMean();
			test += temp;
			variance += (((temp-expectedMean)*(temp-expectedMean))/nbrtests);
			//deviation += cs.calculateDeviation(322);
			//cs.visualizeArray();
			System.out.println(i);
		}
	
		deviation = Math.sqrt(variance);
		System.out.println("throws: "+test/nbrtests);
		System.out.println("variance: "+variance);
		System.out.println("deviation "+deviation);
		System.out.println("c.i width: "+ 2*lambda*(deviation/Math.sqrt(nbrtests)));
		//cs.visualizeArray();
		}

}
