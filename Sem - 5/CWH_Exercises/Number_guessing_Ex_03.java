import java.util.Random;
import java.util.Scanner;
class Game{
    int random_num;
    int NoOfGuesses;
    public int get_rn(){return random_num;}
    Game(){
        Random random = new Random();
        random_num = random.nextInt(100);
        NoOfGuesses = 5;
    }

    public int takeuserinput(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Guess a number : ");
        int a = s1.nextInt();
        s1.close();
        return a;

    } 

    public boolean correctnumber(int number){
        return number == this.get_rn() ? true : false;
    }

    public void set_Noofguesses(int num){
        NoOfGuesses = num;
    }

    public int getNoofguesses(){
        return NoOfGuesses;
    }

}

public class Number_guessing_Ex_03 {
    public static void main(String args[]) {
        int user_input;
        int number_of_guesses = 0;
        System.out.println("\n\n\nHi, this game is developed by Raj Shah.\nThis is a number guessing game in which coputer will generate a random number and you will get 5 chances to guess the correct number.\nYou can even change the number of chances  available but not during the game.\nHave fun !!!");
        Game g1 = new Game();
        System.out.println(g1.get_rn());
        while(true){
            user_input = g1.takeuserinput();
            if(g1.correctnumber(user_input)){
                number_of_guesses++;
                System.out.println("Wow human, you turned out to be smarter than I expected.\nYou win !!!\nGuesses taken : "+number_of_guesses);
                break;
            }
            else{
                number_of_guesses++;
                if(number_of_guesses < g1.getNoofguesses()){
                    System.out.println(g1.get_rn() > user_input ? "Random number is greater." : "Random nummber is smaller.");
                    System.out.println("No of guesses taken : "+ number_of_guesses);
                    System.out.println("No of guesses left : " + (g1.getNoofguesses() - number_of_guesses));
                    System.out.println("Try again, try better..");}
                else
                {
                    System.out.println("You are out of guesses.\nTry beeter, next time. You smelly human !!");
                    System.out.println("Computer wins !!");
                    break;
                }
            }
        }
    } 
}