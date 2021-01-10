/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	
	public void run() {
        while (frontIsClear()) {
            repairColumn();
            moveToNextColumn();
        }
        if (frontIsBlocked()) {
            repairColumn();
        }


    }


    private void repairColumn() {
        turnLeft();
        while (frontIsClear()) {
            replaceStones();
            move();

        }
        replaceStones();
        turnAround();
        while (frontIsClear()) {
            move();
        }
        turnLeft();
    }

    private void moveToNextColumn() {
	    for (int i = 0; i<4; i++) {
	        move();
        }
    }

    private void replaceStones() {
	    if (beepersPresent()) {

        } else {
	        putBeeper();

        }
    }

}
