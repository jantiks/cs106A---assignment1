/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {
	
	public void run() {
		pick();
		comeBack();
    }

    private void pick() {
		while(frontIsClear()) {
			move();
		}
		turnRight();
		while (leftIsBlocked()) {
			move();
		}
		turnLeft();
		move();
		pickBeeper();
		turnAround();
	}
	private void comeBack() {
		while(frontIsClear()) {
			move();
		}
		turnRight();
		while (frontIsClear()){
			move();
		}
		turnRight();
	}



}