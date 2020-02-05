import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


import java.io.IOException;

public class ElTiempo {
    public static void main(String[]args) throws IOException {

        Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Mozilla").get();
        Element miElemento= doc.getElementsByClass("div class=today_nowcard-temp").first();
       // Element misElemento= doc.getElementsByClass("div class=today_nowcard-phrase").first();

                System.out.println(miElemento);
    }

}
