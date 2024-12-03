import java.util.logging.Level;
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

    public void einfuegenVorne(Datenelement datenelement)
    {
        this.anfang.inkrementiere();
        this.anfang = new Knoten(datenelement, 0, this.anfang);
    }

    public void einfuegenHinten(Datenelement datenelement)
    {
        this.anfang = this.anfang.einfuegenHinten(datenelement);
    }

    public void sortiertEinfuegen(Datenelement datenelement)
    {
        this.anfang = this.anfang.sortiertEinfuegen(datenelement);
    }

    public Datenelement entfernenHinten()
    {
        Knoten knoten = new Knoten(null, -1, null);

        Datenelement datenelement = this.anfang.entfernenHinten(null, knoten);

        if (knoten.gebeNachfolger() instanceof Abschluss) this.anfang = knoten.gebeNachfolger();

        if (datenelement == null) this.logger.warning("Kein Knoten zum entfernen vorhanden!");
        else this.logger.log(Level.INFO, "{0} wurde entfernt.", datenelement);

        return datenelement;
    }

    public Datenelement entfernenVorne()
    {
        return this.anfang.entfernenVorne(this);
    }

    public void setzeAnfang(Listenelement listenelement)
    {
        this.anfang = listenelement;
    }
}