import java.util.*;

class PairOfDice {

    static int dice1, dice2;
    static int min=1;
    static int max=6;

    static void setFirstValue(int d1) {
        dice1 = d1;
    }

    static void setSecondValue(int d2) {
        dice2 = d2;
    }

    static int getFirstValue() {
        return dice1;
    }

    static int getSecondValue() {
        return dice2;
    }

    static void rollDice() {
        int d1 = (int) ((Math.random() * ((max - min) + 1)) + min);
        int d2 = (int)((Math.random() * ((max - min) + 1)) + min);

        setFirstValue(d1);
        setSecondValue(d2);

    }

    int sumDice() {
        rollDice();
        
        return getFirstValue() + getSecondValue();
    }
}