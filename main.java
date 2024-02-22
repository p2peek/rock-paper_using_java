import java.util.Random;
import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Rock = 1;
        int Paper = 2;
        int Scisors = 3;
        int user_count = 0; 
        int machine_count = 0; 
        int user_input;
        int rand;
        for (int i = 0; i < 4; i++) {
            rand = new Random().nextInt(3)+1;
            // System.out.println(rand);
            System.out.println("Enter 1,2,3 for Rock, Paper, Scisors Respectively");
            user_input = sc.nextInt();
            if (user_input == 1 && rand ==2) {
                System.out.println("User loss machine won");
                machine_count = machine_count +1;
                continue;
            }
            if (user_input == 2 && rand == 3) {
                System.out.println("User loss machine won");
                machine_count = machine_count +1;
                continue;
            }
            if (user_input == 3 && rand == 1) {
                System.out.println("User loss machine won");
                machine_count = machine_count +1;
                continue;
            }
            if (user_input==rand) {
                System.out.println("Draw");
            }
            else{
                System.out.println("User won machine loss");
                user_count = user_count + 1;
            }
        }

        if (user_count > machine_count) {
            System.out.println("User Won the series");
        }

        if (user_count < machine_count) {
            System.out.println("Machine Won the series");
        }
        if (user_count == machine_count) {
            System.out.println("Final match was tie");
        }
        
        // System.out.println(user_input);
        sc.close();
    }    
}