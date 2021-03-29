package history;

import logic.DiceRoller;

public class Job {
    private String job;
    private int jobInt;

    public Job() {
        this.job = generateJob();
    }

    private String generateJob() {
        final int i = DiceRoller.d66();
        if (i < 15) {
            this.jobInt = 0;
            return "Druide";
        } else if (i < 24) {
            this.jobInt = 1;
            return "Kämpfer";
        } else if (i < 34) {
            this.jobInt = 2;
            return "Jäger";
        } else if (i < 43) {
            this.jobInt = 3;
            return "Barde";
        } else if (i < 51) {
            this.jobInt = 4;
            return "Händler";
        } else if (i < 55) {
            this.jobInt = 5;
            return "Reiter";
        } else if (i < 63) {
            this.jobInt = 6;
            return "Schurke";
        } else if (i <= 66) {
            this.jobInt = 7;
            return "Zauberer";
        } else {
            return "Fehler";
        }
    }

    public int getJobInt() {
        return this.jobInt;
    }

    public String getJob() {
        return this.job;
    }
}
