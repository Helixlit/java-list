public class Knoten
{
    private Knoten nachfolger;
    private int index;
    private Datenelement datenelement;

    public Knoten(int index, Datenelement datenelement)
    {
        this.index = index;
        this.datenelement = datenelement;
    }

    public Knoten getNachfolger()
    {
        return nachfolger;
    }

    public void setNachfolger(Knoten nachfolger)
    {
        this.nachfolger = nachfolger;
    }

    public Datenelement getDatenelement() { return this.datenelement; } 

    public void setDatenelement(Datenelement datenelement) { this.datenelement = datenelement; }

    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public void rekursivInkrementiereIndex()
    {
        rekursivInkrementiereIndex(this);
    }

    private void rekursivInkrementiereIndex(Knoten knoten)
    {
        knoten.index++;
        if (knoten.nachfolger == null) return;
        rekursivInkrementiereIndex(knoten.nachfolger);
    } 

    public void rekursivDekrementiereIndex()
    {
        rekursivDekrementiereIndex(this);
    }

    private void rekursivDekrementiereIndex(Knoten knoten)
    {
        knoten.index--;
        if (knoten.nachfolger == null) return;
        rekursivDekrementiereIndex(knoten.nachfolger);
    }

    public String informationAusgeben()
    {
        return this.datenelement.informationAusgeben();
    }

    public Datenelement rekursivGetDatenelement(Knoten knoten, int index)
    {
        if (knoten.getIndex() == index) return knoten.getDatenelement();
        if (knoten.getNachfolger() == null) return null;
        return rekursivGetDatenelement(knoten.getNachfolger(), ++index);
    }

    public Knoten endeEntfernen()
    {
        if (this.getNachfolger() == null)
        {
            this.setNachfolger(null);
            return null;
        }
        this.nachfolger = this.nachfolger.endeEntfernen();
        return this;
    }

    public void knotenEntfernen(Datenelement datenelement)
    {
        if (this.nachfolger.datenelement.equals(datenelement)) this.nachfolger = this.nachfolger.nachfolger;
        this.nachfolger.knotenEntfernen(datenelement);
    }

    public void hintenEinfuegen(Datenelement datenelement)
    {
        if (this.nachfolger == null) this.nachfolger = new Knoten(++this.index, datenelement);
        this.nachfolger.hintenEinfuegen(datenelement);
    }

    public int laenge()
    {
        if (this.nachfolger == null) return 1;
        return this.nachfolger.laenge()+1;
    }

    public void einfuegenVor(Datenelement datenelement, Datenelement neuDatenelement)
    {
        if (this.datenelement.equals(datenelement))
        {
            Knoten knoten = new Knoten(++this.index, neuDatenelement);
            knoten.setNachfolger(this.nachfolger);
            this.nachfolger = knoten;
            return;
        }
        this.nachfolger.einfuegenVor(datenelement, neuDatenelement);
    }

}
