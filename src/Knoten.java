public class Knoten extends Listenelement
{
    private Listenelement nachfolger;
    private Datenelement datenelement;

    public Knoten(Datenelement datenelement, int index)
    {
        this.datenelement = datenelement;
        this.index = index;
    }

    Datenelement entfernen()
    {

    }
    
    Datenelement entfernen(Datenelement datenelement)
    {
        return null;
    }

    Datenelement entfernen(int index)
    {
        return null;
    }

    void einfuegenVor(Datenelement datenelement)
    {
        return;
    }

    void einfuegenNach(Datenelement datenelement)
    {
        return;
    }

    Knoten einfuegenHinten(Datenelement datenelement)
    {
        this.nachfolger.einfuegenHinten(datenelement);
        return this;
    }

    int gebeLaenge()
    {
        return gebeLaenge() + 1;
    }

    void dekrementiere()
    {
        return;
    }

    void inkrementiere()
    {
        return;
    }

    Datenelement gebeDaten(Datenelement vorgaenger)
    {
        return gebeDaten(this.datenelement);
    }

    Datenelement gebeDaten(int index)
    {
        if(this.index == index) return this.datenelement;
        return this.nachfolger.gebeDaten(index);
    }

    public Datenelement gebeDatenelement()
    {
        return this.datenelement;
    }

    public int gebeIndex()
    {
        return this.index;
    }

}
