package Language;

public class SinoTibetan extends Language {
    public SinoTibetan(String name,int numSpeakers) {
        super(name,numSpeakers,"Asia","subject-object-verb");
        if (this.name.equals("Chinese")){
            this.wordOrder = "subject-verb-object";
        }
    }
}
