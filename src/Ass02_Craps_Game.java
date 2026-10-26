import java.util.Scanner;

public class Ass02_Craps_Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again = "y";

        while (again.equals("y")) {
            int die1 = (int) (Math.random()* 6) + 1;
            int die2 = (int) (Math.random()* 6) + 1;
            int sum = die1 + die2;
            System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You lose.");
            } else if (sum == 7 || sum == 11) {
                System.out.println("Natural! You Win.");
            } else {
                int point = sum;
                System.out.println("Your point is " + point);

                while (sum != 7) {
                    die1 = (int) (Math.random() *6) + 1;
                    die2 = (int) (Math.random() *6) + 1;
                    sum = die1 + die2;
                    System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);

                    if (sum == point) {
                        System.out.println("Made point and won");
                        sum = 7;
                    } else if (sum == 7) {
                        System.out.println("Got a 7 and lost ");
                    } else {
                        System.out.println("Trying to get a point");
                    }
                }
            }

            System.out.println("Play Again? (y/n)");
            again = input.nextLine();
            System.out.println();
        }
    }
}
