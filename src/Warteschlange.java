public class Warteschlange
{
    private Knoten anfang;
    private Knoten ende;

    public Warteschlange()
    {
        this.anfang = null;
        this.ende   = null;
    }

    public void hintenEinfuegen(Knoten e)
    {
        if (this.anfang == null)
        {
            this.anfang = e;
            this.ende   = e;
            return;
        }
        else
        {
            this.ende.setNachfolger(e);
        }

        this.ende = e;
    }

    public void hintenEinfuegen(Datenelement datenelement)
    {
        int index;
        if (this.ende == null) index = 0;
        else index = ende.getIndex() + 1;

        Knoten e = new Knoten(index, datenelement);

        hintenEinfuegen(e);
    }

    public void einfuegen(int index, Datenelement datenelement)
    {
        Knoten eNeu = new Knoten(-1, datenelement);

        Knoten e = this.anfang;
        int i = this.anfang.getIndex();
        while (i != index-1)
        {
            if (e.getNachfolger() == null)
            {
                System.out.println("Einfuegen nicht moeglich! Index nicht in der Liste!");
            } 
            e = e.getNachfolger();
            i = e.getIndex();
        }

        eNeu.setIndex(i + 1);
        eNeu.setNachfolger(e.getNachfolger());
        e.setNachfolger(eNeu);

        eNeu.getNachfolger().rekursivInkrementiereIndex();
    }

    public Datenelement vorneEntfernen()
    {
        if (this.anfang == null) return null;

        Knoten element = this.anfang;
        this.anfang = anfang.getNachfolger();
        
        if (this.anfang == null) this.ende = element;

        else
        {
            this.anfang.rekursivDekrementiereIndex();
        }

        return element.getDatenelement();
    }

    public int laenge()
    {
        return this.ende.getIndex() + 1;
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

}
