import java.util.Random;
import java.util.Scanner;

public class Hangman1 {

    public static void main ( String[] args ) {

        int mistakes = 0;
        String userGuess = null;
        int tries = 15;
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String lettersGuessed = null;
        String lettersWrong = null;
        String lettersRight = null;
        String[] words = {"banana","strawberry","pineapple","raspberries","grapes"};
        Random generator  = new Random();
        int choice = generator.nextInt(words.length);
        String secretWord = words[choice];
        System.out.println(secretWord);

        System.out.println("Welcome to Hangman.");
        System.out.println("Guess a letter:");
        userGuess = keyboard.nextLine();

        lettersGuessed += userGuess;

        if(secretWord.indexOf(userGuess)>=0){
            lettersRight += userGuess;
        } else {
            lettersWrong += userGuess;
        }
        displayBoard(mistakes);
        for ( int i = 0 ; i < secretWord.length() ; i++ ) {
            System.out.print("_ ");
        }


    }  // main - End

    public static void displayBoard(int mistakes) {
        switch (mistakes) {

            case 0:
                System.out.println(
                                "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "_______________________________");

                break;
            case 1:
                System.out.println(
                                "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 o                 \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "_______________________________");

                break;
            case 2:
                System.out.println(
                                "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 o                 \n" +
                                "|                 |                 \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "_______________________________");

                break;
            case 3:
                System.out.println(
                                "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 O                 \n" +
                                "|                 |>                \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "_______________________________");

                break;
            case 4:
                System.out.println(
                                "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 O                 \n" +
                                "|                <|>                \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "_______________________________");

                break;
            case 5:
                System.out.println(
                                "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 O                 \n" +
                                "|                <|>                \n" +
                                "|                 |                 \n" +
                                "|                                   \n" +
                                "|                                   \n" +
                                "_______________________________");

                break;
            case 6:
                System.out.println(
                                "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 o                 \n" +
                                "|                <|>                \n" +
                                "|                 |                 \n" +
                                "|                  -                 \n" +
                                "|                                   \n" +
                                "_______________________________");

                break;
            case 7:
                System.out.println(
                                "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 o                 \n" +
                                "|                <|>                \n" +
                                "|                 |                 \n" +
                                "|                - -              \n" +
                                "|                                   \n" +
                                "_______________________________");

                break;
            case 8:
                System.out.println(
                                "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 o                 \n" +
                                "|                <|>                \n" +
                                "|                 |                 \n" +
                                "|                - -              \n" +
                                "|               (                   \n" +
                                "_______________________________");

                break;
            case 9:
                System.out.println(
                                "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 o                 \n" +
                                "|                <|>                \n" +
                                "|                 |                 \n" +
                                "|                - -            \n" +
                                "|               (   )                 \n" +
                                "_______________________________");

                break;
            case 10:
                System.out.println(
                                "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 o                 \n" +
                                "|                <|>                \n" +
                                "|                 |                 \n" +
                                "|                - -                \n" +
                                "|               (   )_              \n" +
                                "_______________________________");

                break;
            case 11:
                System.out.println(
                                "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 o                 \n" +
                                "|                <|>                \n" +
                                "|                 |                 \n" +
                                "|                - -                \n" +
                                "|              _(   )_              \n" +
                                "_______________________________");

                break;
            case 12:
                System.out.println(
                                "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 o.                \n" +
                                "|                <|>                \n" +
                                "|                 |                 \n" +
                                "|                - -                \n" +
                                "|              _(   )_              \n" +
                                "_______________________________");

                break;
            case 13:
                System.out.println(
                                "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                .o.                \n" +
                                "|                <|>                \n" +
                                "|                 |                 \n" +
                                "|                - -                \n" +
                                "|              _(   )_              \n" +
                                "_______________________________");

                break;
            case 14:
                System.out.println(
                                "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                .o.                \n" +
                                "|                <|>                \n" +
                                "|                 |                 \n" +
                                "|                - -                \n" +
                                "|             *_(   )_              \n" +
                                "_______________________________");

                break;
            case 15:
                System.out.println(
                                "------------------+                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                 |                 \n" +
                                "|                .o.                \n" +
                                "|                <|>                \n" +
                                "|                 |                 \n" +
                                "|                - -                \n" +
                                "|             *_(   )_*             \n" +
                                "_______________________________");

                break;


        }  // Switch End

    }

}  // Hangman - End
