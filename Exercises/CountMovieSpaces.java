import javax.swing.*;

/**
 * Created by jc431075 on 31/08/17.
 */
public class CountMovieSpaces {
    public static void main(String[] args)
    {
        String myFavQuote = getUserInput();
        int numSpaces = 0;
        char secretChar = ' ';
        int quoteLength = myFavQuote.length();
        for (int i = 0; i < quoteLength; i++){
            if (myFavQuote.charAt(i) == secretChar)
            {
                numSpaces++;
                i++;
            }

        }
        System.out.println("NUMBER OF SPACES IN '" + myFavQuote + "' IS: " + numSpaces);

    }
    public static String getUserInput()
    {
        String usersQuote = JOptionPane.showInputDialog(null, "whats ya fav quote mate?");
        return usersQuote;
    }


}
