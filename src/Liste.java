public class Liste
{
    private Knoten anfang;

    public Liste()
    {
        this.anfang = null;
    }

    public ausgeben()
    {
        Listenelement element = this.anfang;
        while(element instanceof Knoten)
        {
            System.out.println(element.gebeDatenelement()+" at index: " + element.getIndex());
        }
    }

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

    Datenelement gebeDaten()
    {
        return null;
    }

    Datenelement gebeDaten(int index)
    {
        return null;
    }
   
}