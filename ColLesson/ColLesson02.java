package ColLesson;

import java.util.Scanner;

public class ColLesson02 {
    public static void main(String[] args) {

        //toString()使いどころ分からず
        Word2 memo=new Word2();

        Scanner scanner = new Scanner(System.in);

        String aa="aa";
        String bb="bb";

        String input;
        input="a a";
        int i=0;

        System.out.println("分からなかった単語とその意味をスペースを区切って入力してください。");

         while( !(input.equals("e")) ){

             input=scanner.nextLine();

             if( !(input.equals("e")) ){
                 String[] inputs=input.split(" ");
                 aa=inputs[0];
                 bb=inputs[1];
                 memo.Remember(i,aa,bb);
                 i+=1;

                 System.out.println("次の単語と意味を入力してください。\"e\"で終了します。");
             }

         }

         memo.Recall();

         System.out.println(i+"件登録しました。");












    }
}
