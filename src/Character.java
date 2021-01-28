
import history.Childhood;
import history.Homeregion;
import history.Race;
import stats.Attribute;
import stats.Skills;

public class Character {
    private final Attribute attribute;
    private final Skills skills;
    private final Race race;
    private final Homeregion homeregion;
    private final Childhood childhood;

    public Character() {
        this.attribute = new Attribute(0, 0, 0, 0);
        this.skills = new Skills();
        this.race = new Race();
        this.homeregion = new Homeregion(this.race.getRaceInt());
        this.childhood = new Childhood(this.skills, race.getRaceName());

    }

    public void printChar() {
        System.out.println(race.getRaceName() +"; " + homeregion.getHomeregion() + "; " + childhood.getChildhood());
    }
}
