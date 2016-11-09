package hemuppgift1_B2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CoinSimulator {
	
	public int u, k, c, currentCoins, numberOfThrows, mean, n;
	public double variance, deviation, width;
	public double lambda;
	int[] bins;
	public ArrayList<Integer> data;
	
	public CoinSimulator(int u, int k, int c){
		this.u = u;
		this.k = k;
		this.c = c;
		lambda = 3.66;
		data = new ArrayList<Integer>();
		
	}
	
	public int calculateMean(){
		bins = new int[(int) Math.pow(2,u)];
		currentCoins = 0;
		numberOfThrows = 0;
		
		
		Random rand = new Random();
		int currentBin;
		//System.out.print(rand.nextInt(bins.length));
				
		while(currentCoins < c){
			
			currentBin = rand.nextInt(bins.length);
			bins[currentBin]++;
			if(bins[currentBin]==k){
				currentCoins++;
			}
			numberOfThrows++;		
		}
		data.add(numberOfThrows);
		return numberOfThrows;
	}
	
	public double calculateCIWidth(){
		mean = 0;
		n = data.size();
		for(int i=0; i<n; i++){
			mean += data.get(i);
		}
		mean = mean/n;
		System.out.println("mean throws: "+mean);
		for(int i: data){
			variance += ((i-mean)*(i-mean));
		}
			
			variance = variance/data.size();
			deviation = Math.sqrt(variance);
		return 2 * lambda * (deviation/Math.sqrt(n));
	}
	
	public int calculateVariance(int mean, int n){
		return ((numberOfThrows-mean)*(numberOfThrows-mean))/n;
	}
	//Debug purposes
	public void visualizeArray(){
		System.out.println(Arrays.toString(bins));		
	}
	
}
