package history;

import logic.DiceRoller;

public class Race {
    private int raceInt;
    private final String raceName;

    public Race() {
        raceName = this.getRace();
    }

    private String getRace() {
        final int i = DiceRoller.d66();

        if (i < 23) {
            this.raceInt = 0;
            return "Erlenländer (Mensch)";
        } else if (i < 32) {
            this.raceInt = 1;
            return "Aslene (Mensch)";
        } else if (i < 35) {
            this.raceInt = 2;
            return "Ailander (Mensch)";
        } else if (i < 42) {
            this.raceInt = 3;
            return "Halbelf";
        } else if (i < 45) {
            this.raceInt = 4;
            return "Halbling";
        } else if (i < 53) {
            this.raceInt = 5;
            return "Goblin";
        } else if (i < 61) {
            this.raceInt = 6;
            return "Ork";
        } else if (i < 63) {
            this.raceInt = 7;
            return "Wolfsmensch";
        } else if (i < 65) {
            this.raceInt = 8;
            return "Zwerg";
        } else if (i <= 66) {
            this.raceInt = 9;
            return "Elf";
        } else {
            return "Fehler";
        }
    }

    public int getRaceInt() {
        return raceInt;
    }

    public String getRaceName() {
        return raceName;
    }
}
