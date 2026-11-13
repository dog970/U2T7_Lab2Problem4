import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number do you want to factorial? ");
        System.out.print("Enter a number between 0 and 170: ");
        double userNumber = scanner.nextDouble();
        while (!(userNumber>=0 && userNumber<=170)) {
            System.out.print ("That is not between 0 and 170, try again:");
            userNumber = scanner.nextInt();
        }
        double count = userNumber;
        double permanent = userNumber;
        if (userNumber==0) {
            System.out.println (1);
            count = -2;
        }
        int fi = 1;
        while (count >= 1 && fi<permanent) {
            userNumber = userNumber * (permanent-fi);
            count--;
            fi++;
        }
        if (permanent != 0){
            System.out.println (userNumber);
        }
    }
}
