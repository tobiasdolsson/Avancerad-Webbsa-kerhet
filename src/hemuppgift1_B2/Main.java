package hemuppgift1_B2;

public class Main {
	
	public static void main(String[] args){
		int test = 0;
		int deviation = 0;

		int nbrtests = 10000;
		double lambda = 3.66;
		
		//Om man nollställer cs i calculateMean behöver man inte skapa tusen objekt lol men orkar inte ändra
		
		for(int i=0; i<nbrtests; i++){

		
		
		//Om man nollställer cs i calculateMean behöver man inte skapa tusen objekt lol men orkar inte ändra
		
		

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
