package hemuppgift1_B2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CoinSimulator {
	
	public int u, k, c, currentCoins, numberOfThrows;
	int[] bins;
	
	public CoinSimulator(int u, int k, int c){
		this.u = u;
		this.k = k;
		this.c = c;
		
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

		return numberOfThrows;
	}
	
	public int calculateVariance(int mean, int n){
		return ((numberOfThrows-mean)*(numberOfThrows-mean))/n;
	}
	//Debug purposes
	public void visualizeArray(){
		System.out.println(Arrays.toString(bins));		
	}
	
}
