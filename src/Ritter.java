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

    
}
