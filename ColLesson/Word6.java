package ColLesson;

public class Word6 {

    public String word;
    public String meaning;

    public Word6(String word, String meaning){
        this.word=word;
        this.meaning=meaning;

    }

    @Override
    public String toString() {
        return this.word + " " + this.meaning;


    }
}
