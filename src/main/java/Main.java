import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Document document = null;
        try {
            document = Jsoup.
                    connect("https://www.pracuj.pl/praca/java;kw/gdynia;wp?rd=30").get();
            Elements element = document.getElementsByClass("results-header__offer-count-text-number");
            System.out.println("ilość ofert pracy Java w Gdyni: "+element.get(0).text());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
