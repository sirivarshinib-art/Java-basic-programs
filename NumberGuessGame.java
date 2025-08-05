import java.util.Scanner;

public class NumberGuessGame{
    public static void guessNumber(){
        Scanner sc = new Scanner(System.in);

        int number = 1 +(int)(100*Math.random()); // to print from 1-100
        int a = 7;

        System.out.println("Guess the number. You've "+ a+ " attempts to guess correctly.");

        for(int i = 0; i<a; i++){
            System.out.println("Enter your guess");
            int guess = sc.nextInt();

            if (guess == number){
                System.out.println("Yay! You guessed it!!!");
                sc.close();
                return;
            }
            else if (guess < number){
                System.out.println("The number is greater than " + guess);
            }
            else{
                System.out.println("The number is less than " + guess);
            }
        }
        System.out.println("You've completed all your attempts, the correct ans was " + number);
        sc.close();
    }
    public static void main (String[] args) {
        guessNumber();
    }
}