package rs_drops;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Barrows {

	public static void main(String[] args) {
		int[] sets = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		Random rand = new Random();
		int accounts = 10000000;
		int roll;
		int drop;
		int counter = 0;
		int sumfin = 0;
		int max = 0;
		int min = 1000000;
		for (int i = 0; i < accounts; i++) {
			while (IntStream.of(sets).anyMatch(x -> x == 0)) {

				roll = rand.nextInt(172);
				drop = rand.nextInt(24);
				if (roll >= 0 && roll < 10) {
					sets[drop] += 1;
				}
				counter++;
				// System.out.println(Arrays.toString(sets));
			}
			if (counter > max) {
				System.out.println(Arrays.toString(sets) + " in " + counter + " kills");
				max = counter;
			}
			if (counter < min) {
				min = counter;
			}
			sumfin += counter;
			/*
			 * if (counter >= 500) {
				System.out.println(Arrays.toString(sets) + " in " + counter + " kills");
			}
			*/
			counter = 0;
			Arrays.fill(sets, 0);

		}
		System.out.println("Average: " + (double) sumfin / accounts);
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);

	}

}
