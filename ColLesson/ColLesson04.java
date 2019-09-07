package ColLesson;


public class ColLesson04 {
    public static void main(String[] args) {

        Word3 memo=new Word3();

        System.out.println("分からなかった単語とその意味をスペースを区切って入力してください。");
        memo.Remember();

        memo.Recall();

        System.out.println(memo.number+"件登録しました。");






    }
}
