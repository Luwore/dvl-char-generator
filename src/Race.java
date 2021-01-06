public class Race {

    public static String volk(){
        Homeregion h = new Homeregion();
        int i = DiceRoller.d66();

        if (i < 23) {
            Main.Char[1] = Homeregion.heimatregion[0] [DiceRoller.d6(1)-1];
            return "Erlenländer (Mensch)";
        } else if (i < 32) {
            Main.Char[1] = Homeregion.heimatregion[1] [DiceRoller.d6(1)-1];
            return"Aslene (Mensch)";
        } else if (i < 35) {
            Main.Char[1] = Homeregion.heimatregion[2] [DiceRoller.d6(1)-1];
            return"Ailander (Mensch)";
        } else if (i < 42) {
            Main.Char[1] = Homeregion.heimatregion[3] [DiceRoller.d6(1)-1];
            return"Halbelf";
        } else if (i < 45) {
            Main.Char[1] = Homeregion.heimatregion[4] [DiceRoller.d6(1)-1];
            return"Halbling";
        } else if (i < 53) {
            Main.Char[1] = Homeregion.heimatregion[5] [DiceRoller.d6(1)-1];
            return"Goblin";
        } else if (i < 61) {
            Main.Char[1] = Homeregion.heimatregion[6] [DiceRoller.d6(1)-1];
            return"Ork";
        } else if (i < 63) {
            Main.Char[1] = Homeregion.heimatregion[7] [DiceRoller.d6(1)-1];
            return"Wolfsmensch";
        } else if (i < 65) {
            Main.Char[1] = Homeregion.heimatregion[8] [DiceRoller.d6(1)-1];
            return"Zwerg";
        } else if (i <= 66) {
            Main.Char[1] = Homeregion.heimatregion[9] [DiceRoller.d6(1)-1];
            return"Elf";
        } else {
            return"Fehler";
        }
    }
}
