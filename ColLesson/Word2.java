package ColLesson;

public class Word2 {

    String[] wordRem=new String[10];
    String[] meanRem=new String[10];
    int number;


    public Word2(){

    }

    public void Remember(int i,String word,String meaning){
        this.wordRem[i]=word;
        this.meanRem[i]=meaning;
//        System.out.println(word);
//        System.out.println(meaning);



        number=i;
    }

    public void Recall(){

        for (int j=0; j<=number ;j++) {
            System.out.println(this.wordRem[j] + " " + this.meanRem[j]);

        }
    }


}
