public class Warteschlange
{
    private Knoten anfang;

    public Warteschlange()
    {
        this.anfang = null;
    }

    public void hintenEinfuegen(Datenelement datenelement)
    {
        if (this.anfang == null)
        {
            this.anfang = new Knoten(0, datenelement);
            return;
        }
        this.anfang.hintenEinfuegen(datenelement);

    }

    public Datenelement vorneEntfernen()
    {
        if (this.anfang == null) return null;
        Datenelement datenelement = anfang.getDatenelement();
        this.anfang = anfang.getNachfolger();
        return datenelement;
    }

    public int laenge()
    {
        if (this.anfang == null) return 0;
        return anfang.laenge();
    }

    public void ausgeben()
    {
        Knoten e = this.anfang;
        while (e != null)
        {
            System.out.println(e.informationAusgeben() + ": " + e.getIndex());
            e = e.getNachfolger();
        }
    }

    public Datenelement endeGeben()
    {
        Knoten e = this.anfang;
        while (e.getNachfolger() != null)
        {
            e = e.getNachfolger();
        }
        return e.getDatenelement();
        
    }

    public Datenelement[] datenGeben()
    {
        Knoten[] konten = new Knoten[laenge()];
        return null;
    }

    public Datenelement datenGeben(int i)
    {
        Knoten k = this.anfang;
        while (k != null)
        {
            if (k.getIndex() == i) return k.getDatenelement();
            k = k.getNachfolger();
        }
        return null;
    }

    public void vorneEinfuegen(Datenelement datenelement)
    {
        Knoten knoten = new Knoten(-1, datenelement);
        knoten.setNachfolger(this.anfang);
        this.anfang = knoten;
        knoten.rekursivInkrementiereIndex();
    }

    public void endeEntfernen()
    {
        if (anfang == null) return;
        anfang.endeEntfernen();
    }

    public void knotenEntfernen(Datenelement datenelement)
    {
        if (this.anfang == null) return;
        this.anfang.knotenEntfernen(datenelement);
    }

    public void einfuegenVor(Datenelement datenelement, Datenelement neuesDatenelement)
    {
        if (this.anfang == null) return;
        this.anfang.einfuegenVor(datenelement, neuesDatenelement);
    }

    public void sotiertEinfuegen(Datenelement datenelement)
    {
        if (this.anfang == null)
        {
            this.anfang = new Knoten(0, datenelement);
            return;
        }
        this.anfang = this.anfang.sortiertEinfuegen(datenelement);
    }

    public void sortieren()
    {
        if(anfang == null) return;

        for (int i = 0; i < this.laenge(); i++) anfang.sortieren();
    }

}