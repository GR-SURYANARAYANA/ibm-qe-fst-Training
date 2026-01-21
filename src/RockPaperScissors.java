import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name : ");

        while(true){
            Random rand = new Random();
            int compGuess = rand.nextInt(1,4);
            System.out.println("""
                    ____________________
                         choose one
                    1. Rock
                    2. Paper
                    3. Scissors
                    _____________________
                    Enter your choice :
                    """);
            int playerChocie = in.nextInt();
            System.out.println(result(compGuess,playerChocie));
            if(compGuess == playerChocie){
                System.out.println("Game is draw....!!");
            }else{
                if((compGuess == 2 && playerChocie == 1)    || (compGuess == 3 && playerChocie== 2) || (compGuess== 1 && playerChocie == 3)){
                    System.out.println("Computer wins the game");
                }else{
                    System.out.println("Player wins the game");
                }
            }
            System.out.println("Do you want to COntinue (Yes or no)");
            String toContinue = in.next();
            if(toContinue.contentEquals("no")){
                System.out.println("Thanks for playing");
                break;
            }
        }

    }

    static String result(int comp,int player){
        return "Computer(" + choice(comp) + ") v/s Player(" + choice(player) + ")";
    }

    static String choice(int n){
        return switch (n){
            case 1 -> "Rock";
            case 2 -> "Scissor";
            case 3 -> "Paper";
            default -> "None";
        };
    }

}
