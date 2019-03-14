package rs_drops;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Corp {
    public static void main(String[] args){

        Long startTime = System.currentTimeMillis();
        int counter = 0;
        int min = 1000000;
        int max = 0;
        int accounts = 100000;
        Long sumdrops = 0L;
        int randnum;
        int uniques[] = {
                0, //ely
                0, // spectral
                0, //arcane
                0, //blessed
                0, //onyx
                0   //holy
                };
        Random rand = new Random();
        for (int i = 0; i < accounts; i++) {
            while (IntStream.of(uniques).anyMatch(x -> x == 0)) {
                randnum = rand.nextInt(585);
                if (randnum == 584) {
                    randnum = rand.nextInt(7);
                    if(randnum==1){
                        uniques[0]+=1;
                    }
                    if(randnum>=2 && randnum <=4){
                        uniques[1]+=1;
                    }
                    if(randnum>=5){
                        uniques[2]+=1;
                    }

                }else if(randnum >=0 && randnum <10){
                    uniques[3]+=1;
                }else if(randnum <= 33 && randnum >=10){
                    uniques[4]+=1;
                }else if(randnum>33 && randnum <=36){
                    uniques[5]+=1;
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
