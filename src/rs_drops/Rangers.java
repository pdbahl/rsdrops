package rs_drops;

import java.util.Arrays;
import java.util.Random;


public class Rangers {

    public static void main(String[] args) {

        Long startTime = System.currentTimeMillis();
        int counter = 0;
        int min = 1000000;
        int max = 0;
        int accounts = 1000000;
        Long sumdrops = 0L;
        int randnum;
        int uniques[] = { 0, 0, 0 };
        Random rand = new Random();
        for (int i = 0; i < accounts; i++) { //accounts
            while (uniques[0]<1) { //clues
                randnum = rand.nextInt((5-3)+1)+3;
                for(int j = 0;j<randnum;j++){
                    randnum = rand.nextInt(1034);
                    if(randnum==1033){
                        uniques[0]+=1;
                    }
                    if(randnum==1032){
                        uniques[1]+=1;
                    }
                    if(randnum==1031){
                        uniques[2]+=1;
                    }
                    //System.out.println(randnum);
                }

                counter++;

            }
            if (counter > max) {
                System.out.println(Arrays.toString(uniques) + " in " + counter + " clues");
                max = counter;
            }
            if (counter < min) {
                min = counter;
            }
            //System.out.println(counter);
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
