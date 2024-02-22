import java.util.Random;  // 10/10
import java.util.Scanner;
public class RPS{


    static void checkChoice(int value, String player){
        switch (value) {
            case 1:
                System.out.println(player +" choice : Rock");
                break;
            case 2:
                System.out.println(player +" choice : Paper");
                break;
            case 3:
                System.out.println(player +" choice : Scissor");
                break;
        
            default:
                break;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        //  Rock = 1;
        //  Paper = 2;
        //  Scisors = 3;
        
        int user_count = 0; 
        int machine_count = 0; 
        int user_input;
        int rand;


        for (int i = 0; i < 5; i++) {
            rand = new Random().nextInt(3)+1;
            // System.out.println(rand);

            
            
            System.out.println("\n");
            System.out.println("Enter 1,2,3 for Rock, Paper, Scisors Respectively");
            
            user_input = sc.nextInt();
            
            checkChoice(user_input,"User");
            checkChoice(rand,"machine");
            if (user_input == 1 && rand ==2) {
                System.out.println("User loss machine won");
                machine_count = machine_count +1;
                
            }
            
            else if (user_input == 2 && rand == 3) {
                System.out.println("User loss machine won");
                machine_count = machine_count +1;
                
            }
            
            else if (user_input == 3 && rand == 1) {
                System.out.println("User loss machine won");
                machine_count = machine_count +1;
                
            }

            else if (user_input==rand) {
                System.out.println("Draw");
            }
            else{
                System.out.println("User won machine loss");
                user_count = user_count + 1;
            }

            System.out.println("User score : "+user_count);
            System.out.println("Machine score : "+machine_count);
            System.out.println("\n");

        }

        if (user_count > machine_count) {
            System.out.println("User Won the series");
        }

        if (user_count < machine_count) {
            System.out.println("Machine Won the series");
        }
        if (user_count == machine_count) {
            System.out.println("Series was tie");
        }
        


        // System.out.println(user_input);
        sc.close();
    }    
}
