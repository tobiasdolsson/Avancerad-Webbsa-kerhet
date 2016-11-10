package hemuppgift1_B2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CoinSimulator {

	public int u, k, c, currentCoins, numberOfThrows, n, n2;
	public BigInteger mean, bign, bigSize;
	public double variance, deviation, width;
	public double lambda;
	public long longMean;
	int[] bins;
	public ArrayList<Integer> data;

	public CoinSimulator(int u, int k, int c) {
		this.u = u;
		this.k = k;
		this.c = c;
		lambda = 3.66;
		data = new ArrayList<Integer>();

	}

	public int calculateThrows() {
		bins = new int[(int) Math.pow(2, u)];
		currentCoins = 0;
		numberOfThrows = 0;

		Random rand = new Random();
		int currentBin;

		while (currentCoins < c) {

			currentBin = rand.nextInt(bins.length);
			bins[currentBin]++;
			if (bins[currentBin] == k) {
				currentCoins++;
			}
			numberOfThrows++;
		}
		data.add(numberOfThrows);
		// System.out.println("number of throws: "+numberOfThrows);
		return numberOfThrows;
	}

	public double calculateMean() {
		/*
		 * mean = new BigInteger("0"); Integer size = new Integer(data.size());
		 * String sizeString = size.toString(); bigSize = new
		 * BigInteger(sizeString);
		 */
		n2 = data.size();
		longMean = 0;
		for (int i = 0; i < n2; i++) {
			// String dataValue = data.get(i).toString();
			// BigInteger value = new BigInteger(dataValue);
			// mean = mean.add(value);
			longMean = longMean + data.get(i);
		}
		// mean = mean.divide(bigSize);
		longMean = longMean / n2;
		// System.out.println(longMean);
		return longMean;
	}

	public double calculateCIWidth(double m) {
		variance = 0;
		deviation = 0;
		/*
		 * mean = new BigInteger("0"); Integer test = new Integer(data.size());
		 * String test2 = test.toString(); bign = new BigInteger(test2); n =
		 * data.size(); for (int i = 0; i < n; i++) { String datatest =
		 * data.get(i).toString(); BigInteger temp = new BigInteger(datatest);
		 * mean = mean.add(temp) ;
		 * 
		 * }
		 * 
		 * mean = mean.divide(bign);
		 */

		// System.out.println("mean throws: " + mean);
		for (int i : data) {
			variance = variance + ((i - m) * (i - m));
		}

		variance = variance / data.size();
		deviation = Math.sqrt(variance);
		return 2 * lambda * deviation / Math.sqrt(data.size());
	}

	public void anounceMean() {
		System.out.println("final mean throws: " + longMean);
	}

	// Debug purposes
	public void visualizeArray() {
		System.out.println(Arrays.toString(bins));
	}

}
