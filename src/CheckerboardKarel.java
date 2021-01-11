/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	int row = 0;
	public void run() {

        while (frontIsClear() || row == 0) {

            putBeepersInOneRow();
            changeLine();
        }

        row = 0;

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

	    if (row%2==0) {
            turnLeft();
            if (frontIsClear()) {
                move();
                turnLeft();
            }

            row++;
        } else {
            turnRight();
            if (frontIsClear()) {
                move();
                turnRight();
            }
            row++;
        }

    }




}
