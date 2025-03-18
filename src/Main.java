import Language.*;

public class Main {
    public static void main(String[] args) {
        Language myLang = new Language ("Chibchombiano", 5000000,"south America", "Sujeto - Verbo - Predicado ");
        myLang.getInfo();

        Mayan akatek = new Mayan("Akatek", 45430);
        akatek.getInfo();

        SinoTibetan mandarin = new SinoTibetan("Mandarin",1140000000);
        mandarin.getInfo();
        SinoTibetan burmese = new SinoTibetan("Burmese",42900000);
        burmese.getInfo();
    }
}
