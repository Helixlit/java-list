

public class Knoten extends Listenelement
{
    private Listenelement nachfolger;
    private Datenelement datenelement;

    public Knoten(Datenelement datenelement, int index, Listenelement nachfloger)
    {
        this.datenelement = datenelement;
        this.index = index;
        this.nachfolger = nachfloger;
    }

    Datenelement entfernenVorne(Liste liste)
    {
        this.nachfolger.dekrementiere();
        liste.setzeAnfang(this.nachfolger);
        return this.datenelement;
    }

    Datenelement entfernenHinten(Knoten vorvorgaenger, Knoten vorgaenger)
    {
        return this.nachfolger.entfernenHinten(vorgaenger, this); 
    }
    
    Datenelement entfernen(Datenelement datenelement)
    {
        return null;
    }

    Datenelement entfernen(int index)
    {
        return null;
    }

    void einfuegenNach(Datenelement datenelement)
    {
        return;
    }

    Knoten einfuegenHinten(Datenelement datenelement)
    {
        this.nachfolger = this.nachfolger.einfuegenHinten(datenelement);
        return this;
    }

    Knoten sortiertEinfuegen(Datenelement datenelement)
    {
        if (this.datenelement.istKleinerAls(datenelement))
            this.nachfolger = this.nachfolger.sortiertEinfuegen(datenelement);
        else 
        {
            this.inkrementiere();
            return new Knoten(datenelement, this.index-1, this);
        }
        return this;
    }

    int gebeLaenge()
    {
        return gebeLaenge() + 1;
    }

    void dekrementiere()
    {
        this.index--;
        this.nachfolger.dekrementiere();
    }

    void inkrementiere()
    {
        this.index++;
        this.nachfolger.inkrementiere();
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

    public Listenelement gebeNachfolger()
    {
        return this.nachfolger;
    }

    public void setzeNachfolger(Listenelement nachfolger)
    {
        this.nachfolger = nachfolger;
    }

    void ausgeben()
    {
        System.out.println("Index: "+this.index+" "+this.datenelement.informationAusgeben());
        this.nachfolger.ausgeben();
    }

}
