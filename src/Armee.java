public class Armee
{
    Warteschlange warteschlange;

    public Armee()
    {
        Warteschlange warteschlange = new Warteschlange();
        Ritter max = new Ritter(Max)
        warteschlange.hintenEinfuegen(new Ritter("Main"));
        warteschlange.hintenEinfuegen(new Ritter("Alfred"));
        warteschlange.hintenEinfuegen(max);
        warteschlange.hintenEinfuegen(new Ritter("Jim"));

        warteschlange.einfuegen(1, new Ritter("Benjamin"));


        warteschlange.ausgeben();



        warteschlange.endeEntfernen();
    
        
        warteschlange.ausgeben();

    }
    
}
