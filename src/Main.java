public class Main {
    public static String[] Char = new String[7];
    public static void main(String[] args) {
        Char[0] = Race.volk();
        Childhood.childhood();
        Char[2] = Childhood.childhood;
        System.out.println(Char[0] + "\n" + Char[1] +
                "\n" + Char[2] + "\n" + Char[3] + "\n" + Char[4]);
    }
}
