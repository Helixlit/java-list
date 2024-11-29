public abstract class Listenelement
{
    int index;

    abstract Datenelement entfernen();
    abstract Datenelement entfernen(Datenelement datenelement);
    abstract Datenelement entfernen(int index);

    abstract void einfuegenVor(Datenelement datenelement);
    abstract void einfuegenNach(Datenelement datenelement);
    abstract Knoten einfuegenHinten(Datenelement datenelement);

    abstract int  gebeLaenge();

    abstract void dekrementiere();
    abstract void inkrementiere();

    abstract Datenelement gebeDaten(Datenelement vorgaenger);
    abstract Datenelement gebeDaten(int index);

    public abstract Datenelement gebeDatenelement();
    public abstract int gebeIndex();
}
