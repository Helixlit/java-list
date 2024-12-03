public abstract class Listenelement
{
    int index;

    abstract Datenelement entfernenVorne(Liste liste);
    abstract Datenelement entfernenHinten(Knoten vorvorgaenger, Knoten vorgaenger);
    abstract Datenelement entfernen(Datenelement datenelement);
    abstract Datenelement entfernen(int index);

    abstract void einfuegenNach(Datenelement datenelement);
    abstract Knoten einfuegenHinten(Datenelement datenelement);

    abstract Knoten sortiertEinfuegen(Datenelement datenelement);

    abstract int  gebeLaenge();

    abstract void dekrementiere();
    abstract void inkrementiere();

    abstract Datenelement gebeDaten(Datenelement vorgaenger);
    abstract Datenelement gebeDaten(int index);

    public abstract Datenelement gebeDatenelement();
    public abstract int gebeIndex();

    abstract void ausgeben();
}
