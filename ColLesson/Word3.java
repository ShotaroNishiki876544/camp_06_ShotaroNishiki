package ColLesson;

import java.util.Scanner;

public class Word3 {

    String[] wordRem=new String[5];
    String[] meanRem=new String[5];
    int number;
    String input="";
    int i=0;
    Scanner scanner = new Scanner(System.in);


    public Word3(){

    }

    public void Remember(){

        while( !(input.equals("e")) ){

            input=scanner.nextLine();

            if( !(input.equals("e")) ){
                String[] inputs=input.split(" ");
                try {
                    wordRem[i] = inputs[0];
                    meanRem[i] = inputs[1];
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
            System.out.println(this.wordRem[j] + " " + this.meanRem[j]);

        }
    }


}
