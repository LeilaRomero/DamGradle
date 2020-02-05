import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;

public class ElTiempo {
    public static void main(String[]args) throws IOException {

        Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Mozilla").get();
        Elements miElemento= doc.getElementsByClass("today_nowcard-temp");
        Elements misElemento= doc.getElementsByClass("today_nowcard-phrase");
        String misElementos= doc.title();
        String miTexto=miElemento.text();
        String misTextos=misElemento.text();
                System.out.println("La página es"+ "La temperaturaes de:" +miTexto+ " "+misTextos);
    }

}
