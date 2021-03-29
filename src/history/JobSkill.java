package history;

import logic.DiceRoller;

public class JobSkill {
    private String jobSkill;
    private final String[][] jobSkillsList = new String[8][4];

    public JobSkill(int jobInt) {
        generateJobSkill();
        findJobskill(jobInt);

    }

    private void findJobskill(int jobInt) {
        int d = DiceRoller.d4(1);
        int w = DiceRoller.d3(1);

        if (7 == jobInt) {
            jobSkill = jobSkillsList[jobInt][d - 1];
        } else {
            jobSkill = jobSkillsList[jobInt][w - 1];
        }

    }

    private void generateJobSkill() {
        //Druide
        this.jobSkillsList[0][0] = "Der Weg der Heilung";
        this.jobSkillsList[0][1] = "Der Weg der Gestalwandelung";
        this.jobSkillsList[0][2] = "Der Weg der Hellsicht";
        //Kämpfer
        this.jobSkillsList[1][0] = "Der Weg der Klinge";
        this.jobSkillsList[1][1] = "Der Weg des Schildes";
        this.jobSkillsList[1][2] = "Der Weg des Feindes";
        //Jäger
        this.jobSkillsList[2][0] = "Der Weg des Tieres";
        this.jobSkillsList[2][1] = "Der Weg des Pfeils";
        this.jobSkillsList[2][2] = "Der Weg des Waldes";
        //Barde
        this.jobSkillsList[3][0] = "Der Weg des Liedes";
        this.jobSkillsList[3][1] = "Der Weg des Lobgesanges";
        this.jobSkillsList[3][2] = "Der Weg des Kampfschreis";
        //Händler
        this.jobSkillsList[4][0] = "Der Weg des Goldes";
        this.jobSkillsList[4][1] = "Der Weg der vielen Dinge";
        this.jobSkillsList[4][2] = "Der Weg der Lügen";
        //Reiter
        this.jobSkillsList[5][0] = "Der Weg des Gefährten";
        this.jobSkillsList[5][1] = "Der Weg des Ritters";
        this.jobSkillsList[5][2] = "Der Weg der Ebenen";
        //Schurke
        this.jobSkillsList[6][0] = "Der Weg der Maske";
        this.jobSkillsList[6][1] = "Der Weg des Giftes";
        this.jobSkillsList[6][2] = "Der Weg des Meuchlers";
        //Zauberer
        this.jobSkillsList[7][0] = "Der Weg der Zeichen";
        this.jobSkillsList[7][1] = "Der Weg des Steins";
        this.jobSkillsList[7][2] = "Der Weg des Blutes";
        this.jobSkillsList[7][3] = "Der Weg des Todes";
    }

    public String getJobSkill() {
        return this.jobSkill;
    }
}
