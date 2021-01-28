package history;

import com.sun.tools.javac.Main;
import logic.DiceRoller;
import stats.Attribute;
import stats.Skills;

public class Childhood {
    public String childhood;
    private String raceName;
    private int[] skill;

    public Childhood(final Skills skills) {
        skills.setSkills(this.skill);
    }

    public void childhood() {
        final int d = DiceRoller.d6(1);
        if (this.raceName == "Erlenländer (Mensch)") {
            switch (d) {
                case 1:
                    this.childhood = "Weise";
                    final Attribute waise = new Attribute(3, 5, 3, 4);
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
                    final Attribute hirte = new Attribute(4, 4, 3, 4);
                    this.skill[8] = 2;
                    this.skill[15] = 2;
                    this.skill[0] = 1;
                    this.skill[3] = 1;
                    //Skills hirteS = new Skills(skill);
                    break;
                case 3:
                    this.childhood = "Herumtreiber";
                    final Attribute herumtreiber = new Attribute(4, 4, 4, 3);
                    this.skill[10] = 2;
                    this.skill[1] = 1;
                    this.skill[2] = 1;
                    this.skill[8] = 1;
                    this.skill[11] = 1;
                    //Skills herumtreiberS = new Skills(skill);
                    break;
                case 4:
                    this.childhood = "Knappe";
                    final Attribute knappe = new Attribute(4, 4, 3, 4);
                    this.skill[2] = 2;
                    this.skill[1] = 1;
                    this.skill[7] = 1;
                    this.skill[6] = 1;
                    this.skill[14] = 1;
                    //Skills knappeS = new Skills(skill);
                    break;
                case 5:
                    this.childhood = "Arbeiter";
                    final Attribute arbeiter = new Attribute(5, 3, 3, 4);
                    this.skill[0] = 2;
                    this.skill[2] = 1;
                    this.skill[3] = 1;
                    this.skill[10] = 1;
                    this.skill[15] = 1;
                    //Skills arbeiterS = new Skills(skill);
                    break;
                case 6:
                    this.childhood = "Harte Lehrjahre";
                    final Attribute harteLehrjahre = new Attribute(3, 3, 5, 4);
                    this.skill[9] = 3;
                    this.skill[3] = 1;
                    this.skill[11] = 1;
                    this.skill[12] = 1;
                    //Skills harteLehrjahreS = new Skills(skill);
                    break;
            }
        } else if (this.raceName == "Aslene (Mensch)") {
            switch (d) {
                case 1:
                    this.childhood = "Im Sattel geboren";
                    final Attribute imSattelGeboren = new Attribute(4, 5, 3, 3);
                    this.skill[6] = 2;
                    this.skill[10] = 2;
                    this.skill[15] = 2;
                    //Skills imSattelGeborenS = new Skills(skill);
                    break;
                case 2:
                    this.childhood = "Träumer";
                    final Attribute träumer = new Attribute(3, 3, 4, 5);
                    this.skill[9] = 2;
                    this.skill[13] = 2;
                    this.skill[12] = 1;
                    this.skill[15] = 1;
                    //Skills träumerS = new Skills(skill);
                    break;
                case 3:
                    this.childhood = "Die stärkste des Clan";
                    final Attribute dieStärksteDesClan = new Attribute(5, 3, 3, 4);
                    this.skill[0] = 2;
                    this.skill[2] = 2;
                    this.skill[1] = 1;
                    this.skill[15] = 1;
                    //Skills dieStärksteDesClanS = new Skills(skill);
                    break;
                case 4:
                    this.childhood = "Schüler einer weisen Frau";
                    final Attribute schülerEinerWeisenFrau = new Attribute(3, 3, 5, 4);
                    this.skill[9] = 2;
                    this.skill[11] = 1;
                    this.skill[14] = 2;
                    this.skill[15] = 1;
                    //Skills schülerEinerWeisenFraS = new Skills(skill);
                    break;
                case 5:
                    this.childhood = "Jäger";
                    final Attribute jäger = new Attribute(3, 4, 4, 4);
                    this.skill[7] = 2;
                    this.skill[8] = 2;
                    this.skill[10] = 1;
                    this.skill[15] = 1;
                    //Skills jägerS = new Skills(skill);
                    break;
                case 6:
                    this.childhood = "Kind der Winde";
                    final Attribute kindDerWinde = new Attribute(4, 4, 3, 4);
                    this.skill[10] = 2;
                    this.skill[2] = 1;
                    this.skill[7] = 1;
                    this.skill[1] = 1;
                    this.skill[15] = 1;
                    //Skills kindDerWindeS = new Skills(skill);
                    break;
            }
        } else if (this.raceName == "Ailander (Mensch)") {
            switch (d) {
                case 1:
                    this.childhood = "Kind des Raben";
                    final Attribute kindDerRaben = new Attribute(3, 4, 4, 4);
                    this.skill[9] = 2;
                    this.skill[3] = 1;
                    this.skill[6] = 1;
                    this.skill[8] = 1;
                    this.skill[11] = 1;
                    //Skills kindDerRabenS = new Skills(skill);
                    break;
                case 2:
                    this.childhood = "Druidenlehrling";
                    final Attribute druidenlehrling = new Attribute(3, 4, 5, 3);
                    this.skill[10] = 2;
                    this.skill[8] = 1;
                    this.skill[9] = 1;
                    this.skill[14] = 1;
                    this.skill[15] = 1;
                    //Skills druidenlehrlingS = new Skills(skill);
                    break;
                case 3:
                    this.childhood = "Beschützer";
                    final Attribute beschützer = new Attribute(5, 4, 3, 3);
                    this.skill[2] = 2;
                    this.skill[7] = 2;
                    this.skill[6] = 1;
                    this.skill[0] = 1;
                    //Skills beschützerS = new Skills(skill);
                    break;
                case 4:
                    this.childhood = "Wanderer";
                    final Attribute wanderer = new Attribute(4, 4, 3, 4);
                    this.skill[10] = 2;
                    this.skill[1] = 1;
                    this.skill[2] = 1;
                    this.skill[8] = 1;
                    this.skill[15] = 1;
                    //Skills wandererS = new Skills(skill);
                    break;
                case 5:
                    this.childhood = "Arbeiter";
                    final Attribute arbeiter = new Attribute(5, 3, 3, 4);
                    this.skill[0] = 2;
                    this.skill[2] = 1;
                    this.skill[3] = 1;
                    this.skill[10] = 1;
                    this.skill[15] = 1;
                    //Skills arbeiterS = new Skills(skill);
                    break;
                case 6:
                    this.childhood = "Hirte";
                    final Attribute hirte = new Attribute(4, 4, 3, 4);
                    this.skill[8] = 2;
                    this.skill[15] = 2;
                    this.skill[0] = 1;
                    this.skill[3] = 1;
                    //Skills hirteS = new Skills(skill);
                    break;
            }

        } else if (this.raceName == "Halbelf") {
            switch (d) {
                case 1:
                    this.childhood = "Auf der Flucht";
                    final Attribute aufDerFlucht = new Attribute(4, 5, 3, 3);
                    this.skill[4] = 2;
                    this.skill[8] = 2;
                    this.skill[11] = 1;
                    this.skill[2] = 1;
                    //Skills aufDerFluchtS = new Skills(skill);
                    break;
                case 2:
                    this.childhood = "Künstler";
                    final Attribute künstler = new Attribute(3, 3, 4, 5);
                    this.skill[3] = 2;
                    this.skill[13] = 2;
                    this.skill[6] = 1;
                    this.skill[9] = 1;
                    //Skills künstlerS = new Skills(skill);
                    break;
                case 3:
                    this.childhood = "Schüler";
                    final Attribute schüler = new Attribute(3, 4, 5, 3);
                    this.skill[9] = 3;
                    this.skill[3] = 1;
                    this.skill[11] = 1;
                    this.skill[14] = 1;
                    //Skills schülerS = new Skills(skill);
                    break;
                case 4:
                    this.childhood = "Akrobat";
                    final Attribute akrobat = new Attribute(3, 5, 3, 4);
                    this.skill[6] = 2;
                    this.skill[5] = 2;
                    this.skill[13] = 1;
                    this.skill[4] = 1;
                    //Skills akrobatS = new Skills(skill);
                    break;
                case 5:
                    this.childhood = "Kämpfer";
                    final Attribute kämpfer = new Attribute(4, 5, 3, 3);
                    this.skill[2] = 2;
                    this.skill[7] = 2;
                    this.skill[0] = 1;
                    this.skill[1] = 1;
                    //Skills kämpferS = new Skills(skill);
                    break;
                case 6:
                    this.childhood = "Geisterkind";
                    final Attribute geisterkind = new Attribute(3, 4, 4, 4);
                    this.skill[4] = 2;
                    this.skill[5] = 2;
                    this.skill[11] = 1;
                    this.skill[2] = 1;
                    //Skills geisterkindS = new Skills(skill);
                    break;
            }

        } else if (this.raceName == "Halbling") {
            switch (d) {
                case 1:
                    this.childhood = "Bäckerlehrling";
                    final Attribute bäckerlehrling = new Attribute(4, 4, 3, 4);
                    this.skill[3] = 2;
                    this.skill[5] = 1;
                    this.skill[9] = 1;
                    this.skill[10] = 1;
                    this.skill[13] = 1;
                    //Skills bäckerlehrlingS = new Skills(skill);
                    break;
                case 2:
                    this.childhood = "Arbeiter";
                    final Attribute arbeiter = new Attribute(4, 4, 3, 4);
                    this.skill[0] = 2;
                    this.skill[2] = 1;
                    this.skill[3] = 1;
                    this.skill[10] = 1;
                    this.skill[15] = 1;
                    //Skills arbeiterS = new Skills(skill);
                    break;
                case 3:
                    this.childhood = "Handwerker";
                    final Attribute handwerker = new Attribute(3, 4, 4, 4);
                    this.skill[3] = 3;
                    this.skill[9] = 1;
                    this.skill[11] = 1;
                    this.skill[2] = 1;
                    //Skills handwerkerS = new Skills(skill);
                    break;
                case 4:
                    this.childhood = "Küchenkind";
                    final Attribute küchenkind = new Attribute(4, 4, 3, 4);
                    this.skill[3] = 2;
                    this.skill[5] = 1;
                    this.skill[9] = 1;
                    this.skill[10] = 1;
                    this.skill[15] = 1;
                    //Skills küchenkindS = new Skills(skill);
                    break;
                case 5:
                    this.childhood = "Bücherwurm";
                    final Attribute bücherwurm = new Attribute(3, 3, 5, 4);
                    this.skill[9] = 3;
                    this.skill[11] = 1;
                    this.skill[12] = 1;
                    this.skill[14] = 1;
                    //Skills bücherwurmS = new Skills(skill);
                    break;
                case 6:
                    this.childhood = "Einzelgänger";
                    final Attribute einzelgänger = new Attribute(4, 4, 4, 3);
                    this.skill[4] = 2;
                    this.skill[5] = 1;
                    this.skill[8] = 1;
                    this.skill[12] = 1;
                    this.skill[2] = 1;
                    //Skills einzelgängerS = new Skills(skill);
                    break;
            }
        } else if (this.raceName == "Goblin") {
            switch (d) {
                case 1:
                    this.childhood = "Wolfling";
                    final Attribute wolfling = new Attribute(4, 5, 3, 3);
                    this.skill[15] = 2;
                    this.skill[1] = 1;
                    this.skill[2] = 1;
                    this.skill[4] = 1;
                    this.skill[6] = 1;
                    //Skills wolflingS = new Skills(skill);
                    break;
                case 2:
                    this.childhood = "Langfinger";
                    final Attribute langfinger = new Attribute(3, 5, 3, 4);
                    this.skill[4] = 2;
                    this.skill[8] = 2;
                    this.skill[11] = 1;
                    this.skill[12] = 1;
                    //Skills langfingerS = new Skills(skill);
                    break;
                case 3:
                    this.childhood = "Kind der Wälder";
                    final Attribute kindDerWälder = new Attribute(4, 4, 4, 3);
                    this.skill[10] = 2;
                    this.skill[1] = 1;
                    this.skill[6] = 1;
                    this.skill[7] = 1;
                    this.skill[8] = 1;
                    //Skills kindDerWälderS = new Skills(skill);
                    break;
                case 4:
                    this.childhood = "Wildling";
                    final Attribute wildling = new Attribute(4, 4, 3, 4);
                    this.skill[2] = 2;
                    this.skill[6] = 2;
                    this.skill[10] = 1;
                    this.skill[0] = 1;
                    //Skills wildlingS = new Skills(skill);
                    break;
                case 5:
                    this.childhood = "Wanderer";
                    final Attribute wanderer = new Attribute(4, 4, 4, 3);
                    this.skill[10] = 2;
                    this.skill[1] = 1;
                    this.skill[2] = 1;
                    this.skill[8] = 1;
                    this.skill[15] = 1;
                    //Skills wandererS = new Skills(skill);
                    break;
                case 6:
                    this.childhood = "Geschichtenerzähler";
                    final Attribute geschichtenerzähler = new Attribute(3, 4, 3, 5);
                    this.skill[13] = 3;
                    this.skill[12] = 2;
                    this.skill[9] = 1;
                    //Skills geschichtenerzählerS = new Skills(skill);
                    break;
            }
        } else if (this.raceName == "Ork") {
            switch (d) {
                case 1:
                    this.childhood = "Barde";
                    final Attribute barde = new Attribute(3, 3, 4, 5);
                    this.skill[13] = 3;
                    this.skill[9] = 1;
                    this.skill[11] = 1;
                    this.skill[12] = 1;
                    //Skills bardeS = new Skills(skill);
                    break;
                case 2:
                    this.childhood = "Arbeiter";
                    final Attribute arbeiter = new Attribute(5, 4, 3, 3);
                    this.skill[0] = 2;
                    this.skill[1] = 2;
                    this.skill[3] = 2;
                    //Skills arbeiterS = new Skills(skill);
                    break;
                case 3:
                    this.childhood = "Räuber";
                    final Attribute räuber = new Attribute(4, 4, 4, 3);
                    this.skill[2] = 2;
                    this.skill[4] = 1;
                    this.skill[5] = 1;
                    this.skill[8] = 1;
                    this.skill[10] = 1;
                    //Skills räuberS = new Skills(skill);
                    break;
                case 4:
                    this.childhood = "Streuner";
                    final Attribute streuner = new Attribute(4, 4, 3, 4);
                    this.skill[10] = 2;
                    this.skill[1] = 1;
                    this.skill[2] = 1;
                    this.skill[8] = 1;
                    this.skill[15] = 1;
                    //Skills streunerS = new Skills(skill);
                    break;
                case 5:
                    this.childhood = "Krieger";
                    final Attribute krieger = new Attribute(5, 4, 3, 3);
                    this.skill[2] = 2;
                    this.skill[7] = 2;
                    this.skill[6] = 1;
                    this.skill[0] = 1;
                    //Skills kriegerS = new Skills(skill);
                    break;
                case 6:
                    this.childhood = "Einzelgänger";
                    final Attribute einzelgänger = new Attribute(4, 3, 5, 3);
                    this.skill[11] = 2;
                    this.skill[10] = 2;
                    this.skill[2] = 1;
                    this.skill[8] = 1;
                    //Skills einzelgängerS = new Skills(skill);
                    break;
            }
        } else if (this.raceName == "Wolfsmensch") {
            switch (d) {
                case 1:
                    this.childhood = "Heuler";
                    final Attribute heuler = new Attribute(3, 4, 4, 4);
                    this.skill[13] = 3;
                    this.skill[9] = 1;
                    this.skill[12] = 1;
                    this.skill[10] = 1;
                    //Skills heulerS = new Skills(skill);
                    break;
                case 2:
                    this.childhood = "Jäger";
                    final Attribute jäger = new Attribute(4, 4, 4, 3);
                    this.skill[8] = 2;
                    this.skill[10] = 2;
                    this.skill[1] = 1;
                    this.skill[2] = 1;
                    //Skills jägerS = new Skills(skill);
                    break;
                case 3:
                    this.childhood = "Ausgestossener";
                    final Attribute ausgestossener = new Attribute(4, 3, 5, 3);
                    this.skill[11] = 2;
                    this.skill[10] = 2;
                    this.skill[2] = 1;
                    this.skill[8] = 1;
                    //Skills ausgestossenerS = new Skills(skill);
                    break;
                case 4:
                    this.childhood = "Fährtenleser";
                    final Attribute fährtenleser = new Attribute(3, 4, 5, 3);
                    this.skill[8] = 3;
                    this.skill[4] = 2;
                    this.skill[10] = 1;
                    //Skills fährtenleserS = new Skills(skill);
                    break;
                case 5:
                    this.childhood = "Kämpfer";
                    final Attribute kämpfer = new Attribute(5, 4, 3, 3);
                    this.skill[2] = 3;
                    this.skill[0] = 2;
                    this.skill[6] = 1;
                    //Skills kämpferS = new Skills(skill);
                    break;
                case 6:
                    this.childhood = "Kind des Waldes";
                    final Attribute kindDesWaldes = new Attribute(3, 4, 4, 4);
                    this.skill[10] = 3;
                    this.skill[9] = 2;
                    this.skill[8] = 1;
                    //Skills kindDesWaldesS = new Skills(skill);
                    break;
            }
        } else if (this.raceName == "Zwerg") {
            switch (d) {
                case 1:
                    this.childhood = "Schmiedelehrling";
                    final Attribute schmiedelehrling = new Attribute(5, 3, 4, 3);
                    this.skill[3] = 3;
                    this.skill[0] = 1;
                    this.skill[1] = 1;
                    this.skill[2] = 1;
                    //Skills schmiedelehrlingS = new Skills(skill);
                    break;
                case 2:
                    this.childhood = "Minenkind";
                    final Attribute minenkind = new Attribute(4, 4, 4, 3);
                    this.skill[1] = 2;
                    this.skill[10] = 2;
                    this.skill[3] = 1;
                    this.skill[8] = 1;
                    //Skills minenkindS = new Skills(skill);
                    break;
                case 3:
                    this.childhood = "Kundschafterlehrling";
                    final Attribute kundschafterlehrling = new Attribute(4, 4, 4, 3);
                    this.skill[4] = 2;
                    this.skill[8] = 2;
                    this.skill[10] = 1;
                    this.skill[2] = 1;
                    //Skills kundschafterlehrlingS = new Skills(skill);
                    break;
                case 4:
                    this.childhood = "Wächter in Ausbildung";
                    final Attribute wächterInAusbildung = new Attribute(5, 4, 3, 3);
                    this.skill[0] = 2;
                    this.skill[2] = 2;
                    this.skill[7] = 1;
                    this.skill[1] = 1;
                    //Skills wächterInAusbildungS = new Skills(skill);
                    break;
                case 5:
                    this.childhood = "Steinmetz";
                    final Attribute steinmetz = new Attribute(4, 3, 5, 3);
                    this.skill[3] = 2;
                    this.skill[9] = 2;
                    this.skill[10] = 1;
                    this.skill[0] = 1;
                    //Skills steinmetzS = new Skills(skill);
                    break;
                case 6:
                    this.childhood = "Harte Lehrjahre";
                    final Attribute harteLehrjahre = new Attribute(3, 3, 5, 4);
                    this.skill[9] = 3;
                    this.skill[3] = 1;
                    this.skill[11] = 1;
                    this.skill[12] = 1;
                    //Skills harteLehrjahreS = new Skills(skill);
                    break;
            }
        } else if (this.raceName == "Elf") {
            switch (d) {
                case 1:
                    this.childhood = "Einzelgänger";
                    final Attribute einzelgänger = new Attribute(4, 3, 5, 3);
                    this.skill[11] = 2;
                    this.skill[10] = 2;
                    this.skill[2] = 1;
                    this.skill[8] = 1;
                    //Skills einzelgängerS = new Skills(skill);
                    break;
                case 2:
                    this.childhood = "Kämpfer";
                    final Attribute kämpfer = new Attribute(4, 5, 3, 3);
                    this.skill[2] = 2;
                    this.skill[7] = 2;
                    this.skill[0] = 1;
                    this.skill[1] = 1;
                    //Skills kämpferS = new Skills(skill);
                    break;
                case 3:
                    this.childhood = "Kind des Waldes";
                    final Attribute kindDesWaldes = new Attribute(3, 4, 4, 4);
                    this.skill[10] = 3;
                    this.skill[9] = 2;
                    this.skill[8] = 1;
                    //Skills kindDesWaldesS = new Skills(skill);
                    break;
                case 4:
                    this.childhood = "Harte Lehrjahre";
                    final Attribute harteLehrjahre = new Attribute(3, 3, 5, 4);
                    this.skill[9] = 3;
                    this.skill[3] = 1;
                    this.skill[11] = 1;
                    this.skill[12] = 1;
                    //Skills harteLehrjahreS = new Skills(skill);
                    break;
                case 5:
                    this.childhood = "Wanderer";
                    final Attribute wanderer = new Attribute(4, 4, 3, 4);
                    this.skill[10] = 2;
                    this.skill[1] = 1;
                    this.skill[2] = 1;
                    this.skill[8] = 1;
                    this.skill[15] = 1;
                    //Skills wandererS = new Skills(skill);
                    break;
                case 6:
                    this.childhood = "Druidenlehrling";
                    final Attribute druidenlehrling = new Attribute(3, 4, 5, 3);
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
}
