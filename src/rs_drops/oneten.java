package rs_drops;


import java.util.HashMap;
import java.util.Map;


public class oneten {

	public static void main(String[] args) {
		Long startTime = System.currentTimeMillis();
		Long randnum;
		
		Map<Long, Long> map = new HashMap<Long,Long>();
		for(int i = 0;i<100000000;i++) {
			
			randnum = (long) (Math.random()*10)+1;
			if (!map.containsKey(randnum)) {  // first time we've seen this string
			      map.put(randnum, (long) 1);
			    }
			    else {
			      Long count = map.get(randnum);
			      map.put(randnum, count + 1);
			    }
			  }
		map.forEach((key,value) -> System.out.println(key + " : " + value));
		System.out.println("Took " + (System.currentTimeMillis() - startTime)+ "ms.");
	}

}
