//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //guess the random number
        Scanner sc = new Scanner(System.in);
        int number = (int)(Math.random()*100);
        int user_num=0;

        do{
            System.out.println("Guess the number(1-100): ");
            user_num = sc.nextInt();

            if(user_num == number){
                System.out.println("You guessed it right!!");
                break;
            }
            else if(user_num > number){
                System.out.println("Guess a smaller number");
            }
            else{
                System.out.println("Guess a larger number");
            }
        }while(user_num >= 0);
        System.out.print("The number I entered was:");
        System.out.println(number);
    }
}