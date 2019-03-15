package rs_drops;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Cerb {
	public static void main(String[] args){

        Long startTime = System.currentTimeMillis();
        int counter = 0;
        int min = 1000000;
        int max = 0;
        int accounts = 100000;
        Long sumdrops = 0L;
        int randnum;
        int uniques[] = {
                0,
                0,
                0
                };
        Random rand = new Random();
        for (int i = 0; i < accounts; i++) {
            while (IntStream.of(uniques).anyMatch(x -> x == 0)) {
                randnum = rand.nextInt(128);
                if(randnum==127){
                    randnum= rand.nextInt(4);
                        if(randnum>=0 &&randnum<3 ){
                            uniques[randnum]+=1;
                    }
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
