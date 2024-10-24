import java.util.ArrayList;
public class Main
{
    public static void main (String[]args)
    {
        WordChecker w = new WordChecker();
        //System.out.print(w);
        ArrayList<String>words=new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        System.out.println(words);

        
        WordChecker x= new WordChecker(words);
        System.out.println(x.isWordChain());
        
        ArrayList<String>newWords=new ArrayList<String>();
        newWords.add("catch");
        newWords.add("bobcat");
        newWords.add("catchacat");
        newWords.add("cat");
        newWords.add("at");
        System.out.println(newWords);
        
        WordChecker y=new WordChecker(newWords);
        System.out.println(y.createList("cat"));



        //["catch", "bobcat", "catchacat", "cat", "at"]
    }
}
