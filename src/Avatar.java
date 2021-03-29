
import history.*;
import stats.Attribute;
import stats.Skills;

import java.util.HashSet;

public class Avatar {
    private final Attribute attribute;
    private final Skills skills;
    private final Race race;
    private final Homeregion homeregion;
    private final Childhood childhood;
    private final Job job;
    private final JobSkill jobSkill;
    private final ImportantEvent importantEvent;
    private HashSet<String> inventory;

    public Avatar() {
        this.attribute = new Attribute(0, 0, 0, 0);
        this.skills = new Skills();
        this.race = new Race();
        this.homeregion = new Homeregion(this.race.getRaceInt());
        this.childhood = new Childhood(attribute, this.skills, race.getRaceName());
        this.job = new Job();
        this.jobSkill = new JobSkill(job.getJobInt());
        this.importantEvent = new ImportantEvent(job.getJobInt(), skills);
        this.inventory = new HashSet<>();
    }

    public void printChar() {
        System.out.println("Volk: " + race.getRaceName());
        System.out.println("Heimatregion: " + homeregion.getHomeregion());
        System.out.println("Kindheit: " + childhood.getChildhood());
        System.out.println("Beruf: " + job.getJob());
        System.out.println("Berufstalent: " + jobSkill.getJobSkill());
        System.out.println("Prägende Ereignisse: " + importantEvent.getImportantEvents());
    }

    public void printSkills() {
        System.out.println(skills.skillTree());
    }

    public void printAttributes() {
        System.out.println(attribute.printAttributes());

    }
}
