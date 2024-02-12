import java.util.Random;
import java.util.Scanner;
public class rockpaperseaser {
    public static void main(String args[]){
        System.out.println("hey! buddy lest play the game ");
        System.out.println("choose \n\t1 for stone && chose \n\t2 for paper && choose\n \t3 for scissor");
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        System.err.println("its your turn");
        int user_input = sc.nextInt();
        switch (user_input) {
            case 1-> System.out.println("you select stone");
            case 2-> System.out.println("you select paper");
            case 3-> System.out.println("you select scissor");
        }
        System.out.println("its computer turn");
        int computer_input = ra.nextInt(3);
        switch (computer_input) {
            case 1-> System.out.println("computer select stone");
            case 2-> System.out.println("computer select paper");
            case 3-> System.out.println("computer select scissor");
        }
        if (user_input == computer_input) {
            System.out.println("thise match is draw");
        }
            else if (user_input==2 && computer_input==1 || user_input == 3 && computer_input==2 || user_input==1 && computer_input==3) {
                System.out.println("yey! ritesh won the game");
            }
            else   {
                System.out.println("you loose! better luck next time");
            }
            
        }
    }
    