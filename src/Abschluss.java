public class Abschluss extends Listenelement
{
    public Abschluss(int index)
    {
        this.index = index;
    }

    Datenelement entfernenHinten(Knoten vorvorgaenger, Knoten vorgaenger)
    {
        if (vorvorgaenger == null) return null;
        vorvorgaenger.setzeNachfolger(this);
        this.index--;
        return vorgaenger.gebeDatenelement();
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
        this.index++;
        return new Knoten(datenelement, this.index-1, this);
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
        return this.index;
    }

    void ausgeben()
    {
        System.out.println("Index: "+this.index+" Abschluss");
        
    }
    
}
