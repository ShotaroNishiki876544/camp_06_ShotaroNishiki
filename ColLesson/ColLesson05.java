package ColLesson;

import java.util.Scanner;

public class ColLesson05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Word6[] words=new Word6[10];

        String input="aaa";
        int n=0;
        System.out.println("分からなかった単語とその意味をスペースを区切って入力してください。");
        while( !(input.equals("e")) ) {

            input=scanner.nextLine();

            if(n==10||input.equals("e")){
                break;
            }


            String[] b=input.split(" ");
            words[n]= new Word6(b[0],b[1]);
            n+=1;

            System.out.print("次の単語と意味を入力してください");
            System.out.println("\"e\"で終了します");


        }


        for(int i=0;i<n;i++){
            System.out.print(words[i].word);
            System.out.print(" aaaaa");
            System.out.println(words[i].meaning);

        }
        System.out.println(n+"件登録されました。");

















    }
}
