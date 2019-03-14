package rs_drops;

import java.util.Random;

public class Shaman {

	public static void main(String[] args) {
		long randnum = 0;
		int accounts = 1000;
		int dwhcounter = 0;
		int sumdrops =0;
		int min = 1000000;
		int max = 0;
		Random rand = new Random();
		for (int i = 0; i < accounts; i++) {
			while (randnum != 4999) {
				randnum = rand.nextInt(5000);
				//System.out.println(randnum);
				if (randnum == 4999) {
					System.out.println("DWH DWH DWH DWH");
				}
				dwhcounter++;
				//System.out.println(randnum);
			}
			if(dwhcounter <10) {System.out.println("lessthan10");}
			if(dwhcounter>max) {max =dwhcounter;}
			if(dwhcounter<min) {min = dwhcounter;}
			randnum=0;
			//System.out.println(dwhcounter);
			sumdrops+=dwhcounter;
			dwhcounter = 0;
		}
		System.out.println("AVERAGE: " + (double)sumdrops/accounts);
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);

	}

}
