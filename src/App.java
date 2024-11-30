import java.util.logging.Level;
import java.util.logging.Logger;

public class App
{
    final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) throws Exception
    {
        Logger rootLogger = Logger.getLogger("");
        rootLogger.setLevel(Level.INFO);


        Liste liste = new Liste();

        liste.einfuegenHinten(new Ritter("Max"));
        liste.einfuegenHinten(new Ritter("Lean"));
        liste.einfuegenHinten(new Ritter("John"));
        liste.ausgeben();
        liste.entfernenHinten();
        liste.ausgeben();
    }
}
