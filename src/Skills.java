import java.lang.reflect.Array;

public class Skills {
    private static int skills [] = new int[16];
    private static String [] skillNames = {"Kraft"
            , "Ausdauer"
            , "Nahkampf"
            , "Handwerk"
            , "Heimlichkeit"
            , "Fingerfertigkeit"
            , "Bewegen"
            , "Fernkampf"
            , "Auskundschaften"
            , "Wissen"
            , "Überleben"
            , "Menschenkenntnis"
            , "Manipulation"
            , "Darbietung"
            , "Heilen"
            , "Tierkunde"};

    public Skills(int [] skills) {
        this.skills = skills;
        Main.Char[4] = skillTree();
    }

    private static String skillTree () {
        String result = "Deine Fertigkeiten sind:";
        for(int i = 0; i < 16; i++ ) {
            result = result + "\n "+ skillNames [i] + " " + skills[i];
        }
        return result;
    }

    /*
    * 0 Kraft
    * 1 Ausdauer
    * 2 Nahkampf
    * 3 Handwerk
    * 4 Heimlichkeit
    * 5 Fingerfertigkeit
    * 6 Bewegen
    * 7 Fernkampf
    * 8 Auskundschaften
    * 9 Wissen
    * 10 Überleben
    * 11 Menschenkenntnis
    * 12 Manipulation
    * 13 Darbietung
    * 14 Heilen
    * 15 Tierkunde*/

}
