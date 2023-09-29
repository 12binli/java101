import java.util.*;

class Main {

    public static String LetterCapitalize(String str) {
        String[] words = str.split(" ");

        for (int i = 0; i< words.length; i++) {

            String firstLetter = words[i].substring(0,1);
            String restOfWord = words[i].substring(1);

            firstLetter = firstLetter.toUpperCase();
            words[i] = firstLetter + restOfWord;

        }

        String capitalizedSentence = String.join(" ", words);

        return capitalizedSentence;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCapitalize(s.nextLine()));
    }

}