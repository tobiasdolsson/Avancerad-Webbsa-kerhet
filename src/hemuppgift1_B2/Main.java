package hemuppgift1_B2;

public class Main {

	public static void main(String[] args) {

		int nbrOfTests = 0;
		int minIterations = 10;
		double currentCI = 0;
		int ci = 3000;

		CoinSimulator cs = new CoinSimulator(20, 7, 10000);
		final long startTime = System.currentTimeMillis();
		while (true) {

			cs.calculateThrows();
			nbrOfTests++;

			currentCI = cs.calculateCIWidth(cs.calculateMean());

			System.out.println("Current width: " + currentCI);
			// System.out.println("Number of iterations :" + nbrOfTests);
			if (currentCI != 0 && currentCI < ci && nbrOfTests > minIterations) {
				System.out.println("Number of iterations :" + nbrOfTests);
				break;
			}

		}

		System.out.println("c.i width: " + cs.calculateCIWidth(cs.calculateMean()));
		cs.anounceMean();
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime)/1000+"s" );

	}

}
