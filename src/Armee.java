public class Armee
{
    Warteschlange warteschlange;

    public Armee()
    {
        Warteschlange warteschlange = new Warteschlange();
        warteschlange.hintenEinfuegen(new Ritter("Max"));
        warteschlange.hintenEinfuegen(new Ritter("Alfred"));
        warteschlange.hintenEinfuegen(new Ritter("Müller"));
        warteschlange.hintenEinfuegen(new Ritter("Jim"));

        warteschlange.einfuegen(1, new Ritter("Benjamin"));


        warteschlange.ausgeben();


        warteschlange.vorneEntfernen();
        warteschlange.vorneEntfernen();
        warteschlange.vorneEntfernen();
        warteschlange.vorneEntfernen();
        
        warteschlange.ausgeben();

    }
    
}
