package hemuppgift1_B2;

public class Main {

	public static void main(String[] args) {

		int nbrOfTests = 0;
		int minIterations = 10;
		double currentCI;
		int ci = 24;

		CoinSimulator cs = new CoinSimulator(16, 2, 100);

		while (true) {

			cs.calculateMean();
			currentCI = cs.calculateCIWidth();
			nbrOfTests++;
			//System.out.println("Current width: "+currentCI);			
			//System.out.println("Number of iterations :" + nbrOfTests);
			if (currentCI != 0 && currentCI < ci && nbrOfTests > minIterations) {
				System.out.println("Number of iterations :" + nbrOfTests);
				break;
			}

		}

		System.out.println("c.i width: " + cs.calculateCIWidth());
		cs.anounceMean();

	}

}
