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
        System.out.print(words);

        
        words= words.isWordChain();
        System.out.print(words);

    }
}