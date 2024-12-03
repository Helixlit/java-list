public class Abschluss extends Listenelement
{
    public Abschluss(int index)
    {
        this.index = index;
    }

    Datenelement entfernenVorne(Liste liste)
    {
        return null;
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

    Knoten einfuegenHinten(Datenelement datenelement)
    {
        this.index++;
        return new Knoten(datenelement, this.index-1, this);
    }

    Knoten sortiertEinfuegen(Datenelement datenelement)
    {
        return new Knoten(datenelement, this.index++, this);
    }

    int  gebeLaenge()
    {
        return 0;
    }

    void dekrementiere()
    {
        this.index--;
    }

    void inkrementiere()
    {
        this.index++;
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
