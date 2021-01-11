/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class MidpointFinderKarel extends SuperKarel {
	
	public void run() {

	    for (int i = 1; i < 100; i++) {
	        move();
	        if (frontIsBlocked()) {
	            turnAround();
	            for (int j = 1; j <= i/2; j++) {
	                move();
	            }
	            putBeeper();
	            if (i%2==1) {
	                move();
	                putBeeper();
	            }
	            break;
	        }
	    }

    }

}
