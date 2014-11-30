package moh.sample.SampleThreads;

import java.util.Random;

public class EmailTask implements Runnable {

	public void run() {
		
		Random rn = new Random();
		int r = 50 + rn.nextInt(150); 
		try {
			Thread.sleep(r);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

	

}
