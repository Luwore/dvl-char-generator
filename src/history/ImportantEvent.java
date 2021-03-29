package history;

import logic.DiceRoller;
import stats.Skills;

import java.util.HashSet;

public class ImportantEvent {

    public ImportantEvent(int jobInt, Skills skills) {
        generateImportantEvent(jobInt, skills);
    }

    private HashSet<String> importantEvents = new HashSet<>();

    private void generateImportantEvent(int jobInt, Skills skills) {
        final int d = DiceRoller.d6(1);
        if (0 == jobInt) {
            switch (d) {
                case 1:
                    importantEvents.add("Pilgerfahrt");
                    skills.addSkills(9, 1);
                    skills.addSkills(10, 1);
                    break;
                case 2:
                    importantEvents.add("Gejagt");
                    skills.addSkills(2, 1);
                    skills.addSkills(6, 1);
                    break;
                case 3:
                    importantEvents.add("Unerwarteter Fund");
                    skills.addSkills(3, 1);
                    skills.addSkills(10, 1);
                    break;
                case 4:
                    importantEvents.add("Lehre bei einem Meister");
                    skills.addSkills(9, 1);
                    skills.addSkills(10, 1);
                    break;
                case 5:
                    importantEvents.add("Wächter des Waldes");
                    skills.addSkills(7, 1);
                    skills.addSkills(15, 1);
                    break;
                case 6:
                    importantEvents.add("Eremitendasein");
                    skills.addSkills(1, 1);
                    skills.addSkills(10, 1);
                    break;
            }
        } else if (1 == jobInt) {
            switch (d) {
                case 1:
                    importantEvents.add("Gefangen");
                    skills.addSkills(0, 1);
                    skills.addSkills(10, 1);
                    break;
                case 2:
                    importantEvents.add("Blutige Schlacht");
                    skills.addSkills(2, 2);
                    break;
                case 3:
                    importantEvents.add("Ein langer Marsch");
                    skills.addSkills(10, 1);
                    skills.addSkills(14, 1);
                    break;
                case 4:
                    importantEvents.add("Zu Pferden");
                    skills.addSkills(2, 1);
                    skills.addSkills(15, 1);
                    break;
                case 5:
                    importantEvents.add("Kundschafter");
                    skills.addSkills(8, 1);
                    skills.addSkills(7, 1);
                    break;
                case 6:
                    importantEvents.add("Befehlshaber");
                    skills.addSkills(9, 1);
                    skills.addSkills(12, 1);
                    break;
            }
        } else if (2 == jobInt) {
            switch (d) {
                case 1:
                    importantEvents.add("Auf der Jagd nach einer Bestie");
                    skills.addSkills(2, 1);
                    skills.addSkills(8, 1);
                    break;
                case 2:
                    importantEvents.add("Eins mit dem Wald");
                    skills.addSkills(7, 1);
                    skills.addSkills(10, 1);
                    break;
                case 3:
                    importantEvents.add("Ein Reittier gezähmt");
                    skills.addSkills(15, 2);
                    break;
                case 4:
                    importantEvents.add("Sieg in einem Schiesswettbewerb");
                    skills.addSkills(7, 2);
                    break;
                case 5:
                    importantEvents.add("Führer");
                    skills.addSkills(8, 2);
                    break;
                case 6:
                    importantEvents.add("Jäger für einen Adligen");
                    skills.addSkills(7, 1);
                    skills.addSkills(11, 1);
                    break;
            }
        } else if (3 == jobInt) {
            switch (d) {
                case 1:
                    importantEvents.add("Autor einer beliebten Ballade");
                    skills.addSkills(12, 1);
                    skills.addSkills(13, 1);
                    break;
                case 2:
                    importantEvents.add("Als Barde gearbeitet");
                    skills.addSkills(13, 2);
                    break;
                case 3:
                    importantEvents.add("Inspirierende Reise");
                    skills.addSkills(9, 1);
                    skills.addSkills(10, 1);
                    break;
                case 4:
                    importantEvents.add("Sänger für einen Adligen");
                    skills.addSkills(11, 1);
                    skills.addSkills(13, 1);
                    break;
                case 5:
                    importantEvents.add("Angeworben");
                    skills.addSkills(2, 1);
                    skills.addSkills(10, 1);
                    break;
                case 6:
                    importantEvents.add("Duell mit einem Rivalen");
                    skills.addSkills(2, 1);
                    skills.addSkills(14, 1);
                    break;
            }
        } else if (4 == jobInt) {
            switch (d) {
                case 1:
                    importantEvents.add("Karawane");
                    skills.addSkills(15, 1);
                    skills.addSkills(12, 1);
                    break;
                case 2:
                    importantEvents.add("Lokales Geschäft");
                    skills.addSkills(11, 1);
                    skills.addSkills(12, 1);
                    break;
                case 3:
                    importantEvents.add("Betrogen");
                    skills.addSkills(11, 2);
                    break;
                case 4:
                    importantEvents.add("Nebenqueste");
                    skills.addSkills(2, 1);
                    skills.addSkills(9, 1);
                    break;
                case 5:
                    importantEvents.add("Schmuggler");
                    skills.addSkills(8, 1);
                    skills.addSkills(11, 1);
                    break;
                case 6:
                    importantEvents.add("Ladenbesitzer");
                    skills.addSkills(12, 1);
                    break;
            }
        } else if (5 == jobInt) {
            switch (d) {
                case 1:
                    importantEvents.add("Angeworben");
                    skills.addSkills(2, 1);
                    skills.addSkills(7, 1);
                    break;
                case 2:
                    importantEvents.add("Wettkämpfer");
                    skills.addSkills(6, 1);
                    skills.addSkills(15, 1);
                    break;
                case 3:
                    importantEvents.add("Das Land bereist");
                    skills.addSkills(8, 1);
                    skills.addSkills(10, 1);
                    break;
                case 4:
                    importantEvents.add("Karawanenwache");
                    skills.addSkills(2, 1);
                    skills.addSkills(8, 1);
                    break;
                case 5:
                    importantEvents.add("Viehhirte");
                    skills.addSkills(6, 1);
                    skills.addSkills(15, 1);
                    break;
                case 6:
                    importantEvents.add("Steppenreiter");
                    skills.addSkills(7, 1);
                    skills.addSkills(15, 1);
                    break;
            }
        } else if (6 == jobInt) {
            switch (d) {
                case 1:
                    importantEvents.add("Von den falschen Gestohlen");
                    skills.addSkills(5, 1);
                    skills.addSkills(6, 1);
                    break;
                case 2:
                    importantEvents.add("Eingesperrt");
                    skills.addSkills(1, 1);
                    skills.addSkills(10, 1);
                    break;
                case 3:
                    importantEvents.add("Erfolgreicher Fischzug");
                    skills.addSkills(5, 1);
                    skills.addSkills(4, 1);
                    break;
                case 4:
                    importantEvents.add("Einer Diebesgilde beigetreten");
                    skills.addSkills(11, 1);
                    skills.addSkills(8, 1);
                    break;
                case 5:
                    importantEvents.add("Angeworben");
                    skills.addSkills(7, 1);
                    skills.addSkills(8, 1);
                    break;
                case 6:
                    importantEvents.add("Räuberbande");
                    skills.addSkills(2, 1);
                    skills.addSkills(10, 1);
                    break;
            }
        } else if (7 == jobInt) {
            switch (d) {
                case 1:
                    importantEvents.add("Fehlgeschlagenes Experiment");
                    skills.addSkills(9, 1);
                    skills.addSkills(14, 1);
                    break;
                case 2:
                    importantEvents.add("Einsame Studien");
                    skills.addSkills(9, 1);
                    skills.addSkills(10, 1);
                    break;
                case 3:
                    importantEvents.add("Seltsames Artefakt gefunden");
                    skills.addSkills(3, 1);
                    skills.addSkills(11, 1);
                    break;
                case 4:
                    importantEvents.add("Hofmagier");
                    skills.addSkills(11, 1);
                    skills.addSkills(12, 1);
                    break;
                case 5:
                    importantEvents.add("Unterhaltungskünstler");
                    skills.addSkills(12, 2);
                    break;
                case 6:
                    importantEvents.add("Angeworben");
                    skills.addSkills(2, 1);
                    skills.addSkills(14, 1);
                    break;
            }
        }
    }

    public String getImportantEvents() {
        return this.importantEvents.toString();
    }
}
