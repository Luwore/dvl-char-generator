public class Attribute {
    private static int stärke;
    private static int geschicklichkeit;
    private static int verstand;
    private static int empathie;

    public Attribute(int stärke, int geschicklichkeit, int verstand, int empathie) {
        this.stärke = stärke;
        this.geschicklichkeit = geschicklichkeit;
        this.verstand = verstand;
        this.empathie = empathie;

        Main.Char[3] = "  Stärke " + stärke + "\n  Geschicklichkeit " + geschicklichkeit + "\n  Verstand " + verstand + "\n  Empathie " + empathie;
    }

    public static int getStärke() {
        return Attribute.stärke;
    }

    public static void setStärke(final int stärke) {
        Attribute.stärke = stärke;
    }

    public static int getGeschicklichkeit() {
        return Attribute.geschicklichkeit;
    }

    public static void setGeschicklichkeit(final int geschicklichkeit) {
        Attribute.geschicklichkeit = geschicklichkeit;
    }

    public static int getVerstand() {
        return Attribute.verstand;
    }

    public static void setVerstand(final int verstand) {
        Attribute.verstand = verstand;
    }

    public static int getEmpathie() {
        return Attribute.empathie;
    }

    public static void setEmpathie(final int empathie) {
        Attribute.empathie = empathie;
    }
}
