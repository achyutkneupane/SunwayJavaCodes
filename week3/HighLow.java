import java.util.Scanner;

/**
 * HighLow
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Write a program HighLow.java that implements a simple guessing
 * game High and Low. The program selects a random number between
 * 1 to 100. The player then tries to guess its value. After each,
 * the program gives a hint “higher” or “lower”. The program is
 * terminated after 10 guesses with a suitable comment.
 * 
 * @description
 * This class `HighLow` is used to implement a simple guessing
 * game High and Low. It has a method higherOrLower() which
 * returns the hint “Higher!” or “Lower!”. It has a method
 * `guess()` which asks the user to guess the number and
 * returns the hint. This method also checks whether the
 * user completed 10 guesses or not. If the user completed
 * 10 guesses, it prints a suitable comment. If the user
 * guesses the number, it prints a suitable comment along
 * with the number of guesses and the correct number.
 */
public class HighLow {
    int correct;
    HighLow() {
        this.correct = (int) (Math.random() * 100) + 1;
    }
    public String higherOrLower(int guess) {
        if(guess > this.correct) {
            return "Lower!";
        }
        else {
            return "Higher!";
        }
    }
    public void guess() {
        Scanner scan = new Scanner(System.in);
        int guess = 0;
        int count = 0;
        while(count < 10) {
            System.out.println("Enter your guess "+ ++count +":");
            guess = scan.nextInt();
            if(guess == this.correct) {
                System.out.println("Correct after only "+count+" guesses – brilliant!!");
                break;
            }
            System.out.println(this.higherOrLower(guess));
            if(count == 10) System.out.println("Sorry! You lost.");
        }
        scan.close();
    }
    public static void main(String[] args) {
        System.out.println("Guess the number between 1 to 100!");
        HighLow game = new HighLow();
        game.guess();
        System.out.println("The correct number was: "+game.correct);
    }
}