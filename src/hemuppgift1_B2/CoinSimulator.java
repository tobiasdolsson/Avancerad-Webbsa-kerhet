package hemuppgift1_B2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CoinSimulator {

	private int u, k, c, currentCoins, numberOfThrows, n2;
	private double variance, deviation;
	private double lambda;
	private long longMean;
	int[] bins;
	private ArrayList<Integer> data;

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

		n2 = data.size();
		longMean = 0;
		for (int i = 0; i < n2; i++) {

			longMean = longMean + data.get(i);
		}

		longMean = longMean / n2;

		return longMean;
	}

	public double calculateCIWidth(double m) {
		variance = 0;
		deviation = 0;

		for (int i : data) {
			variance = variance + ((i - m) * (i - m));
		}

		variance = variance / data.size();
		deviation = Math.sqrt(variance);
		return 2 * lambda * deviation / Math.sqrt(data.size());
	}

	public void anounceMean() {
		System.out.println("Mean throws: " + longMean);
	}

	// Debug purposes
	public void visualizeArray() {
		System.out.println(Arrays.toString(bins));
	}

}
