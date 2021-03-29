package history;

import logic.DiceRoller;
import stats.Attribute;
import stats.Skills;

public class Childhood {
    public String childhood;
    private int[] skill = new int[16];
    private Attribute childAttributes;

    public Childhood(Attribute attribute, final Skills skills, String raceName) {
        setDefaultSkills();
        generateChildhoodSkills(raceName);
        skills.setSkills(this.skill);
        attribute.setAttributes(childAttributes);
    }

    private void generateChildhoodSkills(String raceName) {
        final int d = DiceRoller.d6(1);
        if (raceName.equals("Erlenländer (Mensch)")) {
            switch (d) {
                case 1:
                    this.childhood = "Weise";
                    this.childAttributes = new Attribute(3, 5, 3, 4);
                    this.skill[1] = 1;
                    this.skill[2] = 1;
                    this.skill[8] = 1;
                    this.skill[5] = 1;
                    this.skill[10] = 1;
                    this.skill[11] = 1;
                    //Skills waiseS = new Skills(skill);
                    break;
                case 2:
                    this.childhood = "Hirte";
                    this.childAttributes = new Attribute(4, 4, 3, 4);
                    this.skill[8] = 2;
                    this.skill[15] = 2;
                    this.skill[0] = 1;
                    this.skill[3] = 1;
                    //Skills hirteS = new Skills(skill);
                    break;
                case 3:
                    this.childhood = "Herumtreiber";
                    this.childAttributes = new Attribute(4, 4, 4, 3);
                    this.skill[10] = 2;
                    this.skill[1] = 1;
                    this.skill[2] = 1;
                    this.skill[8] = 1;
                    this.skill[11] = 1;
                    //Skills herumtreiberS = new Skills(skill);
                    break;
                case 4:
                    this.childhood = "Knappe";
                    this.childAttributes = new Attribute(4, 4, 3, 4);
                    this.skill[2] = 2;
                    this.skill[1] = 1;
                    this.skill[7] = 1;
                    this.skill[6] = 1;
                    this.skill[14] = 1;
                    //Skills knappeS = new Skills(skill);
                    break;
                case 5:
                    this.childhood = "Arbeiter";
                    this.childAttributes = new Attribute(5, 3, 3, 4);
                    this.skill[0] = 2;
                    this.skill[2] = 1;
                    this.skill[3] = 1;
                    this.skill[10] = 1;
                    this.skill[15] = 1;
                    //Skills arbeiterS = new Skills(skill);
                    break;
                case 6:
                    this.childhood = "Harte Lehrjahre";
                    this.childAttributes = new Attribute(3, 3, 5, 4);
                    this.skill[9] = 3;
                    this.skill[3] = 1;
                    this.skill[11] = 1;
                    this.skill[12] = 1;
                    //Skills harteLehrjahreS = new Skills(skill);
                    break;
            }
        } else if (raceName == "Aslene (Mensch)") {
            switch (d) {
                case 1:
                    this.childhood = "Im Sattel geboren";
                    this.childAttributes = new Attribute(4, 5, 3, 3);
                    this.skill[6] = 2;
                    this.skill[10] = 2;
                    this.skill[15] = 2;
                    //Skills imSattelGeborenS = new Skills(skill);
                    break;
                case 2:
                    this.childhood = "Träumer";
                    this.childAttributes = new Attribute(3, 3, 4, 5);
                    this.skill[9] = 2;
                    this.skill[13] = 2;
                    this.skill[12] = 1;
                    this.skill[15] = 1;
                    //Skills träumerS = new Skills(skill);
                    break;
                case 3:
                    this.childhood = "Die stärkste des Clan";
                    this.childAttributes = new Attribute(5, 3, 3, 4);
                    this.skill[0] = 2;
                    this.skill[2] = 2;
                    this.skill[1] = 1;
                    this.skill[15] = 1;
                    //Skills dieStärksteDesClanS = new Skills(skill);
                    break;
                case 4:
                    this.childhood = "Schüler einer weisen Frau";
                    this.childAttributes = new Attribute(3, 3, 5, 4);
                    this.skill[9] = 2;
                    this.skill[11] = 1;
                    this.skill[14] = 2;
                    this.skill[15] = 1;
                    //Skills schülerEinerWeisenFraS = new Skills(skill);
                    break;
                case 5:
                    this.childhood = "Jäger";
                    this.childAttributes = new Attribute(3, 4, 4, 4);
                    this.skill[7] = 2;
                    this.skill[8] = 2;
                    this.skill[10] = 1;
                    this.skill[15] = 1;
                    //Skills jägerS = new Skills(skill);
                    break;
                case 6:
                    this.childhood = "Kind der Winde";
                    this.childAttributes = new Attribute(4, 4, 3, 4);
                    this.skill[10] = 2;
                    this.skill[2] = 1;
                    this.skill[7] = 1;
                    this.skill[1] = 1;
                    this.skill[15] = 1;
                    //Skills kindDerWindeS = new Skills(skill);
                    break;
            }
        } else if (raceName == "Ailander (Mensch)") {
            switch (d) {
                case 1:
                    this.childhood = "Kind des Raben";
                    this.childAttributes = new Attribute(3, 4, 4, 4);
                    this.skill[9] = 2;
                    this.skill[3] = 1;
                    this.skill[6] = 1;
                    this.skill[8] = 1;
                    this.skill[11] = 1;
                    //Skills kindDerRabenS = new Skills(skill);
                    break;
                case 2:
                    this.childhood = "Druidenlehrling";
                    this.childAttributes = new Attribute(3, 4, 5, 3);
                    this.skill[10] = 2;
                    this.skill[8] = 1;
                    this.skill[9] = 1;
                    this.skill[14] = 1;
                    this.skill[15] = 1;
                    //Skills druidenlehrlingS = new Skills(skill);
                    break;
                case 3:
                    this.childhood = "Beschützer";
                    this.childAttributes = new Attribute(5, 4, 3, 3);
                    this.skill[2] = 2;
                    this.skill[7] = 2;
                    this.skill[6] = 1;
                    this.skill[0] = 1;
                    //Skills beschützerS = new Skills(skill);
                    break;
                case 4:
                    this.childhood = "Wanderer";
                    this.childAttributes = new Attribute(4, 4, 3, 4);
                    this.skill[10] = 2;
                    this.skill[1] = 1;
                    this.skill[2] = 1;
                    this.skill[8] = 1;
                    this.skill[15] = 1;
                    //Skills wandererS = new Skills(skill);
                    break;
                case 5:
                    this.childhood = "Arbeiter";
                    this.childAttributes = new Attribute(5, 3, 3, 4);
                    this.skill[0] = 2;
                    this.skill[2] = 1;
                    this.skill[3] = 1;
                    this.skill[10] = 1;
                    this.skill[15] = 1;
                    //Skills arbeiterS = new Skills(skill);
                    break;
                case 6:
                    this.childhood = "Hirte";
                    this.childAttributes = new Attribute(4, 4, 3, 4);
                    this.skill[8] = 2;
                    this.skill[15] = 2;
                    this.skill[0] = 1;
                    this.skill[3] = 1;
                    //Skills hirteS = new Skills(skill);
                    break;
            }

        } else if (raceName == "Halbelf") {
            switch (d) {
                case 1:
                    this.childhood = "Auf der Flucht";
                    this.childAttributes = new Attribute(4, 5, 3, 3);
                    this.skill[4] = 2;
                    this.skill[8] = 2;
                    this.skill[11] = 1;
                    this.skill[2] = 1;
                    //Skills aufDerFluchtS = new Skills(skill);
                    break;
                case 2:
                    this.childhood = "Künstler";
                    this.childAttributes = new Attribute(3, 3, 4, 5);
                    this.skill[3] = 2;
                    this.skill[13] = 2;
                    this.skill[6] = 1;
                    this.skill[9] = 1;
                    //Skills künstlerS = new Skills(skill);
                    break;
                case 3:
                    this.childhood = "Schüler";
                    this.childAttributes = new Attribute(3, 4, 5, 3);
                    this.skill[9] = 3;
                    this.skill[3] = 1;
                    this.skill[11] = 1;
                    this.skill[14] = 1;
                    //Skills schülerS = new Skills(skill);
                    break;
                case 4:
                    this.childhood = "Akrobat";
                    this.childAttributes = new Attribute(3, 5, 3, 4);
                    this.skill[6] = 2;
                    this.skill[5] = 2;
                    this.skill[13] = 1;
                    this.skill[4] = 1;
                    //Skills akrobatS = new Skills(skill);
                    break;
                case 5:
                    this.childhood = "Kämpfer";
                    this.childAttributes = new Attribute(4, 5, 3, 3);
                    this.skill[2] = 2;
                    this.skill[7] = 2;
                    this.skill[0] = 1;
                    this.skill[1] = 1;
                    //Skills kämpferS = new Skills(skill);
                    break;
                case 6:
                    this.childhood = "Geisterkind";
                    this.childAttributes = new Attribute(3, 4, 4, 4);
                    this.skill[4] = 2;
                    this.skill[5] = 2;
                    this.skill[11] = 1;
                    this.skill[2] = 1;
                    //Skills geisterkindS = new Skills(skill);
                    break;
            }

        } else if (raceName == "Halbling") {
            switch (d) {
                case 1:
                    this.childhood = "Bäckerlehrling";
                    this.childAttributes = new Attribute(4, 4, 3, 4);
                    this.skill[3] = 2;
                    this.skill[5] = 1;
                    this.skill[9] = 1;
                    this.skill[10] = 1;
                    this.skill[13] = 1;
                    //Skills bäckerlehrlingS = new Skills(skill);
                    break;
                case 2:
                    this.childhood = "Arbeiter";
                    this.childAttributes = new Attribute(4, 4, 3, 4);
                    this.skill[0] = 2;
                    this.skill[2] = 1;
                    this.skill[3] = 1;
                    this.skill[10] = 1;
                    this.skill[15] = 1;
                    //Skills arbeiterS = new Skills(skill);
                    break;
                case 3:
                    this.childhood = "Handwerker";
                    this.childAttributes = new Attribute(3, 4, 4, 4);
                    this.skill[3] = 3;
                    this.skill[9] = 1;
                    this.skill[11] = 1;
                    this.skill[2] = 1;
                    //Skills handwerkerS = new Skills(skill);
                    break;
                case 4:
                    this.childhood = "Küchenkind";
                    this.childAttributes = new Attribute(4, 4, 3, 4);
                    this.skill[3] = 2;
                    this.skill[5] = 1;
                    this.skill[9] = 1;
                    this.skill[10] = 1;
                    this.skill[15] = 1;
                    //Skills küchenkindS = new Skills(skill);
                    break;
                case 5:
                    this.childhood = "Bücherwurm";
                    this.childAttributes = new Attribute(3, 3, 5, 4);
                    this.skill[9] = 3;
                    this.skill[11] = 1;
                    this.skill[12] = 1;
                    this.skill[14] = 1;
                    //Skills bücherwurmS = new Skills(skill);
                    break;
                case 6:
                    this.childhood = "Einzelgänger";
                    this.childAttributes = new Attribute(4, 4, 4, 3);
                    this.skill[4] = 2;
                    this.skill[5] = 1;
                    this.skill[8] = 1;
                    this.skill[12] = 1;
                    this.skill[2] = 1;
                    //Skills einzelgängerS = new Skills(skill);
                    break;
            }
        } else if (raceName == "Goblin") {
            switch (d) {
                case 1:
                    this.childhood = "Wolfling";
                    this.childAttributes = new Attribute(4, 5, 3, 3);
                    this.skill[15] = 2;
                    this.skill[1] = 1;
                    this.skill[2] = 1;
                    this.skill[4] = 1;
                    this.skill[6] = 1;
                    //Skills wolflingS = new Skills(skill);
                    break;
                case 2:
                    this.childhood = "Langfinger";
                    this.childAttributes = new Attribute(3, 5, 3, 4);
                    this.skill[4] = 2;
                    this.skill[8] = 2;
                    this.skill[11] = 1;
                    this.skill[12] = 1;
                    //Skills langfingerS = new Skills(skill);
                    break;
                case 3:
                    this.childhood = "Kind der Wälder";
                    this.childAttributes = new Attribute(4, 4, 4, 3);
                    this.skill[10] = 2;
                    this.skill[1] = 1;
                    this.skill[6] = 1;
                    this.skill[7] = 1;
                    this.skill[8] = 1;
                    //Skills kindDerWälderS = new Skills(skill);
                    break;
                case 4:
                    this.childhood = "Wildling";
                    this.childAttributes = new Attribute(4, 4, 3, 4);
                    this.skill[2] = 2;
                    this.skill[6] = 2;
                    this.skill[10] = 1;
                    this.skill[0] = 1;
                    //Skills wildlingS = new Skills(skill);
                    break;
                case 5:
                    this.childhood = "Wanderer";
                    this.childAttributes = new Attribute(4, 4, 4, 3);
                    this.skill[10] = 2;
                    this.skill[1] = 1;
                    this.skill[2] = 1;
                    this.skill[8] = 1;
                    this.skill[15] = 1;
                    //Skills wandererS = new Skills(skill);
                    break;
                case 6:
                    this.childhood = "Geschichtenerzähler";
                    this.childAttributes = new Attribute(3, 4, 3, 5);
                    this.skill[13] = 3;
                    this.skill[12] = 2;
                    this.skill[9] = 1;
                    //Skills geschichtenerzählerS = new Skills(skill);
                    break;
            }
        } else if (raceName == "Ork") {
            switch (d) {
                case 1:
                    this.childhood = "Barde";
                    this.childAttributes = new Attribute(3, 3, 4, 5);
                    this.skill[13] = 3;
                    this.skill[9] = 1;
                    this.skill[11] = 1;
                    this.skill[12] = 1;
                    //Skills bardeS = new Skills(skill);
                    break;
                case 2:
                    this.childhood = "Arbeiter";
                    this.childAttributes = new Attribute(5, 4, 3, 3);
                    this.skill[0] = 2;
                    this.skill[1] = 2;
                    this.skill[3] = 2;
                    //Skills arbeiterS = new Skills(skill);
                    break;
                case 3:
                    this.childhood = "Räuber";
                    this.childAttributes = new Attribute(4, 4, 4, 3);
                    this.skill[2] = 2;
                    this.skill[4] = 1;
                    this.skill[5] = 1;
                    this.skill[8] = 1;
                    this.skill[10] = 1;
                    //Skills räuberS = new Skills(skill);
                    break;
                case 4:
                    this.childhood = "Streuner";
                    this.childAttributes = new Attribute(4, 4, 3, 4);
                    this.skill[10] = 2;
                    this.skill[1] = 1;
                    this.skill[2] = 1;
                    this.skill[8] = 1;
                    this.skill[15] = 1;
                    //Skills streunerS = new Skills(skill);
                    break;
                case 5:
                    this.childhood = "Krieger";
                    this.childAttributes = new Attribute(5, 4, 3, 3);
                    this.skill[2] = 2;
                    this.skill[7] = 2;
                    this.skill[6] = 1;
                    this.skill[0] = 1;
                    //Skills kriegerS = new Skills(skill);
                    break;
                case 6:
                    this.childhood = "Einzelgänger";
                    this.childAttributes = new Attribute(4, 3, 5, 3);
                    this.skill[11] = 2;
                    this.skill[10] = 2;
                    this.skill[2] = 1;
                    this.skill[8] = 1;
                    //Skills einzelgängerS = new Skills(skill);
                    break;
            }
        } else if (raceName == "Wolfsmensch") {
            switch (d) {
                case 1:
                    this.childhood = "Heuler";
                    this.childAttributes = new Attribute(3, 4, 4, 4);
                    this.skill[13] = 3;
                    this.skill[9] = 1;
                    this.skill[12] = 1;
                    this.skill[10] = 1;
                    //Skills heulerS = new Skills(skill);
                    break;
                case 2:
                    this.childhood = "Jäger";
                    this.childAttributes = new Attribute(4, 4, 4, 3);
                    this.skill[8] = 2;
                    this.skill[10] = 2;
                    this.skill[1] = 1;
                    this.skill[2] = 1;
                    //Skills jägerS = new Skills(skill);
                    break;
                case 3:
                    this.childhood = "Ausgestossener";
                    this.childAttributes = new Attribute(4, 3, 5, 3);
                    this.skill[11] = 2;
                    this.skill[10] = 2;
                    this.skill[2] = 1;
                    this.skill[8] = 1;
                    //Skills ausgestossenerS = new Skills(skill);
                    break;
                case 4:
                    this.childhood = "Fährtenleser";
                    this.childAttributes = new Attribute(3, 4, 5, 3);
                    this.skill[8] = 3;
                    this.skill[4] = 2;
                    this.skill[10] = 1;
                    //Skills fährtenleserS = new Skills(skill);
                    break;
                case 5:
                    this.childhood = "Kämpfer";
                    this.childAttributes = new Attribute(5, 4, 3, 3);
                    this.skill[2] = 3;
                    this.skill[0] = 2;
                    this.skill[6] = 1;
                    //Skills kämpferS = new Skills(skill);
                    break;
                case 6:
                    this.childhood = "Kind des Waldes";
                    this.childAttributes = new Attribute(3, 4, 4, 4);
                    this.skill[10] = 3;
                    this.skill[9] = 2;
                    this.skill[8] = 1;
                    //Skills kindDesWaldesS = new Skills(skill);
                    break;
            }
        } else if (raceName == "Zwerg") {
            switch (d) {
                case 1:
                    this.childhood = "Schmiedelehrling";
                    this.childAttributes = new Attribute(5, 3, 4, 3);
                    this.skill[3] = 3;
                    this.skill[0] = 1;
                    this.skill[1] = 1;
                    this.skill[2] = 1;
                    //Skills schmiedelehrlingS = new Skills(skill);
                    break;
                case 2:
                    this.childhood = "Minenkind";
                    this.childAttributes = new Attribute(4, 4, 4, 3);
                    this.skill[1] = 2;
                    this.skill[10] = 2;
                    this.skill[3] = 1;
                    this.skill[8] = 1;
                    //Skills minenkindS = new Skills(skill);
                    break;
                case 3:
                    this.childhood = "Kundschafterlehrling";
                    this.childAttributes = new Attribute(4, 4, 4, 3);
                    this.skill[4] = 2;
                    this.skill[8] = 2;
                    this.skill[10] = 1;
                    this.skill[2] = 1;
                    //Skills kundschafterlehrlingS = new Skills(skill);
                    break;
                case 4:
                    this.childhood = "Wächter in Ausbildung";
                    this.childAttributes = new Attribute(5, 4, 3, 3);
                    this.skill[0] = 2;
                    this.skill[2] = 2;
                    this.skill[7] = 1;
                    this.skill[1] = 1;
                    //Skills wächterInAusbildungS = new Skills(skill);
                    break;
                case 5:
                    this.childhood = "Steinmetz";
                    this.childAttributes = new Attribute(4, 3, 5, 3);
                    this.skill[3] = 2;
                    this.skill[9] = 2;
                    this.skill[10] = 1;
                    this.skill[0] = 1;
                    //Skills steinmetzS = new Skills(skill);
                    break;
                case 6:
                    this.childhood = "Harte Lehrjahre";
                    this.childAttributes = new Attribute(3, 3, 5, 4);
                    this.skill[9] = 3;
                    this.skill[3] = 1;
                    this.skill[11] = 1;
                    this.skill[12] = 1;
                    //Skills harteLehrjahreS = new Skills(skill);
                    break;
            }
        } else if (raceName == "Elf") {
            switch (d) {
                case 1:
                    this.childhood = "Einzelgänger";
                    this.childAttributes = new Attribute(4, 3, 5, 3);
                    this.skill[11] = 2;
                    this.skill[10] = 2;
                    this.skill[2] = 1;
                    this.skill[8] = 1;
                    //Skills einzelgängerS = new Skills(skill);
                    break;
                case 2:
                    this.childhood = "Kämpfer";
                    this.childAttributes = new Attribute(4, 5, 3, 3);
                    this.skill[2] = 2;
                    this.skill[7] = 2;
                    this.skill[0] = 1;
                    this.skill[1] = 1;
                    //Skills kämpferS = new Skills(skill);
                    break;
                case 3:
                    this.childhood = "Kind des Waldes";
                    this.childAttributes = new Attribute(3, 4, 4, 4);
                    this.skill[10] = 3;
                    this.skill[9] = 2;
                    this.skill[8] = 1;
                    //Skills kindDesWaldesS = new Skills(skill);
                    break;
                case 4:
                    this.childhood = "Harte Lehrjahre";
                    this.childAttributes = new Attribute(3, 3, 5, 4);
                    this.skill[9] = 3;
                    this.skill[3] = 1;
                    this.skill[11] = 1;
                    this.skill[12] = 1;
                    //Skills harteLehrjahreS = new Skills(skill);
                    break;
                case 5:
                    this.childhood = "Wanderer";
                    this.childAttributes = new Attribute(4, 4, 3, 4);
                    this.skill[10] = 2;
                    this.skill[1] = 1;
                    this.skill[2] = 1;
                    this.skill[8] = 1;
                    this.skill[15] = 1;
                    //Skills wandererS = new Skills(skill);
                    break;
                case 6:
                    this.childhood = "Druidenlehrling";
                    this.childAttributes = new Attribute(3, 4, 5, 3);
                    this.skill[10] = 2;
                    this.skill[8] = 1;
                    this.skill[9] = 1;
                    this.skill[14] = 1;
                    this.skill[15] = 1;
                    //Skills druidenlehrlingS = new Skills(skill);
                    break;
            }
        } else {
            System.out.println("Fehler!!!");
        }
    }

    private void generateAttributes() {

    }

    public String getChildhood() {
        return this.childhood;
    }

    private void setDefaultSkills() {
        for (int i = 0; i < 16; i++) {
            skill[1] = 0;
        }
    }
}