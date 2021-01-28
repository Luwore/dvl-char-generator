package stats;

public class Attribute {
    private int stärke;
    private int geschicklichkeit;
    private int verstand;
    private int empathie;

    public Attribute(final int stärke, final int geschicklichkeit, final int verstand, final int empathie) {
        this.stärke = stärke;
        this.geschicklichkeit = geschicklichkeit;
        this.verstand = verstand;
        this.empathie = empathie;
    }

    public void printAttributes() {
        final String attributes =
            "  Stärke " + this.stärke + "\n  Geschicklichkeit " + this.geschicklichkeit + "\n  Verstand " + this.verstand +
                "\n  Empathie " + this.empathie;
    }

    public int getStärke() {
        return this.stärke;
    }

    public void setStärke(int stärke) {
        this.stärke = stärke;
    }

    public int getGeschicklichkeit() {
        return this.geschicklichkeit;
    }

    public void setGeschicklichkeit(int geschicklichkeit) {
        this.geschicklichkeit = geschicklichkeit;
    }

    public int getVerstand() {
        return this.verstand;
    }

    public void setVerstand(int verstand) {
        this.verstand = verstand;
    }

    public int getEmpathie() {
        return this.empathie;
    }

    public void setEmpathie(int empathie) {
        this.empathie = empathie;
    }
}
