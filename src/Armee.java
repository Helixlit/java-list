public class Armee
{
    Warteschlange warteschlange;

    public Armee()
    {
        Warteschlange warteschlange = new Warteschlange();
        warteschlange.hintenEinfuegen(new Ritter("Maincharakter"));

        warteschlange.hintenEinfuegen(new Ritter("Apo Red"));

        warteschlange.hintenEinfuegen(new Ritter("Test 1"));

        warteschlange.ausgeben();

        warteschlange.sotiertEinfuegen(new Ritter("Benjamin"));

        warteschlange.ausgeben();
    }
    
}
