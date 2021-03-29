package history;

import logic.DiceRoller;

public class Homeregion {
    private final String[] [] heimatregion = new String[10][6];
    private final String homeregion;

    public Homeregion(final int raceNumber) {
        this.generateHomeregionArray();
        homeregion = this.heimatregion[raceNumber][DiceRoller.d6(1)-1];

    }

    private void generateHomeregionArray() {
        //Erländer
        this.heimatregion[0] [0] = "Am Rande des Arinawaldes";
        this.heimatregion[0] [1] = "Die Ebenen von Moldena";
        this.heimatregion[0] [2] = "Die Ebenen von Moldena";
        this.heimatregion[0] [3] = "Die Ufer vom Varda-See";
        this.heimatregion[0] [4] = "Die Felder von Margelda";
        this.heimatregion[0] [5] = "Die Harga-Wüste";
        //Aslene
        this.heimatregion[1] [0] = "Die Felder von Margelda";
        this.heimatregion[1] [1] = "Die Felder von Margelda";
        this.heimatregion[1] [2] = "Die Yendra-Steppe";
        this.heimatregion[1] [3] = "Die Yendra-Steppe";
        this.heimatregion[1] [4] = "Die Ebenen von Moldena";
        this.heimatregion[1] [5] = "Die Finsternis des Leichentuchs";
        //Ailander
        this.heimatregion[2] [0] = "Die Felder von Margelda";
        this.heimatregion[2] [1] = "Die Küste der Zornbucht";
        this.heimatregion[2] [2] = "Die Ebenen von Moldena";
        this.heimatregion[2] [3] = "Die Ebenen von Moldena";
        this.heimatregion[2] [4] = "Das Grasland von Vivend";
        this.heimatregion[2] [5] = "Das Ufer des Varda-Sees";
        //Halbelf
        this.heimatregion[3] [0] = "Die Felder von Margelda";
        this.heimatregion[3] [1] = "Die Ebenen von Moldena";
        this.heimatregion[3] [2] = "Das Grasland von Vivend";
        this.heimatregion[3] [3] = "Am Rande des Fennwaldes";
        this.heimatregion[3] [4] = "Am Rande des Arinawaldes";
        this.heimatregion[3] [5] = "Die Harga-Wüste";
        //Halbling
        this.heimatregion[4] [0] = "Die Auen von Belifar";
        this.heimatregion[4] [1] = "Die Auen von Belifar";
        this.heimatregion[4] [2] = "Die Auen von Belifar";
        this.heimatregion[4] [3] = "Die Auen von Belifar";
        this.heimatregion[4] [4] = "Die Felder von Margelda";
        this.heimatregion[4] [5] = "Die Ebenen von Moldena";
        //Goblin
        this.heimatregion[5] [0] = "Im Schatten der Reißzahnwälder";
        this.heimatregion[5] [1] = "Im Schatten der Reißzahnwälder";
        this.heimatregion[5] [2] = "Im Schatten der Reißzahnwälder";
        this.heimatregion[5] [3] = "Die Haine des Leichentuchs";
        this.heimatregion[5] [4] = "Die Haine des Leichentuchs";
        this.heimatregion[5] [5] = "Tief in den Hainwäldern";
        //Ork
        this.heimatregion[6] [0] = "Tief in den Hainwäldern";
        this.heimatregion[6] [1] = "Tief in den Hainwäldern";
        this.heimatregion[6] [2] = "In den Tiefen des Arinawaldes";
        this.heimatregion[6] [3] = "In den Tiefen des Arinawaldes";
        this.heimatregion[6] [4] = "In den Tiefen des Arinawaldes";
        this.heimatregion[6] [5] = "Die Harga-Wüste";
        //Wolfsmensch
        this.heimatregion[7] [0] = "Im Schatten der Reißzahnwälder";
        this.heimatregion[7] [1] = "Im Schatten der Reißzahnwälder";
        this.heimatregion[7] [2] = "Tief in den Hainwäldern";
        this.heimatregion[7] [3] = "Tief in den Hainwäldern";
        this.heimatregion[7] [4] = "In den Tiefen des Arinawaldes";
        this.heimatregion[7] [5] = "Die Haine des Leichentuchs";
        //Zwerg
        this.heimatregion[8] [0] = "Die Berge von Moldena";
        this.heimatregion[8] [1] = "Die Klippen von Fern-Vivend";
        this.heimatregion[8] [2] = "Die Klippen von Fern-Vivend";
        this.heimatregion[8] [3] = "Die Gipfel der nördlichen Feulenmark";
        this.heimatregion[8] [4] = "Die Gipfel der nördlichen Feulenmark";
        this.heimatregion[8] [5] = "Die nördlichen Berge von Belderand";
        //Elf
        this.heimatregion[9] [0] = "In den Tiefen des Fennwaldes";
        this.heimatregion[9] [1] = "In den Tiefen des Fennwaldes";
        this.heimatregion[9] [2] = "Am Rande des Fennwaldes";
        this.heimatregion[9] [3] = "Die Siedlungen von Vivend";
        this.heimatregion[9] [4] = "Die Siedlungen von Fern-Vivend";
        this.heimatregion[9] [5] = "Die Insel Maidenholm";
    }

    public final String getHomeregion() {
        return homeregion;
    }
}
