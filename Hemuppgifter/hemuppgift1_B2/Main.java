package hemuppgift1_B2;

public class Main {
	
	public static void main(String[] args){
		int test = 0;
		int deviation = 0;
		
		//Om man nollställer cs i calculateMean behöver man inte skapa tusen objekt lol men orkar inte ändra
		
		for(int i=0; i<1000; i++){
			CoinSimulator cs = new CoinSimulator(16,2,1);
			test += cs.calculateMean();
			//deviation += cs.calculateDeviation(322);
			//cs.visualizeArray();
		}
		
		System.out.println(test/1000);
		System.out.println(322-(test/1000));
		//System.out.println(deviation/1000);		
		//System.out.println(cs.calculateMean());
		//cs.visualizeArray();
		
	}

}
