/**
 * Created by jc431075 on 31/08/17.
 */
public class CountMovieSpaces {
    public static void main(String[] args)
    {
        String myFavQuote = "Oh hi Mark!";
        int numSpaces = 0;
        int quoteLength = myFavQuote.length();
        for (int i = 0; i < quoteLength; i++){
            if (myFavQuote == " "){
                numSpaces++;
                i++;
            }
        }

    }


}
