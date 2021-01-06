public class Childhood {
    public static String childhood;
    private static int skill [] = new int[16];
    public static void childhood() {
        int d = DiceRoller.d6(1);
        if (Main.Char[0] == "Erlenländer (Mensch)") {
            switch(d){
                case 1:
                    Childhood.childhood = "Weise";
                    Attribute waise = new Attribute(3, 5, 3, 4);
                    Childhood.skill[1] = 1;
                    Childhood.skill[2] = 1;
                    Childhood.skill[8] = 1;
                    Childhood.skill[5] = 1;
                    Childhood.skill[10] = 1;
                    Childhood.skill[11] = 1;
                    Skills waiseS = new Skills(skill);
                    break;
                case 2:
                    Childhood.childhood = "Hirte";
                    Attribute hirte = new Attribute(4,4,3,4);
                    Childhood.skill[8] = 2;
                    Childhood.skill[15] = 2;
                    Childhood.skill[0] = 1;
                    Childhood.skill[3] = 1;
                    Skills hirteS = new Skills(skill);
                    break;
                case 3:
                    Childhood.childhood = "Herumtreiber";
                    Attribute herumtreiber = new Attribute(4, 4, 4, 3);
                    Childhood.skill[10] = 2;
                    Childhood.skill[1] = 1;
                    Childhood.skill[2] = 1;
                    Childhood.skill[8] = 1;
                    Childhood.skill[11] = 1;
                    Skills herumtreiberS = new Skills(skill);
                    break;
                case 4:
                    Childhood.childhood = "Knappe";
                    Attribute knappe = new Attribute(4,4,3,4);
                    Childhood.skill[2] = 2;
                    Childhood.skill[1] = 1;
                    Childhood.skill[7] = 1;
                    Childhood.skill[6] = 1;
                    Childhood.skill[14] = 1;
                    Skills knappeS = new Skills(skill);
                    break;
                case 5:
                    Childhood.childhood = "Arbeiter";
                    Attribute arbeiter = new Attribute(5,3,3,4);
                    Childhood.skill[0] = 2;
                    Childhood.skill[2] = 1;
                    Childhood.skill[3] = 1;
                    Childhood.skill[10] = 1;
                    Childhood.skill[15] = 1;
                    Skills arbeiterS = new Skills(skill);
                    break;
                case 6:
                    Childhood.childhood = "Harte Lehrjahre";
                    Attribute harteLehrjahre = new Attribute(3,3,5,4);
                    Childhood.skill[9] = 3;
                    Childhood.skill[3] = 1;
                    Childhood.skill[11] = 1;
                    Childhood.skill[12] = 1;
                    Skills harteLehrjahreS = new Skills(skill);
                    break;
            }
        } else if (Main.Char[0] == "Aslene (Mensch)") {
            switch(d){
                case 1:
                    Childhood.childhood = "Im Sattel geboren";
                    Attribute imSattelGeboren = new Attribute(4,5,3,3);
                    Childhood.skill[6] = 2;
                    Childhood.skill[10] = 2;
                    Childhood.skill[15] = 2;
                    Skills imSattelGeborenS = new Skills(skill);
                    break;
                case 2:
                    Childhood.childhood = "Träumer";
                    Attribute träumer = new Attribute(3,3,4,5);
                    Childhood.skill[9] = 2;
                    Childhood.skill[13] = 2;
                    Childhood.skill[12] = 1;
                    Childhood.skill[15] = 1;
                    Skills träumerS = new Skills(skill);
                    break;
                case 3:
                    Childhood.childhood = "Die stärkste des Clan";
                    Attribute dieStärksteDesClan = new Attribute(5,3,3,4);
                    Childhood.skill[0] = 2;
                    Childhood.skill[2] = 2;
                    Childhood.skill[1] = 1;
                    Childhood.skill[15] = 1;
                    Skills dieStärksteDesClanS = new Skills(skill);
                    break;
                case 4:
                    Childhood.childhood = "Schüler einer weisen Frau";
                    Attribute schülerEinerWeisenFrau = new Attribute(3,3,5,4);
                    Childhood.skill[9] = 2;
                    Childhood.skill[11] = 1;
                    Childhood.skill[14] = 2;
                    Childhood.skill[15] = 1;
                    Skills schülerEinerWeisenFraS = new Skills(skill);
                    break;
                case 5:
                    Childhood.childhood = "Jäger";
                    Attribute jäger = new Attribute(3,4,4,4);
                    Childhood.skill[7] = 2;
                    Childhood.skill[8] = 2;
                    Childhood.skill[10] = 1;
                    Childhood.skill[15] = 1;
                    Skills jägerS = new Skills(skill);
                    break;
                case 6:
                    Childhood.childhood = "Kind der Winde";
                    Attribute kindDerWinde = new Attribute(4,4,3,4);
                    Childhood.skill[10] = 2;
                    Childhood.skill[2] = 1;
                    Childhood.skill[7] = 1;
                    Childhood.skill[1] = 1;
                    Childhood.skill[15] = 1;
                    Skills kindDerWindeS = new Skills(skill);
                    break;
            }
        } else if (Main.Char[0] == "Ailander (Mensch)") {
            switch(d){
                case 1:
                    Childhood.childhood = "Kind des Raben";
                    Attribute kindDerRaben = new Attribute(3,4,4,4);
                    Childhood.skill[9] = 2;
                    Childhood.skill[3] = 1;
                    Childhood.skill[6] = 1;
                    Childhood.skill[8] = 1;
                    Childhood.skill[11] = 1;
                    Skills kindDerRabenS = new Skills(skill);
                    break;
                case 2:
                    Childhood.childhood = "Druidenlehrling";
                    Attribute druidenlehrling = new Attribute(3,4,5,3);
                    Childhood.skill[10] = 2;
                    Childhood.skill[8] = 1;
                    Childhood.skill[9] = 1;
                    Childhood.skill[14] = 1;
                    Childhood.skill[15] = 1;
                    Skills druidenlehrlingS = new Skills(skill);
                    break;
                case 3:
                    Childhood.childhood = "Beschützer";
                    Attribute beschützer = new Attribute(5,4,3,3);
                    Childhood.skill[2] = 2;
                    Childhood.skill[7] = 2;
                    Childhood.skill[6] = 1;
                    Childhood.skill[0] = 1;
                    Skills beschützerS = new Skills(skill);
                    break;
                case 4:
                    Childhood.childhood = "Wanderer";
                    Attribute wanderer = new Attribute(4,4,3,4);
                    Childhood.skill[10] = 2;
                    Childhood.skill[1] = 1;
                    Childhood.skill[2] = 1;
                    Childhood.skill[8] = 1;
                    Childhood.skill[15] = 1;
                    Skills wandererS = new Skills(skill);
                    break;
                case 5:
                    Childhood.childhood = "Arbeiter";
                    Attribute arbeiter = new Attribute(5,3,3,4);
                    Childhood.skill[0] = 2;
                    Childhood.skill[2] = 1;
                    Childhood.skill[3] = 1;
                    Childhood.skill[10] = 1;
                    Childhood.skill[15] = 1;
                    Skills arbeiterS = new Skills(skill);
                    break;
                case 6:
                    Childhood.childhood = "Hirte";
                    Attribute hirte = new Attribute(4,4,3,4);
                    skill[8] = 2;
                    skill[15] = 2;
                    skill[0] = 1;
                    skill[3] = 1;
                    Skills hirteS = new Skills(skill);
                    break;
            }

        } else if (Main.Char[0] == "Halbelf") {
            switch(d){
                case 1:
                    Childhood.childhood = "Auf der Flucht";
                    Attribute aufDerFlucht = new Attribute(4,5,3,3);
                    Childhood.skill[4] = 2;
                    Childhood.skill[8] = 2;
                    Childhood.skill[11] = 1;
                    Childhood.skill[2] = 1;
                    Skills aufDerFluchtS = new Skills(skill);
                    break;
                case 2:
                    Childhood.childhood = "Künstler";
                    Attribute künstler = new Attribute(3,3,4,5);
                    Childhood.skill[3] = 2;
                    Childhood.skill[13] = 2;
                    Childhood.skill[6] = 1;
                    Childhood.skill[9] = 1;
                    Skills künstlerS = new Skills(skill);
                    break;
                case 3:
                    Childhood.childhood = "Schüler";
                    Attribute schüler = new Attribute(3,4,5,3);
                    Childhood.skill[9] = 3;
                    Childhood.skill[3] = 1;
                    Childhood.skill[11] = 1;
                    Childhood.skill[14] = 1;
                    Skills schülerS = new Skills(skill);
                    break;
                case 4:
                    Childhood.childhood = "Akrobat";
                    Attribute akrobat = new Attribute(3,5,3,4);
                    Childhood.skill[6] = 2;
                    Childhood.skill[5] = 2;
                    Childhood.skill[13] = 1;
                    Childhood.skill[4] = 1;
                    Skills akrobatS = new Skills(skill);
                    break;
                case 5:
                    Childhood.childhood = "Kämpfer";
                    Attribute kämpfer = new Attribute(4,5,3,3);
                    Childhood.skill[2] = 2;
                    Childhood.skill[7] = 2;
                    Childhood.skill[0] = 1;
                    Childhood.skill[1] = 1;
                    Skills kämpferS = new Skills(skill);
                    break;
                case 6:
                    Childhood.childhood = "Geisterkind";
                    Attribute geisterkind = new Attribute(3,4,4,4);
                    Childhood.skill[4] = 2;
                    Childhood.skill[5] = 2;
                    Childhood.skill[11] = 1;
                    Childhood.skill[2] = 1;
                    Skills geisterkindS = new Skills(skill);
                    break;
            }

        } else if (Main.Char[0] == "Halbling") {
            switch(d){
                case 1:
                    Childhood.childhood = "Bäckerlehrling";
                    Attribute bäckerlehrling = new Attribute(4,4,3,4);
                    Childhood.skill[3] = 2;
                    Childhood.skill[5] = 1;
                    Childhood.skill[9] = 1;
                    Childhood.skill[10] = 1;
                    Childhood.skill[13] = 1;
                    Skills bäckerlehrlingS = new Skills(skill);
                    break;
                case 2:
                    Childhood.childhood = "Arbeiter";
                    Attribute arbeiter = new Attribute( 4,4,3,4);
                    Childhood.skill[0] = 2;
                    Childhood.skill[2] = 1;
                    Childhood.skill[3] = 1;
                    Childhood.skill[10] = 1;
                    Childhood.skill[15] = 1;
                    Skills arbeiterS = new Skills(skill);
                    break;
                case 3:
                    Childhood.childhood = "Handwerker";
                    Attribute handwerker = new Attribute(3,4,4,4);
                    Childhood.skill[3] = 3;
                    Childhood.skill[9] = 1;
                    Childhood.skill[11] = 1;
                    Childhood.skill[2] = 1;
                    Skills handwerkerS = new Skills(skill);
                    break;
                case 4:
                    Childhood.childhood = "Küchenkind";
                    Attribute küchenkind = new Attribute(4,4,3,4);
                    Childhood.skill[3] = 2;
                    Childhood.skill[5] = 1;
                    Childhood.skill[9] = 1;
                    Childhood.skill[10] = 1;
                    Childhood.skill[15] = 1;
                    Skills küchenkindS = new Skills(skill);
                    break;
                case 5:
                    Childhood.childhood = "Bücherwurm";
                    Attribute bücherwurm = new Attribute(3,3,5,4);
                    Childhood.skill[9] = 3;
                    Childhood.skill[11] = 1;
                    Childhood.skill[12] = 1;
                    Childhood.skill[14] = 1;
                    Skills bücherwurmS = new Skills(skill);
                    break;
                case 6:
                    Childhood.childhood = "Einzelgänger";
                    Attribute einzelgänger = new Attribute(4,4,4,3);
                    Childhood.skill[4] = 2;
                    Childhood.skill[5] = 1;
                    Childhood.skill[8] = 1;
                    Childhood.skill[12] = 1;
                    Childhood.skill[2] = 1;
                    Skills einzelgängerS = new Skills(skill);
                    break;
            }
        } else if (Main.Char[0] == "Goblin") {
            switch(d){
                case 1:
                    childhood = "Wolfling";
                    Attribute wolfling = new Attribute(4,5,3,3);
                    Childhood.skill[15] = 2;
                    Childhood.skill[1] = 1;
                    Childhood.skill[2] = 1;
                    Childhood.skill[4] = 1;
                    Childhood.skill[6] = 1;
                    Skills wolflingS = new Skills(skill);
                    break;
                case 2:
                    childhood = "Langfinger";
                    Attribute langfinger = new Attribute(3,5,3,4);
                    Childhood.skill[4] = 2;
                    Childhood.skill[8] = 2;
                    Childhood.skill[11] = 1;
                    Childhood.skill[12] = 1;
                    Skills langfingerS = new Skills(skill);
                    break;
                case 3:
                    childhood = "Kind der Wälder";
                    Attribute kindDerWälder = new Attribute(4,4,4,3);
                    Childhood.skill[10] = 2;
                    Childhood.skill[1] = 1;
                    Childhood.skill[6] = 1;
                    Childhood.skill[7] = 1;
                    Childhood.skill[8] = 1;
                    Skills kindDerWälderS = new Skills(skill);
                    break;
                case 4:
                    childhood = "Wildling";
                    Attribute wildling = new Attribute(4,4,3,4);
                    Childhood.skill[2] = 2;
                    Childhood.skill[6] = 2;
                    Childhood.skill[10] = 1;
                    Childhood.skill[0] = 1;
                    Skills wildlingS = new Skills(skill);
                    break;
                case 5:
                    childhood = "Wanderer";
                    Attribute wanderer = new Attribute(4,4,4,3);
                    Childhood.skill[10] = 2;
                    Childhood.skill[1] = 1;
                    Childhood.skill[2] = 1;
                    Childhood.skill[8] = 1;
                    Childhood.skill[15] = 1;
                    Skills wandererS = new Skills(skill);
                    break;
                case 6:
                    childhood = "Geschichtenerzähler";
                    Attribute geschichtenerzähler = new Attribute(3,4,3,5);
                    Childhood.skill[13] = 3;
                    Childhood.skill[12] = 2;
                    Childhood.skill[9] = 1;
                    Skills geschichtenerzählerS = new Skills(skill);
                    break;
            }
        } else if (Main.Char[0] == "Ork") {
            switch(d){
                case 1:
                    childhood = "Barde";
                    Attribute barde = new Attribute(3,3,4,5);
                    Childhood.skill[13] = 3;
                    Childhood.skill[9] = 1;
                    Childhood.skill[11] = 1;
                    Childhood.skill[12] = 1;
                    Skills bardeS = new Skills(skill);
                    break;
                case 2:
                    childhood = "Arbeiter";
                    Attribute arbeiter = new Attribute(5,4,3,3);
                    Childhood.skill[0] = 2;
                    Childhood.skill[1] = 2;
                    Childhood.skill[3] = 2;
                    Skills arbeiterS = new Skills(skill);
                    break;
                case 3:
                    childhood = "Räuber";
                    Attribute räuber = new Attribute(4,4,4,3);
                    Childhood.skill[2] = 2;
                    Childhood.skill[4] = 1;
                    Childhood.skill[5] = 1;
                    Childhood.skill[8] = 1;
                    Childhood.skill[10] = 1;
                    Skills räuberS = new Skills(skill);
                    break;
                case 4:
                    childhood = "Streuner";
                    Attribute streuner = new Attribute(4,4,3,4);
                    Childhood.skill[10] = 2;
                    Childhood.skill[1] = 1;
                    Childhood.skill[2] = 1;
                    Childhood.skill[8] = 1;
                    Childhood.skill[15] = 1;
                    Skills streunerS = new Skills(skill);
                    break;
                case 5:
                    childhood = "Krieger";
                    Attribute krieger = new Attribute(5,4,3,3);
                    Childhood.skill[2] = 2;
                    Childhood.skill[7] = 2;
                    Childhood.skill[6] = 1;
                    Childhood.skill[0] = 1;
                    Skills kriegerS = new Skills(skill);
                    break;
                case 6:
                    childhood = "Einzelgänger";
                    Attribute einzelgänger = new Attribute(4,3,5,3);
                    Childhood.skill[11] = 2;
                    Childhood.skill[10] = 2;
                    Childhood.skill[2] = 1;
                    Childhood.skill[8] = 1;
                    Skills einzelgängerS = new Skills(skill);
                    break;
            }
        } else if (Main.Char[0] == "Wolfsmensch") {
            switch(d){
                case 1:
                    childhood = "Heuler";
                    Attribute heuler = new Attribute(3,4,4,4);
                    Childhood.skill[13] = 3;
                    Childhood.skill[9] = 1;
                    Childhood.skill[12] = 1;
                    Childhood.skill[10] = 1;
                    Skills heulerS = new Skills(skill);
                    break;
                case 2:
                    childhood = "Jäger";
                    Attribute jäger = new Attribute(4,4,4,3);
                    Childhood.skill[8] = 2;
                    Childhood.skill[10] = 2;
                    Childhood.skill[1] = 1;
                    Childhood.skill[2] = 1;
                    Skills jägerS = new Skills(skill);
                    break;
                case 3:
                    childhood = "Ausgestossener";
                    Attribute ausgestossener = new Attribute(4,3,5,3);
                    Childhood.skill[11] = 2;
                    Childhood.skill[10] = 2;
                    Childhood.skill[2] = 1;
                    Childhood.skill[8] = 1;
                    Skills ausgestossenerS = new Skills(skill);
                    break;
                case 4:
                    childhood = "Fährtenleser";
                    Attribute fährtenleser = new Attribute(3,4,5,3);
                    Childhood.skill[8] = 3;
                    Childhood.skill[4] = 2;
                    Childhood.skill[10] = 1;
                    Skills fährtenleserS = new Skills(skill);
                    break;
                case 5:
                    childhood = "Kämpfer";
                    Attribute kämpfer = new Attribute(5,4,3,3);
                    Childhood.skill[2] = 3;
                    Childhood.skill[0] = 2;
                    Childhood.skill[6] = 1;
                    Skills kämpferS = new Skills(skill);
                    break;
                case 6:
                    childhood = "Kind des Waldes";
                    Attribute kindDesWaldes = new Attribute(3,4,4,4);
                    Childhood.skill[10] = 3;
                    Childhood.skill[9] = 2;
                    Childhood.skill[8] = 1;
                    Skills kindDesWaldesS = new Skills(skill);
                    break;
            }
        } else if (Main.Char[0] == "Zwerg") {
            switch(d){
                case 1:
                    childhood = "Schmiedelehrling";
                    Attribute schmiedelehrling = new Attribute(5,3,4,3);
                    Childhood.skill[3] = 3;
                    Childhood.skill[0] = 1;
                    Childhood.skill[1] = 1;
                    Childhood.skill[2] = 1;
                    Skills schmiedelehrlingS = new Skills(skill);
                    break;
                case 2:
                    childhood = "Minenkind";
                    Attribute minenkind = new Attribute(4,4,4,3);
                    Childhood.skill[1] = 2;
                    Childhood.skill[10] = 2;
                    Childhood.skill[3] = 1;
                    Childhood.skill[8] = 1;
                    Skills minenkindS = new Skills(skill);
                    break;
                case 3:
                    childhood = "Kundschafterlehrling";
                    Attribute kundschafterlehrling = new Attribute(4,4,4,3);
                    Childhood.skill[4] = 2;
                    Childhood.skill[8] = 2;
                    Childhood.skill[10] = 1;
                    Childhood.skill[2] = 1;
                    Skills kundschafterlehrlingS = new Skills(skill);
                    break;
                case 4:
                    childhood = "Wächter in Ausbildung";
                    Attribute wächterInAusbildung = new Attribute(5,4,3,3);
                    Childhood.skill[0] = 2;
                    Childhood.skill[2] = 2;
                    Childhood.skill[7] = 1;
                    Childhood.skill[1] = 1;
                    Skills wächterInAusbildungS = new Skills(skill);
                    break;
                case 5:
                    childhood = "Steinmetz";
                    Attribute steinmetz = new Attribute(4,3,5,3);
                    Childhood.skill[3] = 2;
                    Childhood.skill[9] = 2;
                    Childhood.skill[10] = 1;
                    Childhood.skill[0] = 1;
                    Skills steinmetzS = new Skills(skill);
                    break;
                case 6:
                    childhood = "Harte Lehrjahre";
                    Attribute harteLehrjahre = new Attribute(3,3,5,4);
                    Childhood.skill[9] = 3;
                    Childhood.skill[3] = 1;
                    Childhood.skill[11] = 1;
                    Childhood.skill[12] = 1;
                    Skills harteLehrjahreS = new Skills(skill);
                    break;
            }
        } else if (Main.Char[0] == "Elf") {
            switch(d){
                case 1:
                    childhood = "Einzelgänger";
                    Attribute einzelgänger = new Attribute(4,3,5,3);
                    Childhood.skill[11] = 2;
                    Childhood.skill[10] = 2;
                    Childhood.skill[2] = 1;
                    Childhood.skill[8] = 1;
                    Skills einzelgängerS = new Skills(skill);
                    break;
                case 2:
                    childhood = "Kämpfer";
                    Attribute kämpfer = new Attribute(4,5,3,3);
                    Childhood.skill[2] = 2;
                    Childhood.skill[7] = 2;
                    Childhood.skill[0] = 1;
                    Childhood.skill[1] = 1;
                    Skills kämpferS = new Skills(skill);
                    break;
                case 3:
                    childhood = "Kind des Waldes";
                    Attribute kindDesWaldes = new Attribute(3,4,4,4);
                    Childhood.skill[10] = 3;
                    Childhood.skill[9] = 2;
                    Childhood.skill[8] = 1;
                    Skills kindDesWaldesS = new Skills(skill);
                    break;
                case 4:
                    childhood = "Harte Lehrjahre";
                    Attribute harteLehrjahre = new Attribute(3,3,5,4);
                    Childhood.skill[9] = 3;
                    Childhood.skill[3] = 1;
                    Childhood.skill[11] = 1;
                    Childhood.skill[12] = 1;
                    Skills harteLehrjahreS = new Skills(skill);
                    break;
                case 5:
                    childhood = "Wanderer";
                    Attribute wanderer = new Attribute(4,4,3,4);
                    Childhood.skill[10] = 2;
                    Childhood.skill[1] = 1;
                    Childhood.skill[2] = 1;
                    Childhood.skill[8] = 1;
                    Childhood.skill[15] = 1;
                    Skills wandererS = new Skills(skill);
                    break;
                case 6:
                    childhood = "Druidenlehrling";
                    Attribute druidenlehrling = new Attribute(3,4,5,3);
                    Childhood.skill[10] = 2;
                    Childhood.skill[8] = 1;
                    Childhood.skill[9] = 1;
                    Childhood.skill[14] = 1;
                    Childhood.skill[15] = 1;
                    Skills druidenlehrlingS = new Skills(skill);
                    break;
            }
        } else {
            System.out.println("Fehler!!!");
        }
    }
}
