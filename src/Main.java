// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        RPG_character Adam = new RPG_character("Adam",5,10);
        Adam.ShowStat();
        System.out.println("Adam Being Attacked. ");
        Adam.LevelUp();
        Sword LightSaber = new Sword(99,99);
        Adam.Equip(LightSaber);
        Adam.ShowStat();
        LightSaber.LevelUp();
        Adam.ShowStat();
    }
}