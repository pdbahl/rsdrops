package rs_drops;

import java.util.Random;

public class Sire {

	public static void main(String[] args) {
		Long startTime = System.currentTimeMillis();
		int counter = 0;
		int min = 1000000;
		int max = 0;
		int accounts = 10000;
		Long sumdrops = 0L;
		int randnum;
		int bludg = 0;
		Random rand = new Random();
		for (int i = 0; i < accounts; i++) {
			while (bludg != 3) {
				randnum = rand.nextInt(100);
				if (randnum == 99) {
					randnum = rand.nextInt(128);
					if (randnum < 62 && randnum >= 0) {
						bludg++;
					}
				}
				counter++;
			}
			if (counter > max) {
				max = counter;
			}
			if (counter < min) {
				min = counter;
			}
			sumdrops+=counter;
			counter=0;
			bludg =0;
			
		}
		System.out.println("AVERAGE : " + (double)sumdrops/accounts);
		System.out.println("MAX : " + max);
		System.out.println("MIN : " + min);
		System.out.println("Took " + (System.currentTimeMillis() - startTime)+ "ms.");
	}

}
