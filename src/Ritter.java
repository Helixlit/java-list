public class Ritter implements Datenelement {
    String name;

    public Ritter(String name)
    {
        this.name = name;
    }

    @Override
    public String informationAusgeben() {
        return this.name;
    }

    @Override
    public boolean istKleinerAls(Datenelement datenelement)
    {
        return this.name.compareTo(datenelement.informationAusgeben()) < 0;
    }
}
