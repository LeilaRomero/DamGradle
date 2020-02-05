import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


import java.io.IOException;

public class ElTiempo {
    public static void main(String[]args) throws IOException {

        Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Mozilla").get();
        Element miElemento= doc.select("div").first();
        String miTexto=miElemento.text();
                System.out.println(miTexto);
    }

}
