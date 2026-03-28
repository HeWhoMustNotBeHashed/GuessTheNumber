import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {

    static int guess = 0;
    static int number = 0;
    static int score = 7;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("--------------Welcome to Guess The Number!------------");
        System.out.println("Generating a random number between 0-100...");
        guess();
        for(int i = 0; i<100; i++){
            double fake = Math.random()*100;
            System.out.print(fake+"\r");
            Thread.sleep(50);
        }
        while(score>0) {
            System.out.println("Enter your Guess:");
            input();
            if(guess>number){
                System.out.println("Your guess exceeds the number. Try again! (Remaining Tries:"+(score-1));
                score--;
            }
            else if(guess<number){
                System.out.println("Your guess is less than the number. Try again! (Remaining Tries:"+(score-1)+")");
                score--;
            }
            else {
                System.out.println("You Found the Number! Congrats!");
                System.out.println("The Games Have Ended!");
                System.exit(0);
            }
        }


        System.out.println("Whoops! Out of tries. The number was: "+number+"\nBetter luck next time!");



    }

    public static void input(){
        Scanner ac = new Scanner (System.in);
        guess = ac.nextInt();
    }

    public static void guess(){
        Random rand = new Random();
        number = rand.nextInt(100);
    }

}
