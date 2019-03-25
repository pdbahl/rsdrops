package rs_drops;

import java.util.Arrays;
import java.util.Random;


public class Kraken {

	public static void main(String[] args) {

		Long startTime = System.currentTimeMillis();
		int counter = 0;
		int min = 1000000;
		int max = 0;
		int accounts = 100000;
		Long sumdrops = 0L;
		int randnum;
		int uniques[] = { 0, 0 };
		Random rand = new Random();
		for (int i = 0; i < accounts; i++) {
			while (uniques[0]!=10) {
				randnum = rand.nextInt(5120);
				if(randnum <= 16 && randnum >=0) {
					uniques[0]++;
				}
				if(randnum >16 && randnum <=26) {
					uniques[1]++;
				}
				counter++;

			}
			if (counter > max) {
				System.out.println(Arrays.toString(uniques) + " in " + counter + " kills");
				max = counter;
			}
			if (counter < min) {
				min = counter;
			}
			sumdrops += counter;

			counter = 0;
			Arrays.fill(uniques, 0);

		}

		System.out.println("AVERAGE : " + (double) sumdrops / accounts);
		System.out.println("MAX : " + max);
		System.out.println("MIN : " + min);
		System.out.println("Took " + (System.currentTimeMillis() - startTime) + "ms.");

	}

}
