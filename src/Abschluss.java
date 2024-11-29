
public class Abschluss extends Listenelement
{
    Datenelement entfernen(Datenelement vorgaenger)
    {
        return vorgaenger;
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
        return new Knoten(datenelement, this.index);
    }

    int  gebeLaenge()
    {
        return 0;
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
        return vorgaenger;
    }

    Datenelement gebeDaten(int index)
    {
        return null;
    }

    public Datenelement gebeDatenelement()
    {
        return null;
    }

    public int gebeIndex()
    {
        return 0;
    }
    
}
