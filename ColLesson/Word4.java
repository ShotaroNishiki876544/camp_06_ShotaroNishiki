package ColLesson;

import java.util.ArrayList;
import java.util.Scanner;

public class Word4 {

//    String[] wordRem=new String[5];
//    String[] meanRem=new String[5];
    ArrayList<String> arrayWord=new ArrayList<>();
    ArrayList<String> arrayMeaning=new ArrayList<>();

    int number;
    String input="";
    int i=0;
    Scanner scanner = new Scanner(System.in);


    public Word4(){

    }

    public void Remember(){

        while( !(input.equals("e")) ){

            input=scanner.nextLine();

            if( !(input.equals("e")) ){
                String[] inputs=input.split(" ");
                try {
//                    wordRem[i] = inputs[0];
//                    meanRem[i] = inputs[1];
                    arrayWord.add(inputs[0]);
                    arrayMeaning.add(inputs[1]);
                    i+=1;
                    number=i;

                    System.out.println("次の単語と意味を入力してください。\"e\"で終了します。");


                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("登録制限を超えました。登録済みのデータは以下です。");
                    input="e";
                }

            }

        }


    }



    public void Recall(){

        for (int j=0; j<number ;j++) {
            System.out.println(arrayWord.get(j) + " " +arrayMeaning.get(j));

        }
    }


}
