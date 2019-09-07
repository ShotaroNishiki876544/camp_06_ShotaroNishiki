package ColLesson;

public class Word {

    String[] wordRem=new String[10];
    String[] meanRem=new String[10];


    public Word(){

    }

    public void Remember(int i,String word,String meaning){
        this.wordRem[i]=word;
        this.meanRem[i]=meaning;
//        System.out.println(word);
//        System.out.println(meaning);
    }

    public void Recall(int i){
        System.out.println(wordRem[i]+" "+meanRem[i]);
    }


}
