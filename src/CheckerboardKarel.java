/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run() {

	    while (frontIsBlocked()) {
	        turnLeft();
        }
        while (frontIsClear()) {

            putBeepersInOneRow();
            changeLine();
        }



    }

    private void putBeepersInOneRow() {
        putBeeper();
        while(frontIsClear()) {

            move();
            if (frontIsClear()) {
                move();
                putBeeper();
            }

        }

    }

    private void changeLine() {

	    if (facingEast()) {
            turnLeft();
            if (frontIsClear()) {
                move();
                turnLeft();
            }

        } else {
            turnRight();
            if (frontIsClear()) {
                move();
                turnRight();
            }
        }

    }




}
