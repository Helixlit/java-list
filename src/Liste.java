import java.util.logging.Logger;

public class Liste
{
    private Listenelement anfang;

    final Logger logger = LoggerFactory.getLogger(Liste.class);

    public Liste()
    {
        this.anfang = new Abschluss(0);
    }

    public void ausgeben()
    {
        System.out.println("Liste:");
        this.anfang.ausgeben(); 
    }

    public int gebeLaenge()
    {
        return this.anfang.gebeLaenge();
    }

    public void einfuegenHinten(Datenelement datenelement)
    {
        this.anfang = this.anfang.einfuegenHinten(datenelement);
    }

    public Datenelement entfernenHinten()
    {
        Knoten knoten = new Knoten(null, -1, null);

        Datenelement datenelement = this.anfang.entfernenHinten(null, knoten);

        if (knoten.gebeNachfolger() instanceof Abschluss) this.anfang = knoten.gebeNachfolger();

        if (datenelement == null) this.logger.warning("Kein Knoten zum entfernen vorhanden!");
        else this.logger.info(datenelement+" wurde entfernt.");

        return datenelement;
    }
}